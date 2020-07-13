/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;
import java.util.Scanner;
/**
 *
 * @author a8116259
 */
public class Mid02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner stdIn = new Scanner(System.in);
     System.out.println("シロネコアオヤマ宅急便のサイズを調べます");
     
      System.out.println("縦[cm]：");
        int a = stdIn.nextInt();
        
      System.out.println("横[cm]：");
        int b = stdIn.nextInt();
    
    System.out.println("高さ[cm]：");
        int c = stdIn.nextInt();
        
      System.out.println("重さ[kg]：");
        int d = stdIn.nextInt();     
        
        if(a + b + c <= 60 && d < 2 && a<=50 && b<=50 && c<=50){
        System.out.println("このお荷物は60サイズです");
       }else if(a + b + c <= 80 && d < 5 && a<=50 && b<=50 && c<=50){
        System.out.println("このお荷物は80サイズです");    
     }else if(a + b + c >= 60 && d < 2 && a<=50 && b<=50 && c<=50){
         System.out.println("このお荷物は80サイズです");
        }else if(a + b + c <= 60 && 5 > d && d >= 2 && a<=50 && b<=50 && c<=50){
         System.out.println("このお荷物は80サイズです");
       }else{
         System.out.println("このお荷物はお取り扱いできません");
        
    }
    }
}
