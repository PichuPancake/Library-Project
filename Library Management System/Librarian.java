import java.io.*;
import java.util.*;

public class Librarian{  
  public void addBook(){
    try{
    File file = new File("books.txt");
    BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
    Scanner kb = new Scanner(System.in);
    System.out.print("ISBN ID of book");
    String isbn = kb.nextLine();
    System.out.print("Book name");
    String bookName = kb.nextLine();
    System.out.print("Author");
    String author = kb.nextLine();
    System.out.print("Category");
    String category = kb.nextLine();
    System.out.print("Status");
    String status = kb.nextLine();
    Book book = new Book(isbn, bookName, author, category, status);
    String textLine = book.getIsbn()+", "+book.getName()+", "+book.getAuthor()+", "+book.getCategory()+", "+book.getStatus();
    out.write(textLine,0,textLine.length());
    out.newLine();
    out.close();
    kb.close();
  }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
    
  public void removeBook(){
    try{
    File file = new File("books.txt");
    BufferedReader in = new BufferedReader(new FileReader(file));
    BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter ISBN of book");
    String isbn = kb.nextLine();
    String line;
    while((line = in.readLine()) !=null)
      for(int j = line.length()-1;j>=0;j--)
        if(line.indexOf(isbn)!=-1){
          line = line.replace(line,"");
          out.write(line);
    }
   in.close();
   out.close();
   kb.close();
  }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
         
