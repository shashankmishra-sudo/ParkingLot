package ProjectsByShashank.ParkingLot.Service;

import ProjectsByShashank.ParkingLot.Model.Enums.*;
import ProjectsByShashank.ParkingLot.Model.Gate;
import ProjectsByShashank.ParkingLot.Model.ParkingFloor;
import ProjectsByShashank.ParkingLot.Model.ParkingLot;
import ProjectsByShashank.ParkingLot.Model.ParkingSpot;
import ProjectsByShashank.ParkingLot.Repository.GateRepository;
import ProjectsByShashank.ParkingLot.Repository.ParkingFloorRepository;
import ProjectsByShashank.ParkingLot.Repository.ParkingLotRepository;
import ProjectsByShashank.ParkingLot.Repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class InitializationService {
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private ParkingFloorRepository parkingFloorRepository;

    public InitializationService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository, ParkingFloorRepository parkingFloorRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
    }

    public ParkingLot init(){
        System.out.println("**********Initialization Started***************");

        //Creating Parking lot object
        ParkingLot parkingLot=new ParkingLot();
        parkingLot.setName("Shashank Parking Center");
        parkingLot.setAddress("CP Delhi");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(1000);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.FOUR_WHEELER,VehicleType.TWO_WHEELER));

        //Craeting 10 floors in this parking lot
        List<ParkingFloor> floors=new ArrayList<>();
        for(int i=1;i<=10;i++){
            ParkingFloor parkingFloor=new ParkingFloor();
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);

            //Entry Gate
            Gate entryGate=new Gate();
            entryGate.setId(i*1000+1);
            entryGate.setGateNumber(i*100+1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperatorName("Operator "+i+1);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.addGate(entryGate);

            //Exit Gate
            Gate exitGate=new Gate();
            exitGate.setId(i+2);
            exitGate.setGateNumber(i*100+2);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.ENTRY);
            exitGate.setOperatorName("Operator "+i+2);
            parkingFloor.setExitGate(exitGate);
            gateRepository.addGate(exitGate);

            //Creating 100 spots per floor
            List<ParkingSpot> spots=new ArrayList<>();
            for(int j=1;j<=100;j++){
                ParkingSpot parkingSpot=new ParkingSpot();
                parkingSpot.setNumber((i*100)+j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.addParkingSpot(parkingSpot);
            }
            parkingFloor.setParkingSpots(spots);
            floors.add(parkingFloor);
            parkingFloorRepository.addParkingFloor(parkingFloor);
        }
        parkingLot.setFloors(floors);
        parkingLotRepository.addParkingLot(parkingLot);
        return parkingLotRepository.getParkingLot(1);
    }
}
