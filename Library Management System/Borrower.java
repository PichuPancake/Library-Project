import java.util.Scanner;
import java.io.*;
public abstract class Borrower{
  public int bookBorrowed, monthOut,dayOut;
  public ArrayList<Book> books = new ArrayList<Book>();
  
  public void browse(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please eneter the the category: ");
    String c = sc.next();
    //then search the file and match enter category with already existed category and display it in a list
    for(int i=0; i<books.size();i++){
      if(books.get(i).compare(c)){
        System.out.println(lines.get(i).toString());
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
    while(i<books.size()){
      if(line.get(i).contains(c)){
        System.out.println("Book is avaliable to be borrow.");
        System.out.println("Book: "+ books.get(i).toString());
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
    String[] lineSplit = new String[5];
    while ((temp = in.readLine()) !=null){
      lineSplit = temp.split(",")
      books.add(Book(lineSplit[0],lineSplit[1],lineSplit[2],lineSplit[3],lineSplit[4]));
    }
    in.close();
  }
  public void newFile(){
    
  }
  public int BookBorrowed(){
    return bookBorrowed;
  }
  abstract void checkOut();
  abstract void returnBook();
}
