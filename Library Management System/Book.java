public class Book{
  private String isbn, name, author, title, category, status;
  
  public Book(i, n, a, t, c, s){
    isbn = i;
    name = n;
    author = a;
    title = t;
    category = c;
    status = s;
  }
  
  public String getIsbn(){
    return isbn;
  }
  public String getName(){
    return name;
  }
  public String getAuthor(){
    return author;
  }
  public String getTItle(){
    return title;
  }
  public String getCategory(){
    return category;
  }
  public String getStatus(){
    return status;
  }
  public String toString(){
    return "(" + isbn + ", " + author + "," + title + "," category + "," + status +")\n";
  }
}
