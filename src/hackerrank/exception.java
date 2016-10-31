/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Nahian-1
 */
public class exception {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
          try {
              int a = Integer.parseInt(S);
              System.out.println(a);
          } catch (Exception e) {
              System.out.println("Bad String");
          }
        
        
        
        
        
        
    }
    
}
