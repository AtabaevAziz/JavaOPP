package com.example.javaopp;

import android.util.Log;

public class Dog {
    int age;
    String name;

    public Dog() {

    }

    public void talk() {
        Log.i("talk()", "Woof! My name is " + name +
                ", and I'm " + age + "years old.");
    }

    public void initFields(int age, String name) {
        this.age = age;
        this.name = name;
    }
}