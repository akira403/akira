/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author a8116259
 */
public class F03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("要素数:");
        int a = stdIn.nextInt();

        System.out.println("一つ目の配列を生成します");
        System.out.println("二つ目の配列を生成します");
        System.out.println("各要素を比較します");
        int b = 0;
  int c = 0;

        int f=randomArray(b);
     
        int g=randomArray(c);
        for(int i=0; i<a; i++){
             System.out.println("要素数["+i+"]:"+ randomArray(b)+" " +randomArray(c) );
       
             
        } 
       
              
        

    }static int randomArray(int n){
     Random rand = new Random();
  
     for (int i = 0; i < n; i++) {
              
         
         n = rand.nextInt(20)+10;
         
            //System.out.println("配列要素[" + i + "]:" + b +" "+ c);
        
         }
   return n;


    
    }

}  
