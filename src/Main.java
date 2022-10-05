public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание Объекты и классы");
        System.out.println();
//        Книга 1-я
        Author author1 = new Author("Алексей", " Толстой");
        Book book1 = new Book("Князь Серебряный", author1,1957);

        System.out.println(author1.getFirstName() + author1.getLastName());
        System.out.println("Книга: " + book1.getBookName() + ". Год издания: " + book1.getPublishingYear());

        System.out.println();
//         Книга 2-я
        Author author2 = new Author("Анджей", " Сапковский");
        Book book2 = new Book("Ведьмак", author2,1999);
        System.out.println(author2.getFirstName() + author2.getLastName());
        System.out.println("Книга: " + book2.getBookName() + ". Год издания: " + book2.getPublishingYear());

        book2.setPublishingYear(2020);
        System.out.println("Книга: " + book2.getBookName() + ". В новом издании: " + book2.getPublishingYear() + " года.");
    }
}