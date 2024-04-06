package ProjectsByShashank.ParkingLot.Repository;

import ProjectsByShashank.ParkingLot.Exceptions.ParkingLotNotFoundException;
import ProjectsByShashank.ParkingLot.Exceptions.parkingFloorNotFoundException;
import ProjectsByShashank.ParkingLot.Model.ParkingFloor;
import ProjectsByShashank.ParkingLot.Model.ParkingLot;

import java.util.HashMap;

public class ParkingFloorRepository {
    private static int idCounter=0;

    private HashMap<Integer, ParkingFloor> parkingFloorDB;

    public ParkingFloorRepository() {
        this.parkingFloorDB = new HashMap<>();
    }

    public ParkingFloor getParkingFloor(int parkingFloorId){
        ParkingFloor parkingFloor=parkingFloorDB.get(parkingFloorId);
        if(parkingFloor==null){
            throw new parkingFloorNotFoundException("Ticket With Given id is not present");
        }
        return parkingFloor;
    }

    public void addParkingFloor(ParkingFloor parkingFloor){
        parkingFloor.setId(++idCounter);
        parkingFloorDB.put(parkingFloor.getId(), parkingFloor);
        System.out.println("parking Floor has been Added successfully");
    }
}
