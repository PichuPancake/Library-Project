import java.util.Scanner;
import java.io.*;
public abstract class Borrower{
  public int bookBorrowed;
  public void browse(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please eneter the the category: ");
    String c = sc.next();
    //then search the file and match enter category with already existed category and display it in a list
    BufferedReader in = new BufferedReader (new FileReader("")
  }
  public void avaliablity(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Pleas enter the ISBN or the author of the book: ");
    String c = sc.next();
    //then read and search file for the book and print not avaliable if borrowed else print avaliable.
  }
  public int BookBorrowed(){
    return bookBorrowed;
  }
  abstract void checkOut();
  abstract void returnBook();
}
