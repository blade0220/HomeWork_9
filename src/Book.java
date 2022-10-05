public class Book {
    private String bookName;
    private int publishingYear;
    private Author author;


    public String getBookName() {
        return bookName;
    }



    public int getPublishingYear() {
        return publishingYear;
    }

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
