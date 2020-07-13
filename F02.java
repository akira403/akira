/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fin;

import java.util.Random;
/**
 *
 * @author a8116259
 */
public class F02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
     Random rand = new Random();
     
    String[] color = {"赤","緑", "白", "青", "紫"};
    String a = "赤";
    String b = "緑";
    String c="白";
    String d="青";
    String e="紫";
    
int  g = rand.nextInt(5);
            
if(g==1){
    System.out.println("今日のラッキーカラーは"+a+"です");
}else if(g==2){
      System.out.println("今日のラッキーカラーは"+b+"です");
}   else if(g==2){
      System.out.println("今日のラッキーカラーは"+c+"です");
} else if(g==3){
      System.out.println("今日のラッキーカラーは"+d+"です");
}else if(g==4){
      System.out.println("今日のラッキーカラーは"+e+"です");
}
      
      
    }

    
}
