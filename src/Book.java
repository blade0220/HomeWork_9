public class Book {
    private String bookName;
    int publishingYear;
    Author author;


    public String getBookName() {
        return bookName;
    }

    // public String getAuthor() {
    //            return author.toString();
    //  }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        // this.author = author;
        this.publishingYear = publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
