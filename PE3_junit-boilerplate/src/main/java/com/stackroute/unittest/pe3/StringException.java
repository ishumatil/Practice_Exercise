package com.stackroute.unittest.pe3;

public class StringException {
    StringException(){
        String str = "Inside the constructor";
        System.out.println(str);
    }

    public static void main(String args[]) throws Exception{
        try{
            throw new Exception();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Inside finally");
        }
    }
}
