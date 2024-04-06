package ProjectsByShashank.ParkingLot.Exceptions;

public class gateNotFoundException extends RuntimeException{
    public gateNotFoundException() {
    }

    public gateNotFoundException(String message) {
        super(message);
    }

    public gateNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public gateNotFoundException(Throwable cause) {
        super(cause);
    }

    public gateNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
