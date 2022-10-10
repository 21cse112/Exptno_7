/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exptno7;
import java.util.Scanner;

/**
 *
 * @author kathier K
 */
public class Exptno7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String str;
       int i,count=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string");
       str=sc.nextLine();
       for(i=0;i<str.length();i++)
       {
          if(str.charAt(i)==' '||str.charAt(i)=='.'||str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='?'||str.charAt(i)=='!'||str.charAt(i)=='-') 
              count++;
          
        }
       System.out.println("Word count is "+count);
        // TODO code application logic here
    }
    
}
