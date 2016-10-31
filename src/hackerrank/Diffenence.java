/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Diffenence {
 private int[] elements;
 public int maximumDifference;
public Diffenence (int[] a){
    
    this.elements=a;
    
}
public void computeDifference(){
    int n = elements.length;
    this.maximumDifference=elements[n-1]-elements[0];
    
}
}
