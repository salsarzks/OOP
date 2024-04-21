public interface Library {
    String getTitle();
    String getAuthor();
    String getPublisher();
    int getYear();
    boolean isAvailable();
    void borrow();
    void returnItem();
}