public class Book {
    private String bookName;
    private int publishingYear;



    public String getBookName() {
        return bookName;
    }



    public int getPublishingYear() {
        return publishingYear;
    }

    public Book(String bookName, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
