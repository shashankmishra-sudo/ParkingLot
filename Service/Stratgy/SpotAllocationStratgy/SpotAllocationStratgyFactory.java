package ProjectsByShashank.ParkingLot.Service.Stratgy.SpotAllocationStratgy;

public class SpotAllocationStratgyFactory {
    public static SpotAllocationStratgy getSpotAllocationFactory(){
        return new LinearSpotAllocation();
    }
}
