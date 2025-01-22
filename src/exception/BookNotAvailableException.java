package exception;

public class BookNotAvailableException extends Exception {

    // Kitap müsait olmadığında fırlatılır.



        public BookNotAvailableException(String message) {
            super(message);

        }
    }


