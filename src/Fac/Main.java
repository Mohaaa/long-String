package Fac;

import java.util.*; 
import java.io.*;

class Main {  
  public static String LongestWord(String sen) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    if (sen==null)
    	return null;
    
    String lw="";
    int l=0;
    String words[] = sen.split(" ");
    
    for (String word:words){
    	if (word.length()>l){
    		lw = word;
    		l = word.length();
    	}    
    }
    
    sen = lw;
    return sen;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
} 