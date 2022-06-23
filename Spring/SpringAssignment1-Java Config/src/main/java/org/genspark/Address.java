package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Address implements StudentInfo{
    private String city;
    private String state;
    private String country;
    private String zipcode;

    @Autowired
    public Address() {
        this.city = StudentInfo.city;
        this.state = StudentInfo.state;
        this.country = StudentInfo.country;
        this.zipcode = StudentInfo.zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
