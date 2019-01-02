package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class consecutiveNumbers {

        public static boolean checkStatus(String numArr[]) {

            int startNum = Integer.parseInt(numArr[0]) - Integer.parseInt(numArr[1]);
            if (startNum > 0)
                return true;
            return false;
        }

        public static void checkconsecutiveNumbers(String numSeries, String numArr[]){
            if(numArr.length == 7){

                int flag=0, current, prev = Integer.parseInt(numArr[0]);

                if(checkStatus(numArr)){
                    for (int i = 1; i< numArr.length; i++){
                        if(numArr[i].matches("[0-9]+")){
                            current = Integer.parseInt(numArr[i]);
                            if(prev > current){
                                prev = current;
                            }
                            else{
                                System.out.println(numSeries + " non consecutive order");
                                flag = 1;
                                break;
                            }
                        }
                    }
                    if (flag == 0){
                        System.out.println(numSeries + " in consecutive order");
                    }
                }
                else if(!checkStatus(numArr)){
                    for (int i=1; i<numArr.length; i++){
                        if(numArr[i].matches("[0-9]+")){
                            current = Integer.parseInt(numArr[i]);
                            if(prev < current){
                                prev = current;
                            }
                            else{
                                System.out.println(numSeries + " non consecutive order");
                                flag = 1;
                                break;
                            }
                        }
                    }
                    if (flag == 0){
                        System.out.println(numSeries + " in consecutive order");
                    }
                }
            }
            else{
                System.out.println(numSeries + " non consecutive order");
            }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String numSeries = sc.next();
            String numArr[] = numSeries.split(",");
            checkconsecutiveNumbers(numSeries, numArr);
        }
}
