package com.jatin.exceptions;

public class Exception2 {
    public static void main(String[] args) {
        int[] arr = new int[4];
//        let see another kind of exception
        try{
            for(int i=0;i<=arr.length;i++)
            {
                arr[i] = i+1;
            }
        }
        catch(Exception e)
        {
            System.out.println("Hi this a array exception------>  "+e);
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
