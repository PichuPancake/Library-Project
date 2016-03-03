import java.util.Scanner;
import java.io.*;
public abstract class Borrower{
  
  public void browse(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please eneter the the category: ");
    String c = sc.next();
  }
  public void avaliablity(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Pleas enter the ISBN or the author of the book: ");
    String c = sc.next();
  }
  
  abstract void checkOut();
  abstract void returnBook();
}
