/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;


public class SolutionImpl{
    
///////////////diffencece solution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        

        Diffenence difference = new Diffenence(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

    

