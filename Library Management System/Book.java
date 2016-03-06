public class Book{
  private String isbn, name, author, category, status;
  
  public Book(i, n, a, c, s){
    isbn = i;
    name = n;
    author = a;
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
  public String getCategory(){
    return category;
  }
  public String getStatus(){
    return status;
  }
  public boolean compare(String str){
    return (isbn.equals(str) || name.equals(str) || author.equals(str)|| category.equals(str));
  }
  public boolean matches(Book otherBook){
    return otherBook.isbn().equals(this.isbn) && otherBook.name().equals(this.name) && otherBook.author().equals(this.author)&&otherBook.category().equals(this.category);
  }
  public String toString(){
    return isbn + "," + author + "," + name + "," category + "," + status;
  }
}
