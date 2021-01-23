package com.academy.intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter name of your pet:");
                String str = sc.nextLine();

                System.out.println("Enter what your pet likes to do:");
                String str1 = sc.nextLine();

                System.out.println( "My pet name is" + " "+ str +"."+" "+ str +" likes"+" "+ str1 + ".");

            }

        }

