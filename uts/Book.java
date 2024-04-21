public abstract class Book implements Library {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.isAvailable = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("This book is not available");
        }
    }

    @Override
    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
        } else {
            System.out.println("This book is already available");
        }
    }
}

public abstract class Media implements Library {
    private String title;
    private String publisher;
    private int year;
    private boolean isAvailable;

    public Media(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.isAvailable = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("This media is not available");
        }
    }

    @Override
    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
        } else {
            System.out.println("This media is already available");
        }
    }
}