public class Main {
    public static void main(String[] args) {
        Library book1 = new Book("Bendera Setengah Tiang ", "Annisa LIM", "9786236456293");
        Library magazine1 = new Magazine("Natural sciencec", "Editorial Staff", "12654567890", 123);

        book1.borrow();
        System.out.println("Book 1 is available: " + book1.isAvailable());

        magazine1.returnItem();
        System.out.println("Magazine 1 is available: " + magazine1.isAvailable());
    }
}