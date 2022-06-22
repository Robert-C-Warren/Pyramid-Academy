package org.genspark;

public class Student {
    private int id;
    private String name;
    private String ph;
    private Address add;

    public Student(int id, String name, String ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
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
