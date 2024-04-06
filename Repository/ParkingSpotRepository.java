package ProjectsByShashank.ParkingLot.Repository;

import ProjectsByShashank.ParkingLot.Exceptions.ParkingLotNotFoundException;
import ProjectsByShashank.ParkingLot.Exceptions.ParkingSpotNotFoundException;
import ProjectsByShashank.ParkingLot.Model.ParkingFloor;
import ProjectsByShashank.ParkingLot.Model.ParkingSpot;

import java.util.HashMap;

public class ParkingSpotRepository {
    private static int idCounter=0;

    private HashMap<Integer, ParkingSpot> parkingSpotDB;

    public ParkingSpotRepository() {
        this.parkingSpotDB = new HashMap<>();
    }

    public ParkingSpot getParkingSpot(int parkingSpotId){
        ParkingSpot parkingSpot=parkingSpotDB.get(parkingSpotId);
        if(parkingSpot==null){
            throw new ParkingSpotNotFoundException("Ticket With Given id is not present");
        }
        return parkingSpot;
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpot.setId(++idCounter);
        parkingSpotDB.put(parkingSpot.getId(), parkingSpot);
        System.out.println("ParkingSpot has been Added successfully");
    }
}
