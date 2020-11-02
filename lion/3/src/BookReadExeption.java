public class BookReadExeption extends Exception{
    public BookReadExeption() {
    }

    public BookReadExeption(String message) {
        super(message);
        System.out.println(message);
    }

    public BookReadExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public BookReadExeption(Throwable cause) {
        super(cause);
    }

    public BookReadExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
