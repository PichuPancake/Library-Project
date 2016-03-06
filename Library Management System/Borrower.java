import java.util.*;
import java.io.*;

public abstract class Borrower{
  public void browse(){
    try{
    File file = new File("books.txt");
    BufferedReader in = new BufferedReader(new FileReader(file));
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the category");
    String category = kb.nextLine();
    String line;
    while((line = in.readLine()) !=null){
      for(int j = line.length()-1;j>=0;j--){
        if(line.indexOf(category)!=-1){
          System.out.println(line);
          break;
        }
      }
    }
    in.close();
    kb.close();
  } 
  catch (FileNotFoundException ex) {
      ex.printStackTrace();
  }
  catch (IOException ex) {
    ex.printStackTrace();
  }
  }
  public void availability(){
    try{
    File file = new File("books.txt");
    BufferedReader in = new BufferedReader(new FileReader(file));
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the ISBN");
    String isbn = kb.nextLine();
    String line;
    int n =0;
    while((line = in.readLine()) !=null){
      for(int j = line.length()-1;j>=0;j--){
        if(line.indexOf(isbn)!=-1){
          System.out.println("available");
          n=2;
          break;
        }
       }
      }
    if(n==0)
      System.out.println("unavailable or does not exist");
    in.close();
    kb.close();
  }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
  public int booksBorrowed(String fileName, String l){
    int booksBorrowed = 0;
    try{
    File file = new File(fileName);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while((line = in.readLine()) != null)
      if(line.equals(l))
        booksBorrowed++;
    in.close();
  }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
    return booksBorrowed;
  }
    
  abstract void checkOut();
  abstract void returnBook();
}
