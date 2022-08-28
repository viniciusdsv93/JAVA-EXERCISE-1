package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("How many numbers are you going to inform? ");
    int numbers = sc.nextInt();

    int[] vect = new int[numbers];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Enter a number: ");
      vect[i] = sc.nextInt();
    }

    System.out.println("NEGATIVE NUMBERS:");

    for (int i = 0; i < vect.length; i++) {
      if (vect[i] < 0) System.out.println(vect[i]);
    }

    sc.close();
  }
}