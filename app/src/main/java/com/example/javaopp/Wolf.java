package com.example.javaopp;

import android.util.Log;

public class Wolf extends Dog {
    public void talk() {
        Log.i("talk()", "R-ruff! My name is " + name +
                ", and I'm " + age + " years old");
    }
}
