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

            System.out.println("You are a " + randCharacter);

            Thread.sleep(2000);

            String text = "One day there was a " + randSex + " " + randCharacter + " named " + userName + "\n" +
                                "You are " + age + " years old and living with your mother. \n" +
                                "You have one " + randpersonality + " sister named Hollie.\n"+
                                "You are on your final year at college and ready to explore the outside world.\n";

            slowPrint(text, 80);
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
                System.out.println("5. Check Inventory");
                System.out.println("###############################");

                String place = input.nextLine();
                if (place.equals("1")) {
                    String text = "'Ughh, my bedroom is a mess. I really need to clean up...'";
                    slowPrint(text, 100);
                    continue;
                }
                else if (place.equals("2")) {
                    String text = "Im feeling quite hungry. What's for snack? *Looks in the fridge*\n" +
                                    "I'll take this!\n";
                    slowPrint(text, 100);

                    Thread.sleep(1500);
                    //Get item from fridge
                    System.out.println("You get a " + randFood);
                    numberOfItems++;
                    maxInventorySpace--;
                    continue;
                }
                else if (place.equals("3")) {
                    String text = "*takes a deep breath* Ahhh, what a beautiful day!\n" +
                            "*Birds chirp nearby*\n";
                    slowPrint(text, 100);
                    Thread.sleep(1000);
                    System.out.println("You find a " + randItem);
                    numberOfItems++;
                    maxInventorySpace--;
                    continue;
                }
                else if (place.equals("4")) {
                    String text = "*Sister shouts at you* GET OUT! NO BOYS ALLOWED!\n" +
                            "*You say to yourself* Ok, Ok, Jeeze! No need to be a bitch about it.\n" +
                            "*You walk away from her room, sighing*\n" +
                            "*You think to yourself* I wish I could get along with her better\n" +
                            "*Your mother walks by and says* " + userName + ", why haven't you cleaned your room yet?\n";
                    slowPrint(text, 200);

                    Thread.sleep(3000);

                    System.out.println("################");
                    System.out.println("What do you want to say?: ");
                    System.out.println("1. I had other stuff to do.");
                    System.out.println("2. You do it!");
                    System.out.println("3. Sorry mum, I'll do it now.");
                    System.out.println("################");

                    Scanner say = new Scanner(System.in);
                    String reply = say.nextLine();
                        if (reply.equals("1")) {
                            String mumReply = "*Your mum replies* Well that's no excuse. Go and do it now!";
                            mumReplySlowPrint(mumReply, 100);
                        }
                        else if (reply.equals("2")) {
                            String mumReply = "*Your mum shouts* That's no way to speak to your mother! Go to your room!\n" +
                            "*You storm off to your room and slam your door in frustration.*";
                            mumReplySlowPrint(mumReply, 100);
                        }
                        else if (reply.equals("3")) {
                            String mumReply = "*Your mother replies* Good, when you've done that, do your homework, ok?";
                            mumReplySlowPrint(mumReply, 100);
                        }
                        else {
                            System.out.println("Invalid input! Please choose from the following options: ");
                        }

                } else if (place.equals("5")) {
                    System.out.println("Checking inventory...");

                    for(int i = 5; i > 0; i--) {
                        System.out.println(i);
                        Thread.sleep(500);
                    }
                    System.out.println("You have " + numberOfItems + " items in your inventory!");
                    Thread.sleep(500);
                    System.out.println("and");
                    Thread.sleep(500);
                    System.out.println("You have " + maxInventorySpace + " inventory space left!");
                    Thread.sleep(500);
                    System.out.println("To gain more inventory space, you'll need to find a backpack.");
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

    /**
     * Typewriter effect
     * @param text String to print
     * @param millisPerChar Number of milliseconds to print each char
     */
    public static void slowPrint(String text, long millisPerChar) {

        for (int i = 0; i < text.length(); i++) {

            System.out.print(text.charAt(i));

            try {
                Thread.sleep(millisPerChar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     *
     * @param mumReply Mothers Reply Text
     * @param mSecPerChar Milliseconds per Char
     */
    public static void mumReplySlowPrint(String mumReply, long mSecPerChar) {

        for (int i = 0; i < mumReply.length(); i++) {

            System.out.print(mumReply.charAt(i));

            try {
                Thread.sleep(mSecPerChar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

