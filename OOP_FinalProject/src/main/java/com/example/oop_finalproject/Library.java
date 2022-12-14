package com.example.oop_finalproject;

import java.util.ArrayList;

public class Library extends Abstract
{
    private ArrayList<String> wordlibrary = new ArrayList<>(); //Collection, ArrayList & Encapsulation

    public ArrayList<String> Getwords() // Encapsulation
    {
        return wordlibrary;
    }


    public Library ()
    {
        wordlibrary.add("Test");
        wordlibrary.add("Summit");
        wordlibrary.add("Try and get me");
        wordlibrary.add("Oh ma gah");
        wordlibrary.add("Final practicum go brr");
        wordlibrary.add("Weeee");
        wordlibrary.add("Don't get in my way!");
        wordlibrary.add("Let's try");
    }

    @Override
    public void addword(String word) {
        wordlibrary.add(word);
    }
}
