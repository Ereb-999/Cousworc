package org.example;



public class Main {
    public static void main(String[] args) {
     try{
         int masive[] = new int[6];
         masive[9] = 0/0;
     } catch (ArithmeticException | ArrayIndexOutOfBoundsException E) {
     System.out.println(E.getMessage());
     }
    }
}

