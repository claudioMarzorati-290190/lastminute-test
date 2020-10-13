package exceptions;

public class LastMinuteException extends Exception{
    public LastMinuteException(String message) {
        super(message);
    }

    public LastMinuteException(String message, Throwable e){
        super(message, e);
    }
}
