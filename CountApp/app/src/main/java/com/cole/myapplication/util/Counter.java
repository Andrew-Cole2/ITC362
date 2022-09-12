package com.cole.myapplication.util;

import java.text.ParseException;
import java.util.Observable;

public class Counter {
    private Integer number;

    public Counter (String startingVal) {
        try {
            setNumber(Integer.parseInt(startingVal));
        } catch(Exception e) {
            setNumber(0);
        }
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String increment() {
        number++;
        return number.toString();
    }

}
