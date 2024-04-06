package ProjectsByShashank.ParkingLot.Exceptions;

public class parkingFloorNotFoundException extends RuntimeException{
    public parkingFloorNotFoundException() {
    }

    public parkingFloorNotFoundException(String message) {
        super(message);
    }

    public parkingFloorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public parkingFloorNotFoundException(Throwable cause) {
        super(cause);
    }

    public parkingFloorNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
