package com.example.javaopp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Dog singingDog = new Dog() {
            @Override
            public void talk() {
                Log.i("talk", "I'm sining Who let the dogs out");
            }
        };
        singingDog.talk();

        Dog dog = new Dog();
        dog.talk();
    }
}
