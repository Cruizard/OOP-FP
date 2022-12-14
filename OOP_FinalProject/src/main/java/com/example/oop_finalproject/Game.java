package com.example.oop_finalproject;

import java.util.Collections;
import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        System.out.println("Enter the words you wish to add to the library before we begin (end by typing stop): ");
        while (i==1)
        {
            String werd = sc.nextLine();

            if (werd .equals("stop"))
            {
                break;
            }
            lib.addwerd(werd);
        }
        Collections.shuffle(lib.Getwords());

        for (var werds: lib.Getwords())
        {
            System.out.println("Please type: ");
            System.out.println(werds);

            String answer = sc.nextLine();

//            String[] answers = werds.split(" ");
//            String[] input = answer.split(" ");
//            for (int j=0 ; j<answers.length ; j++)

            if (werds .equals(answer))
            {
                System.out.print("true min \n");
            }
            else
            {
                System.out.print("wrong min \n");
            }


        }


    }
}
