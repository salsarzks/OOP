public class Novel extends Book {
    public Novel(String title, String author, String publisher, int year) {
        super(title, author, publisher, year);
    }
}

public class Movie extends Media {
    private String director;

    public Movie(String title, String publisher, int year, String director) {
        super(title, publisher, year);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
}