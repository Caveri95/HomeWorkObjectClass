public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Michail", "Lermontov");
        Author author2 = new Author("Nikolai", "Gogol");

        Book book1 = new Book("Borodino", author1, 1837);
        Book book2 = new Book("Portrait", author2, 1835);


        System.out.println(book1.getBookName() + " " + book1.getYearBook() + " " + book1.getAuthor());
        System.out.println(book2.getBookName() + " " + book2.getYearBook() + " " + book2.getAuthor());

        book1.setYearBook(1937);
        System.out.println(book1.getBookName() + " " + book1.getYearBook() + " " + book1.getAuthor() + "\n");


        // Вторая задача
        book1.setYearBook(1837);
        System.out.println(book1);
        System.out.println(author2 + "\n");

        Author author3 = new Author("Alexandr", "Pushkin");
        Author author4 = new Author("Nikolay", "Nekrasov");
        System.out.println(author3.equals(author4));

        System.out.println("author3.hashCode() = " + author3.hashCode());
        System.out.println("author4.hashCode() = " + author4.hashCode() + "\n");


        Book book3 = new Book("Dubrovski", author3, 1841);
        Book book4 = new Book("Dubrovski", author3, 1841);
        System.out.println(book3.equals(book4));

        System.out.println("book3.hashCode() = " + book3.hashCode());
        System.out.println("book4.hashCode() = " + book4.hashCode());




    }
}