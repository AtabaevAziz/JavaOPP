package com.example.javaopp;

import android.util.Log;

public class Dog extends Animal {
    int age;
    String name;

    public Dog() {
        this.name = "John Doe";
        this.age = 1;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void talk() {
        Log.i("talk()", "Woof! My name is " + name +
                ", and I'm " + age + " years old.");

    }

    public void talk(int age) {
        Log.i("talk()", "Woof! " +
                "I'm " + age + " years old.");
    }

    public void talk(String name) {
        Log.i("talk()", "Woof! My name is " + name);
    }
}