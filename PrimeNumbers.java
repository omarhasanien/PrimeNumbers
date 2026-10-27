package edu.zuj.oop.week3.lecture1;

public class PrimeNumbers {
    public static void main(String[] args) {
       
      int num = 100;
      
        System.out.println(" The primary numbers from 1 to " + num + " is ");
        
        for ( int i = 2 ; i<= num ; i++){
        int count = 0;
        
        for ( int j = 2 ; j < i ; j++ ){
        if (i % j == 0){
        count++; 
        break;} }
        
        if (count == 0){
            System.out.println(i);}
        
        }
        
    }
}
