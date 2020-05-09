package com.example.javaopp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Dog myDog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDog = new Dog(4, "Rex");
        myDog.talk();

        Dog spike = new Dog(2, "Spike");
        spike.talk();
        spike.breathe();

        Dog chappi = new Dog();
        chappi.age = 2;
        chappi.name = "Chappi";
        chappi.numberOfLegs = 4;
        Log.i("numberOfLegs", String.valueOf(chappi.numberOfLegs));
        chappi.talk();

        Wolf wolf = new Wolf();

        wolf.breathe();
        wolf.talk();
        wolf.isAlive = true;
        wolf.name = "Akella";
        Log.i("isAlive", String.valueOf(wolf.numberOfLegs));
        Log.i("breathe()", "My name is " + wolf.name + " and " + wolf.breathe());

    }
}

