package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class removeVowels {
    public static void RemoveVowel(int inputNo, String arrOfPlaces[]){
        for (int i = 0; i <= inputNo; i++){
            arrOfPlaces[i] = arrOfPlaces[i].replace("a","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("e","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("i","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("o","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("u","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("A","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("E","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("I","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("O","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("U","");
            System.out.println(arrOfPlaces[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of input : ");
        int inputNo = sc.nextInt();
        String arrOfPlaces[] = new String[inputNo + 1];
        System.out.println("Enter the places : ");
        for (int i = 0; i <= inputNo; i++) {
            arrOfPlaces[i] = sc.nextLine();
        }
        RemoveVowel(inputNo, arrOfPlaces);
    }
}
