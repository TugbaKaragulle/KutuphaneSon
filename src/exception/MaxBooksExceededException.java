package exception;

public class MaxBooksExceededException extends Exception {

    // Maksimum kitap sayısı aşıldığında fırlatılır

    public MaxBooksExceededException(String message) {
        super(message);

    }
}
