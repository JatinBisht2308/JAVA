package com.jatin.exceptions;

public class Exception3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
//        let see another kind of exception
        try{
            for(int i=0;i<=arr.length;i++)
            {
                arr[i] = i+1;
            }
            System.out.println("BYE");
        }
        catch(Exception e)
        {
            System.out.println("Hi this a array exception------>  "+e);
        }
        finally{
            System.out.println("_______Doesnt matter that if there is exception or not it will alwaya call the finally block of code_____");
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
