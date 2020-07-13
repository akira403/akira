/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author a8116259
 */
public class Mid03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Random rand = new Random();
  Scanner stdIn = new Scanner(System.in);
     System.out.println("High and Lowゲーム");
   
     System.out.println("ゲーム回数：");
        int a = stdIn.nextInt();
     
    int k=0;
        
     for(int b =1;  b <= a; b++){   
        System.out.println("<"+ b +"回戦>");
        
        int x= rand.nextInt(13)+1;
     System.out.println("あなたのカード：" + x);
           
     
            int y= rand.nextInt(13)+1;
            
     System.out.println("あなたのカードはコンピュータのカードより？(大きい：1,同じ：0,小さい：-1)：");
           int c = stdIn.nextInt();
           
          
           if( c==1 && x > y){
         System.out.println("正解！コンピュータのカードは"+y+"でした");
         k=k+1;
         }else if( c==0 && x==y ){
          System.out.println("正解！コンピュータのカードは"+y+"でした");
           k=k+1;
         }else if( c==-1 && y > x ){
          System.out.println("正解！コンピュータのカードは"+y+"でした");
           k=k+1;
    }else if( c==1 && y > x ){
          System.out.println("不正解！コンピュータのカードは"+y+"でした");
    }else if( c==0 && y != x ){
          System.out.println("不正解！コンピュータのカードは"+y+"でした");
     }else if( c==-1 && y < x ){
          System.out.println("不正解！コンピュータのカードは"+y+"でした");
    }
           
      System.out.println("＝＝＝＝＝");    
    
    
     
   }
     System.out.println("ゲーム終了");
      System.out.println("あなたは"+a+"回中"+k+"回成功しました");
    
    }

}
         
    