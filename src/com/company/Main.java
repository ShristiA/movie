package com.company;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();
        String userInput = " ";
        do{
            System.out.println("Enter movie or q to quit");
            userInput = in.next();
            if(!userInput .equalsIgnoreCase("q")) {
                movies.add(userInput);
            }

        }while(!userInput .equalsIgnoreCase("Q"));
        Collections.sort(movies);

        for(String s : movies){
            System.out.println(s);
        }

        Random rand = new Random();
        int x = rand.nextInt(movies.size()-1);
        String movieToWatch = movies.get(x);

        System.out.println("you should watch"+ movieToWatch);
    }
}
