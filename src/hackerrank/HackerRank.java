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
abstract class HackerRank {


    String title;
    String author;
    HackerRank(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();

}

 class MyBook extends HackerRank{
 int prize;
 MyBook(String title,String author,int price){
     super(title, author);
     this.prize=price;
  
 
 }
 @Override
 public void display(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+prize);
 }
 
 }
    
    

 class Solution
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      HackerRank new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}
