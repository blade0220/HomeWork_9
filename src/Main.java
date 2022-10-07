public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание Объекты и классы");
        System.out.println();
//        Книга 1-я
        Author author1 = new Author("Алексей", "Толстой");
        Book book1 = new Book("Князь Серебряный", author1,1957);

        //System.out.println(author1.getFirstName() + author1.getLastName());
        System.out.println(book1.bookInfo());

        System.out.println();
//         Книга 2-я
        Author author2 = new Author("Анджей", "Сапковский");
        Book book2 = new Book("Ведьмак", author2,1999);
        //System.out.println(author2.getFirstName() + author2.getLastName());
        System.out.println(book2.bookInfo());

        book2.setPublishingYear(2020);
        System.out.println(book2.bookInfo());
        System.out.println();

        if (author1.equals(author2)){
            System.out.println("Объекты равны");
        } else
            System.out.println("Объекты не равны");
        if (author1.hashCode() == author2.hashCode()){
            System.out.println("Хеш коды равны");
        } else
            System.out.println("Хеш коды не равны");
        System.out.println();

        if (book1.equals(book2)){
            System.out.println("Объекты равны");
        } else
            System.out.println("Объекты не равны");

        if (author1.hashCode() == author2.hashCode()){
            System.out.println("Хеш коды равны");
        } else
            System.out.println("Хеш коды не равны");
    }
}