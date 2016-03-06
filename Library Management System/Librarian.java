import java.io.*;
import java.util.*;

public class Librarian{  
  public void addBook(){
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("filename.txt")));
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
    out.newLine();
    out.write(textLine,0,textLine.length());
    out.close();
    kb.close();
  }
  public void removeBook(){
    BufferedReader in = new BufferedReader(new FileReader("filename.txt"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("filename.txt")));
    System.out.print("Enter ISBN of book");
    String isbn = kb.nextLine();
    ArrayList<String> isbnList = new ArrayList<String>();
    while(String i = in.readLine() !=null){
      int isbnEnd = indexOf(",");
      String txtIsbn = i.substring(0,isbnEnd);
      isbnList.add(txtIsbn);
    }
    for(int j = 0; j<isbnList.size();j++)
      if(isbn.equals(isbnList.get(j))){
        for(int k = 0; k<j;k++){
          String line = in.readLine();
          int isbnEnd = indexOf(",");
          String txtIsbn = i.substring(0,isbnEnd);
          if(isbn.equals(txtIsbn)){
            line = line.replace(line,"");
            out.write(line);
          }
        }
      }   
   in.close();
   out.close();
  }
}
         
