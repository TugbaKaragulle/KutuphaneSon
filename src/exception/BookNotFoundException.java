package exception;

public class BookNotFoundException extends Exception {
    // Kitap bulunamadığında fırlatılır

    public BookNotFoundException(String message) {
        super(message);

    }

}
