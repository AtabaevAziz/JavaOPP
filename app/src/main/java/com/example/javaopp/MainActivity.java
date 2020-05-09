package com.example.javaopp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Dog myDog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDog = new Dog();
        myDog.initFields(2, "Gladstone");
        myDog.talk();

        Dog rex = new Dog();
        rex.initFields(3, "Rex");
        rex.talk();

        Dog chappi = new Dog();
        chappi.age = 2;
        chappi.name = "Chappi";
        chappi.talk();
    }
}

