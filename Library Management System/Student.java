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
    File file = new File("books.txt");
    File tempFile = new File("booksTemp.txt");
    BufferedReader in = null;
    BufferedWriter out = null;
    try{
    out = new BufferedWriter(new FileWriter(tempFile,true));
    in = new BufferedReader(new FileReader(file));
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
    if(super.booksBorrowed("students.txt", osis)>=2)
      System.out.println("You borrowed the max number of books.");
    else{
      System.out.print("Enter the ISBN");
      String isbn = kb.nextLine();
      String line;
      while((line = in.readLine()) !=null){
        if(!line.contains(isbn)){
          out.write(line);
          out.newLine();
        }
        if(line.contains(isbn)){
        BufferedWriter out2 = new BufferedWriter(new FileWriter("borrowedbooks.txt",true));
        out2.write(line);
        out2.newLine();
        out2.close();
        BufferedWriter out3 = new BufferedWriter(new FileWriter("students.txt",true));
        out3.write(checkOutLine);
        out3.newLine();
        out3.close();
        }
      }
    kb.close();
    out.close();
    in.close();
  }
    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
    File oldFile = new File("books.txt");
    oldFile.delete();
    File newFile = new File("booksTemp.txt");
    newFile.renameTo(oldFile);
  }
  
  public void returnBook(){
    File file = new File("borrowedBooks.txt");
    File tempFile = new File("borrowedBooksTemp.txt");
    File file2 = new File("students.txt");
    File tempFile2 = new File("studentsTemp.txt");
    BufferedReader in = null;
    BufferedWriter out = null;
    BufferedReader in2 = null;
    BufferedWriter out2 = null;
    try{
    out = new BufferedWriter(new FileWriter(tempFile,true));
    in = new BufferedReader(new FileReader(file));
    out2 = new BufferedWriter(new FileWriter(tempFile2,true));
    in2 = new BufferedReader(new FileReader(file2));
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter OSIS");
    String osis = kb.nextLine();
    System.out.print("Enter the ISBN");
    String isbn = kb.nextLine();
    String line;
    while((line = in.readLine()) !=null){
        if(!line.contains(isbn)){
          out.write(line);
          out.newLine();
        }
        if(line.contains(isbn)){
          BufferedWriter out3 = new BufferedWriter(new FileWriter("books.txt",true));
          out3.write(line);
          out3.newLine();
          out3.close();
          String line2;
          boolean foundOnce = false;
          while((line2 = in2.readLine()) != null){
              if(!line2.contains(osis) || (line2.contains(osis)&&foundOnce)){
                out2.write(line2);
                out2.newLine();
              }
              if(line2.contains(osis))
                foundOnce=true;
          }
        }
      }
    kb.close();
    out.close();
    in.close();
    out2.close();
    in2.close();
  }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
    File oldFile = new File("borrowedBooks.txt");
    oldFile.delete();
    File newFile = new File("borrowedBooksTemp.txt");
    newFile.renameTo(oldFile);
    File oldFile2 = new File("students.txt");
    oldFile2.delete();
    File newFile2 = new File("studentsTemp.txt");
    newFile2.renameTo(oldFile2);
  }
}
