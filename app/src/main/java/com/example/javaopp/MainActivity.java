package com.example.javaopp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Dog dog = new Dog();
    dog.talk();

    Wolf akella = new Wolf();
    akella.talk();

    Dog wolf = new Wolf();
    wolf.talk();

    Dog robin = new Fox();
    robin.talk();
    }
}

