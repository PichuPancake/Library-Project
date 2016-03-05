public class Student extends Borrower{
  private int bookOut, month, day;
  public Student(int b, int m, int d){
    bookOut = b;
    month = m;
    day = d;
  }
  public void checkOut(){
    if(bookBorrowed ==2){
      System.out.println("You have already borrowed maixmum amount of books ")
    }
    else{
      
      bookBorrowed++;
    }
    
    
  }
  public void returnBook(){
    if(bookBorrowed() ==0){
      System.out.println("You did not borrow any book")
    }
    else{
      
      bookBorrowed--;
    }
  
  }
}
