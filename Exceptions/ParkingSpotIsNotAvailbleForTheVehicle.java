package ProjectsByShashank.ParkingLot.Exceptions;

public class ParkingSpotIsNotAvailbleForTheVehicle extends RuntimeException{
    public ParkingSpotIsNotAvailbleForTheVehicle() {
    }

    public ParkingSpotIsNotAvailbleForTheVehicle(String message) {
        super(message);
    }

    public ParkingSpotIsNotAvailbleForTheVehicle(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSpotIsNotAvailbleForTheVehicle(Throwable cause) {
        super(cause);
    }

    public ParkingSpotIsNotAvailbleForTheVehicle(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
