/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String noun;
        String verb;
        String adjective;
        String adverb;
        noun = scan.nextLine();
        verb = scan.nextLine();
        adjective = scan.nextLine();
        adverb = scan.nextLine();
        String madLib = "Berkay knows" + noun + "\ngoing to" + verb + "with the" + adjective + "\noutside going very" + adverb + "without any hesitation";
        System.out.println(madLib);
    }
}