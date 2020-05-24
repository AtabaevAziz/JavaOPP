package com.example.javaopp;

import android.util.Log;

public interface Movable {

    int speedOfMoving =100;

    default void move() {
        Log.i("move()", "Move wolf");
    }
    static void someMethod() {
        Log.i("someMethod()", "someMethod wolf");
    }

}
