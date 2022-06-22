package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student implements StudentInfo{
    private int id;
    private String name;
    private String ph;
    @Autowired
    private Address add;

    public Student(Address add) {
        this.id = StudentInfo.id;
        this.name = StudentInfo.name;
        this.ph = StudentInfo.ph;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph='" + ph + '\'' +
                ", add=" + add +
                '}';
    }
}
