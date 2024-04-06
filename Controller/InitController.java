package ProjectsByShashank.ParkingLot.Controller;

import ProjectsByShashank.ParkingLot.Model.ParkingLot;
import ProjectsByShashank.ParkingLot.Service.InitializationService;

public class InitController {
    private InitializationService initializationService;

    public InitController(InitializationService initializationService) {
        this.initializationService = initializationService;
    }

    public ParkingLot init(){
        return initializationService.init();
    }
}
