/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expno7_2;
import java.util.Scanner;
/**
 *
 * @author kathier K
 */
public class Expno7_2 {
    static char second_most_freq(String s){
        int[] count=new int[256];
        int a;
        for(a=0;a<s.length();a++){
            (count[s.charAt(a)])++;
        }
        int one=0,two=0;
        for(a=0;a<256;a++){
            if(count[a]>count[one]) {
                two = one;
                one = a;
            }
            else if(count[a]>count[two] && count[a]!=count[one]){
                two=a;
            }
        }
        return (char)two;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string:");
        s= in.next();
        char x=second_most_freq(s);
        if(x!='\0') {
            System.out.println(x);
        }
        else{
            System.out.println("no second most freq character");
        }
    }
}
        // TODO code application logic here
    }
    
}
