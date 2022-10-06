public class Book {
    private String bookName;
    private int publishingYear;
    private Author author;


    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {

        return this.bookName;
    }

    public Author getAuthor() {

        return this.author;
    }

    public int getPublishingYear() {

        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }

    public String bookInfo(){
        return "Книга: " + this.bookName +  ". Автор: " + this.author + " Год издания: " +
                this.publishingYear;
    }
}
