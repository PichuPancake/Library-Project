import java.util.*;

public class LibraryTest{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.print("Librarian or borrower? ('librarian' or 'borrower')");
    String user = kb.nextLine();
    if(user.toUpperCase().equals("LIBRARIAN")){
      Librarian librarian = new Librarian();
      System.out.print("Adding or removing book? ('add' or 'remove')");
      String action = kb.nextLine();
      if(action.toUpperCase().equals("ADD"))
        librarian.addBook();
      if(action.toUpperCase().equals("REMOVE"))
        librarian.removeBook();
    } if(user.toUpperCase().equals("BORROWER")){
      System.out.print("Student or teacher? ('student' or 'teacher')");
      String userBorrow = kb.nextLine();
      if(userBorrow.toUpperCase().equals("STUDENT")){
        Student student = new Student();
        student.getAction();
      } if(userBorrow.toUpperCase().equals("TEACHER")){
        Teacher teacher = new Teacher();
        teacher.getAction();
      }
    kb.close();     
}
}
}
