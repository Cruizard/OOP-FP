package com.example.oop_finalproject;

import java.util.ArrayList;

public class Library
{
    private ArrayList<String> wordlibrary = new ArrayList<>();

    public ArrayList<String> Getwords()
    {
        return wordlibrary;
    }

    public void addwerd(String word){wordlibrary.add(word);}

    public Library ()
    {
        wordlibrary.add("Test");
        wordlibrary.add("Summit");
        wordlibrary.add("Try and type me");
        wordlibrary.add("Oh ma gah");
        wordlibrary.add("Final practicum go brr");
        wordlibrary.add("Weeee");
        wordlibrary.add("Don't get in my way!");
        wordlibrary.add("Let's try");
    }
}
