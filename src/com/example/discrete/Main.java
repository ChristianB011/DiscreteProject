package com.example.discrete;

import java.util.Scanner;

public class Main {

  public static int factorial(int n){
    if(n == 1){
      return n;
    } else {
      return n * factorial(n-1);
    }
  }

  public static void displayMenu(){

  }

  public static void main(String[] args) {
    char choice;
    Scanner scan = new Scanner(System.in);

    displayMenu();
    try {
      choice = (char)System.in.read();
    } catch (Exception e){
      
    }
  }
}
