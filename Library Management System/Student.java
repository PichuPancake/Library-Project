import java.io.*;
import java.util.*;

public class Student extends Borrower{
  public void getAction(){
    Scanner kb = new Scanner(System.in);
    System.out.print("What will you do? ('browse', 'available', 'borrow', 'return')");
    String action = kb.nextLine();
    if(action.toUpperCase().equals("BROWSE"))
      super.browse();
    if(action.toUpperCase().equals("AVAILABLE"))
      super.availability();
    if(action.toUpperCase().equals("BORROW"))
      checkOut();
    if(action.toUpperCase().equals("RETURN"))
      returnBook();
    kb.close();
  }
  
  public void checkOut(){
    try{
    File file = new File("books.txt");
    BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
    BufferedReader in = new BufferedReader(new FileReader(file));
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter OSIS");
    String osis = kb.nextLine();
    System.out.print("Enter last name");
    String lastName = kb.nextLine();
    System.out.print("Enter first name");
    String firstName = kb.nextLine();
    System.out.print("Enter grade");
    String grade = kb.nextLine();
    System.out.print("Enter official class");
    String offClass = kb.nextLine();
    String checkOutLine = osis + ", " + lastName + ", "+firstName + ", "+grade + ", "+offClass;
    if(super.booksBorrowed("booksborrowed.txt", checkOutLine)>=2)
      System.out.println("You borrowed the max number of books.");
    else{
      System.out.print("Enter the ISBN");
      String isbn = kb.nextLine();
      String line;
      while((line = in.readLine()) !=null){
        for(int j = 0;j<line.length();j--){
          if(line.indexOf(isbn)!=-1){
            String temp = line;
            line = line.replace(line, "");
            out.write(line);
            file = new File("borrowedbooks.txt");
            out = new BufferedWriter(new FileWriter(file,true));
            out.write(temp);
            file = new File("students.txt");
            out = new BufferedWriter(new FileWriter(file,true));
            out.write(checkOutLine);
          }
         }
       }
     }
    kb.close();
    out.close();
    in.close();
  }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
  
  public void returnBook(){
    try{
    File file = new File("borrowedbooks.txt");
    BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
    BufferedReader in = new BufferedReader(new FileReader(file));
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter OSIS");
    String osis = kb.nextLine();
    System.out.print("Enter last name");
    String lastName = kb.nextLine();
    System.out.print("Enter first name");
    String firstName = kb.nextLine();
    System.out.print("Enter grade");
    String grade = kb.nextLine();
    System.out.print("Enter official class");
    String offClass = kb.nextLine();
    String checkOutLine = osis + ", " + lastName + ", "+firstName + ", "+grade + ", "+offClass;
    System.out.print("Enter the ISBN");
    String isbn = kb.nextLine();
    String line;
    while((line = in.readLine()) !=null){
      for(int j = 0;j<line.length();j--){
        if(line.indexOf(isbn)!=-1){
          String temp = line;
          line = line.replace(line, "");
          out.write(line);
          file = new File("books.txt");
          out.write(temp);
          file = new File("teachers.txt");
          while((line = in.readLine()) != null){
            if(line.equals(checkOutLine)){
              line = line.replace(line, "");
              break;
            }
          }
        }
      }
    }
    kb.close();
    out.close();
    in.close();
  }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
