package com.example.javaopp;

import android.util.Log;

//Inner class
//Static inner class
//Local class
//Anonymous class

public abstract class Dog extends Animal {
    private int age;
    String name;
    final static int numberOfLegs = 4;
    static int count = 0;

    String helloText;
    DogMood dogMood;

    static class CountResetter {
        boolean moreThan100;

        CountResetter() {
            if (Dog.count > 5) {
                moreThan100 = true;
            }
            if (moreThan100) {
                resetCount(0);
            }
        }

        void resetCount(int value) {
            Dog.count = value;
        }
    }

    private class DogMood {
        int levelOfMood;

        DogMood() {
            if (Dog.this.age < 5) {
                levelOfMood = 100;
            } else if (Dog.this.age >= 5 && Dog.this.age < 7) {
                levelOfMood = 50;
            } else if (Dog.this.age >= 7) {
                levelOfMood = 20;
            }
        }
    }

    public Dog() {
        count++;
        this.name = "John Doe";
        this.age = 1;

        dogMood = new DogMood();

        switch (dogMood.levelOfMood) {
            case 100:
                helloText = "Woof! I'm happy dog :3 My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
            case 50:
                helloText = "Woof! I'm dog. My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
            case 20:
                helloText = "Woof! I'm old and sick dog :( My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
        }
    }

    public Dog(int age, String name) {
        count++;
        this.age = age;
        this.name = name;

        dogMood = new DogMood();

        switch (dogMood.levelOfMood) {
            case 100:
                helloText = "Woof! I'm happy dog :3 My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
            case 50:
                helloText = "Woof! I'm dog. My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
            case 20:
                helloText = "Woof! I'm old and sick dog :( My name is " + name +
                        ", and I'm " + age + " years old.";
                break;
        }
    }

    public void talk() {
        Log.i("talk()", helloText);

    }

    public void talk(int age) {
        Log.i("talk()", "Woof! " +
                "I'm " + age + " years old.");
    }

    public void talk(String name) {
        Log.i("talk()", "Woof! My name is " + name);
    }

    public static String whatDogsLike() {
        return " I like playing,jumping and eating some meat";
    }

    public void catchCat(int catWeight) {
        class Cat {
            String color;
            int weight;

            public Cat(String color, int weight) {
                this.color = color;
                this.weight = weight;
            }

            String catVoice() {
                return "Meow!";
            }
        }
        Cat cat = new Cat("White", catWeight);

        if (cat.weight < 2) {
            Log.i("dog say", "I will break you! " + cat.catVoice());
        } else {
            Log.i("dog say", "I am afraid of you!");
        }
    }
}