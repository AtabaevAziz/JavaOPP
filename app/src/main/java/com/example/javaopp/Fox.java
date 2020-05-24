package com.example.javaopp;

import android.util.Log;

public class Fox extends Dog implements Printable{

    public Fox() {
        Log.i("constructor", "Constructor Fox()");
    }

    public static  String whatDogsLike() {
        return " I'm a fox and I like jumping and eating some meat";
    }

    @Override
    public void draw() {

    }

    @Override
    public void print() {

    }
}
