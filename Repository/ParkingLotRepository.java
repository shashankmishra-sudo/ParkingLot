package ProjectsByShashank.ParkingLot.Repository;

import ProjectsByShashank.ParkingLot.Exceptions.ParkingLotNotFoundException;
import ProjectsByShashank.ParkingLot.Exceptions.TicketNotFoundException;
import ProjectsByShashank.ParkingLot.Model.ParkingLot;
import ProjectsByShashank.ParkingLot.Model.Ticket;

import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotDB;
    private static int idCounter=0;

    public ParkingLotRepository() {
        this.parkingLotDB = new HashMap<>();
    }

    public ParkingLot getParkingLot(int parkingLotId){
        ParkingLot parkingLot=parkingLotDB.get(parkingLotId);
        if(parkingLot==null){
            throw new ParkingLotNotFoundException("Ticket With Given id is not present");
        }
        return parkingLot;
    }

    public void addParkingLot(ParkingLot parkingLot){
        parkingLot.setId(++idCounter);
        parkingLotDB.put(parkingLot.getId(), parkingLot);
        System.out.println("Parking Lot has been Added successfully");
    }
}
