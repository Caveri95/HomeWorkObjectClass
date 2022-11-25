import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int yearBook;
    public Book (String bookName, Author author, int yearBook) {
        this.bookName = bookName;
        this.author = author;
        this.yearBook = yearBook;
            }


    public String getBookName() {
        return this.bookName;
    }
    public String getAuthor() {
        return author.getNameAuthor() + " " + author.getSurnameAuthor();
    }
    public int getYearBook() {
        return this.yearBook;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    // Вторая задача
    @Override
    public String toString() {
        return bookName + " " + yearBook + " " + author.toString();
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearBook);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getYearBook() == book.getYearBook() && getBookName().equals(book.getBookName()) && getAuthor().equals(book.getAuthor());
    }
}


