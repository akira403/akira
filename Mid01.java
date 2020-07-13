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
public class Mid01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner stdIn = new Scanner(System.in);
        System.out.println("食塩水を作ります");
    
         System.out.println("濃度[%](実数)：");
        double x = stdIn.nextDouble();
        
      System.out.println("食塩の重さ[g](実数)：");
        double y = stdIn.nextDouble();
        
         System.out.println("必要な水の重さは"+100 * y / ( x + y ) + "gです");
    
    }
    
}
