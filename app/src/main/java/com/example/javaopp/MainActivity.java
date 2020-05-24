package com.example.javaopp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements Printable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Fox();
        dog.talk();

        Printable printable = new Wolf();
        printable.print();;
        ((Wolf) printable).move();

        Wolf wolf = new Wolf();
        Log.i("speedOfMoving", "" + wolf.speedOfMoving);

        Log.i("speedOfMoving", "" + ((Wolf) printable).speedOfMoving);

        Log.i("speedOfMoving", "" + Movable.speedOfMoving);

    }

    void printAnyObject(Printable printable) {
    }
    void printAnyObject(Wolf wolf) {
    }

    @Override
    public void print() {

    }
}