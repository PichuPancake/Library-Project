import java.util.Scanner;
public class Student extends Borrower{
  public void checkOut(){
    if(bookBorrowed ==2){
      System.out.println("You have already borrowed maixmum amount of books ")
    }
    else{
      Scanner sc = new Scanner(System.in);
      System.out.print("To borrow a book please enter the ISBN or Author: ");
      String c = sc.next();
      int s =0//1 if book exist, 0 if book no
      for(int i =0;i<books.size(),i++){
        if(books.get(i).compare(c)){
          printReceipt(books.get(i));
          i=books.size();
          bookBorrowed++;
        }
      }
      if(s==0){
        System.out.println("Book not found!");
      }
    }
    
    
  }
  public void returnBook(){
    if(bookBorrowed() ==0){
      System.out.println("You did not borrow any book")
    }
    else{
      
      books
      bookBorrowed--;
    }
  
  }
}
