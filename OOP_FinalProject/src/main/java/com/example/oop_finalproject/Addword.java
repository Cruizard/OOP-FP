package com.example.oop_finalproject;

import java.util.*;

public class Addword
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
    }

}
