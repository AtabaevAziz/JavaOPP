package com.example.javaopp;

import android.util.Log;

public class Fox extends Dog {
    public void talk() {
        Log.i("talk()", "R-ruff! I'm a fox My name is " + name +
                ", and I'm " + age + " years old");
    }
}
