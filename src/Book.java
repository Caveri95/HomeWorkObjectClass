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


}


