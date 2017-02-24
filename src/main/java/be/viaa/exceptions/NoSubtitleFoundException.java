package be.viaa.exceptions;

public class NoSubtitleFoundException extends RuntimeException {
    public NoSubtitleFoundException() {}
    public NoSubtitleFoundException(String msg) {
        super(msg);
    }
}