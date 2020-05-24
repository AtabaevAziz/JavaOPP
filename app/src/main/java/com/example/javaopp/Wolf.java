package com.example.javaopp;

import android.util.Log;

public class Wolf extends Dog implements Movable, Printable {

    private String wolfHelloText;

    @Override
    public void draw() {
        Log.i("draw()", "Draw wolf");
    }

//    @Override
//    public void move() {
//        Log.i("move()", "Move wolf");
//    }

    @Override
    public void print() {
        Log.i("print()", "Print wolf");

    }
}