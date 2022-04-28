package com.jatin.exceptions;

public class Exception1 {
    public static void main(String[] args) {
        int i,j,k;
        i=8;
        j=0;
//        let put this critical statement in the try block
        try{
            k=i/j;
        }
//        catch block to catch the exception throw by the try block in object form
        catch(Exception e)
        {
//            printing the exception
            System.out.println(e);
        }
        System.out.println("Hi im after the exception!!!!");
    }
}
