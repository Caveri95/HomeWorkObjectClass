public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Michail", "Lermontov");
        Author author2 = new Author("Nikolai", "Gogol");

        Book book1 = new Book("Borodino", author1, 1837);
        Book book2 = new Book("Portrait", author2, 1835);

        System.out.println(book1.getBookName() + " " + book1.getYearBook() + " " + book1.getAuthor());
        System.out.println(book2.getBookName() + " " + book2.getYearBook() + " " + book2.getAuthor());

        book1.setYearBook(1937);
        System.out.println(book1.getBookName() + " " + book1.getYearBook() + " " + book1.getAuthor());


    }
}