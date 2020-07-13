/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fin;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author a8116259
 */
public class F05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Random rand = new Random();
      
        System.out.println("各要素がすべて異なる配列を生成します");
      for(int i=0; i<10; i++){
         int a  = rand.nextInt(10);
          System.out.println("配列要素["+i+"]:" + a);
      }
        
    
    }
    
}
