package com.example.oop_finalproject;

import java.util.Collections;
import java.util.Scanner;

//run here bcs GUI not properly implemented
public class Game
{
    public static void main(String[] args)
    {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        System.out.println("Enter words you wish to add to the pre given library before we begin (end by typing stop): ");
        while (i==1)
        {
            String werd = sc.nextLine(); // Input

            if (werd .equals("stop"))
            {
                break;
            }
            lib.addword(werd);
        }
        Collections.shuffle(lib.Getwords());//Polymorphism (list to arraylist)

        for (var werds: lib.Getwords())
        {
            System.out.println("Please type: ");
            System.out.println(werds); // Output

            String answer = sc.nextLine();

//            String[] answers = werds.split(" ");
//            String[] input = answer.split(" ");
//            for (int j=0 ; j<answers.length ; j++)
            
            if (werds .equals(answer))
            {
                printresult(true);
            }
            else
            {
                printresult("Massive L there big man");
            }


        }


    }
    public static void printresult(boolean yes)//overloading
    {
        if (yes)
        {
            System.out.println("Based");
        }
        else
        {
            System.out.println("Massive L there big man");
        }
    }
    public static void printresult(String result)
    {
        System.out.println(result);
    }
}
