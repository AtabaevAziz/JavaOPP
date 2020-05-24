package com.example.javaopp;

import android.util.Log;

public abstract class Animal {
    int numberOfLegs;
    boolean isAlive;

    abstract public void draw();

    public void breathe() {
        Log.i("breathe()", "I can breathe");
    }
}
