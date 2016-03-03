import java.util.Scanner;
import java.io.*;
public abstract class Borrower{
  
  public void browse(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please eneter the the category: ");
    String c = sc.next();
    //then search the file and match enter category with already existed category and display it in a list
  }
  public void avaliablity(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Pleas enter the ISBN or the author of the book: ");
    String c = sc.next();
    //then read and search file for the book and print not avaliable if borrowed else print avaliable.
  }
  
  abstract void checkOut();
  abstract void returnBook();
}
