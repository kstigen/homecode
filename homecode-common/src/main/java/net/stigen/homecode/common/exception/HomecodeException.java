package net.stigen.homecode.common.exception;

public class HomecodeException extends RuntimeException {

    private String errorMessage;

    public HomecodeException(String errorMessage){
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public HomecodeException(String errorMessage, Throwable cause){
        super(errorMessage, cause);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
