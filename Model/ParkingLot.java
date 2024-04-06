package ProjectsByShashank.ParkingLot.Model;

import ProjectsByShashank.ParkingLot.Model.Enums.ParkingLotStatus;
import ProjectsByShashank.ParkingLot.Model.Enums.VehicleType;
import ProjectsByShashank.ParkingLot.Service.Stratgy.BillCalculationStratgy.BillCalculationStratgy;
import ProjectsByShashank.ParkingLot.Service.Stratgy.SpotAllocationStratgy.SpotAllocationStratgy;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private List<ParkingFloor> floors;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypesSupported;
    private int capacity;
    private BillCalculationStratgy billCalculationStrategy;
    private SpotAllocationStratgy spotAllocationStrategy;

    @Override
    public String toString() {
        return "ParkingLot{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", floors=" + floors +
                ", parkingLotStatus=" + parkingLotStatus +
                ", vehicleTypesSupported=" + vehicleTypesSupported +
                ", capacity=" + capacity +
                ", billCalculationStrategy=" + billCalculationStrategy +
                ", spotAllocationStrategy=" + spotAllocationStrategy +
                '}';
    }

    public ParkingLot() {
    }

    public ParkingLot(String name, String address, List<ParkingFloor> floors, ParkingLotStatus parkingLotStatus, List<VehicleType> vehicleTypesSupported, int capacity, BillCalculationStratgy billCalculationStrategy, SpotAllocationStratgy spotAllocationStrategy) {
        this.name = name;
        this.address = address;
        this.floors = floors;
        this.parkingLotStatus = parkingLotStatus;
        this.vehicleTypesSupported = vehicleTypesSupported;
        this.capacity = capacity;
        this.billCalculationStrategy = billCalculationStrategy;
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getVehicleTypesSupported() {
        return vehicleTypesSupported;
    }

    public void setVehicleTypesSupported(List<VehicleType> vehicleTypesSupported) {
        this.vehicleTypesSupported = vehicleTypesSupported;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BillCalculationStratgy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStratgy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }

    public SpotAllocationStratgy getSpotAllocationStrategy() {
        return spotAllocationStrategy;
    }

    public void setSpotAllocationStrategy(SpotAllocationStratgy spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }
}
