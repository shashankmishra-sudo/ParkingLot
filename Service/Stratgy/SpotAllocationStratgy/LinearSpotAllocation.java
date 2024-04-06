package ProjectsByShashank.ParkingLot.Service.Stratgy.SpotAllocationStratgy;

import ProjectsByShashank.ParkingLot.Exceptions.ParkingSpotIsNotAvailbleForTheVehicle;
import ProjectsByShashank.ParkingLot.Model.Enums.ParkingSpotStatus;
import ProjectsByShashank.ParkingLot.Model.ParkingFloor;
import ProjectsByShashank.ParkingLot.Model.ParkingLot;
import ProjectsByShashank.ParkingLot.Model.ParkingSpot;
import ProjectsByShashank.ParkingLot.Model.Vehicle;

public class LinearSpotAllocation implements SpotAllocationStratgy{

    @Override
    public ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle) {

        for(ParkingFloor parkingFloor:parkingLot.getFloors()){
            for (ParkingSpot parkingSpot: parkingFloor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
                    parkingSpot.getVehicleType().equals(vehicle.getVehicleType())
                ){
                    parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotIsNotAvailbleForTheVehicle("Parking Spot is Not Available");

    }
}
