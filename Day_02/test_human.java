package com.jatin;

import com.jatin.human;

public class test_human {
  public static void main(String[] args) {
      human jatin = new human(19,"Jatin","Male",false);
      System.out.println(jatin.name);
      System.out.println(jatin.age);
      System.out.println(jatin.sex);
      System.out.println(jatin.married);
      System.out.println(human.two_legs);

      human Tushar = new human(19,"Tushar","Male",false);
      System.out.println(Tushar.name);
      System.out.println(Tushar.age);
      System.out.println(Tushar.sex);
      System.out.println(Tushar.married);
      System.out.println(human.two_legs);
  }    
}
