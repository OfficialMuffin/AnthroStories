package com.anthrostories;

import java.util.Random;
import java.util.Scanner;

public class Story_1 {
    public static void main(String[] args) {
        System.out.println("Welcome to OfficialMuffin's story! Sit back, relax and Enjoy :)");
        Random rand = new Random();

        //Get random character names and sex
        String[] sex = {"male", "female"};
        int randSexOfCharacter = rand.nextInt(sex.length);
        String randSex = sex[randSexOfCharacter];

        String[] characters = {"Husky", "Cat", "Wolf"};
        int randCharacterType = rand.nextInt(characters.length);
        String randCharacter = characters[randCharacterType];

        String[] personality= {"hot", "adorable", "obnoxious"};
        int randCharPersonality = rand.nextInt(personality.length);
        String randpersonality = personality[randCharPersonality];




        //Get random age between 18 and 25
        int min = 18;
        int max = 25;
        int age = rand.nextInt(max - min + 1) + min;


        //Add items to pick up
        int numberOfItems = 0;
        int maxInventorySpace = 50;

        String[] foodItems = {"Sandwich", "Crisps", "Chocolate Bar", "Muffin"};
        int food = rand.nextInt(foodItems.length);
        String randFood = foodItems[food];

        String[] miscItems = {"Book", "Piece of Paper", "Note"};
        int item = rand.nextInt(foodItems.length);
        String randItem = miscItems[item];



        //Start of Game
        Scanner name = new Scanner(System.in);
        System.out.println("First of all, What is your name?: ");
        String userName = name.nextLine();
        try {
            //Introduction
            //Random character type fix!!!
            System.out.println("You are a " + randCharacter);
            System.out.print("One day there was a " + randSex + " " + randCharacter + " named " + userName);
            Thread.sleep(2000);
            System.out.print("\n");

            System.out.print("You are "  + age + " years old and ");
            Thread.sleep(1000);
            System.out.print("living with your mother.");
            Thread.sleep(2000);
            System.out.print("\n");

            System.out.print("You have one " + randpersonality + " sister named ");
            Thread.sleep(1000);
            System.out.print("Hollie.");
            Thread.sleep(2000);
            System.out.print("\n");

            System.out.print("You are on your final year at college ");
            Thread.sleep(1000);
            System.out.print("and ready to explore the outside world.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            return;
        }



        boolean running = true;

        while (running) {
            try {
                //Get users input to steer the course of the story
                Scanner input = new Scanner(System.in);

                //Introduction
                Thread.sleep(3000);
                System.out.print("\n");

                //Game Start
                //Choose a place to go
                System.out.println("###############################");
                System.out.println("Where do you want to go next?: ");
                System.out.println("1. Bedroom");
                System.out.println("2. Kitchen");
                System.out.println("3. Garden");
                System.out.println("4. Sister's Room");
                System.out.println("###############################");

                String place = input.nextLine();
                if (place.equals("1")) {
                    System.out.println("'Ughh, my bedroom is a mess. I really need to clean up.'");
                    continue;
                }
                else if (place.equals("2")) {
                    System.out.println("Im feeling quite hungry. What's for snack? *Looks in the fridge*");
                    Thread.sleep(2500);
                    //Get item from fridge
                    System.out.println("Ill take this!");
                    System.out.println("You get a " + randFood);
                    numberOfItems++;
                    maxInventorySpace--;
                    continue;
                }
                else if (place.equals("3")) {
                    System.out.println("*takes a deep breath* Ahhh, what a beautiful day!");
                    Thread.sleep(1000);
                    System.out.println("*Birds chirp nearby*");
                    System.out.println("You find a " + randItem);
                    numberOfItems++;
                    maxInventorySpace--;
                    continue;
                }
                else if (place.equals("4")) {
                    System.out.println("*Sister shouts at you* GET OUT! NO BOYS ALLOWED!");
                    Thread.sleep(2000);
                    System.out.println("*You say to yourself* Ok, Ok, Jeeze! No need to be a bitch about it.");
                    Thread.sleep(2000);
                    System.out.println("*You walk away from her room*");
                    Thread.sleep(2000);
                    System.out.println("*Your mother walks by and says* " + userName + ", why haven't you cleaned your room yet?");
                    Thread.sleep(2000);
                    System.out.println("################");
                    System.out.println("What do you want to say?: ");
                    System.out.println("1. I had other stuff to do.");
                    System.out.println("2. You do it!");
                    System.out.println("3. Sorry mum, I'll do it now.");
                    System.out.println("################");

                    Scanner say = new Scanner(System.in);
                    String reply = say.nextLine();
                    if (reply.equals("1")) {
                        System.out.println("*Your mum replies* Well that's no excuse. Go and do it now!");
                    }
                    else if (reply.equals("2")) {
                        System.out.println("*Your mum shouts* That's no way to speak to your mother! Go to your room!");
                    }
                    else if (reply.equals("3")) {
                        System.out.println("*Your mother replies* Good, when you've done that, do your homework, ok?");
                    }
                    else {
                        System.out.println("Invalid input! Please choose from the following options: ");
                    }
                }
                else {
                    System.out.println("Invalid input! Please choose from the following options: ");
                    //continue;
                }
            } catch (InterruptedException e) {
                System.out.println();
            }
        }
    }
}

