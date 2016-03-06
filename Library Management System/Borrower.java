import java.util.Scanner;
import java.io.*;
public abstract class Borrower{
  public int bookBorrowed, monthOut,dayOut;
  public ArrayList<String> lines = new ArrayList<String>();
  
  public void browse(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please eneter the the category: ");
    String c = sc.next();
    //then search the file and match enter category with already existed category and display it in a list
    for(int i=0; i<lines.size();i++){
      if(lines.get(i).contains(c)){
        System.out.println(lines.get(i));
      }
    }
  }
  public void avaliablity(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Pleas enter the ISBN or the author of the book: ");
    String c = sc.next();
    //then read and search file for the book and print not avaliable if borrowed else print avaliable.
    int i=0;
    int t=0;// 1 if book is avaliable, 0 is not
    while(i<lines.size()){
      if(line.get(i).contains(c)){
        System.out.println("Book is avaliable to be borrow.");
        System.out.println("Book: "+ lines.get(i));
        c=lines.size();
        t=1;
      }
      i++;
    }
    if(t=0){
      System.out.println("Book is not avaliable to borrow, Sorry! ");
    }
  }
  public void readFile(){
    BufferedReader in = new BufferedReader(new FileReader(""));
    String temp;
    while ((temp = in.readLine()) !=null){
      lines.add(temp);
    }
    in.close();
  }
  public int BookBorrowed(){
    return bookBorrowed;
  }
  abstract void checkOut();
  abstract void returnBook();
}
