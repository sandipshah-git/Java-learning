public class Book {
    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayBook() {
        return this.title + " (" + this.pages + " pages)";
    }

}
