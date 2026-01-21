package com.TrainingDay3;

import java.io.Serializable;

public class Q3_Address implements Serializable{
	private String city;
    private String state;

    public Q3_Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}
