package ProjectsByShashank.ParkingLot.Service.Stratgy.SpotAllocationStratgy;

import ProjectsByShashank.ParkingLot.Model.ParkingLot;
import ProjectsByShashank.ParkingLot.Model.ParkingSpot;
import ProjectsByShashank.ParkingLot.Model.Vehicle;

public interface SpotAllocationStratgy {
    ParkingSpot getSpotForVehicle(ParkingLot parkingLot,Vehicle vehicle);
}
