package ProjectsByShashank.ParkingLot.Repository;

import ProjectsByShashank.ParkingLot.Exceptions.gateNotFoundException;
import ProjectsByShashank.ParkingLot.Model.Gate;
import ProjectsByShashank.ParkingLot.Model.ParkingSpot;

import java.util.HashMap;

public class GateRepository {
    private static int idCounter=0;


    private HashMap<Integer, Gate> gateDB;

    public GateRepository() {
        this.gateDB = new HashMap<>();
    }

    public Gate getGate(int gateId){
        Gate gate=gateDB.get(gateId);
        if(gate==null){
            throw new gateNotFoundException("gate With Given id is not present");
        }
        return gate;
    }

    public void addGate(Gate gate){
        gate.setId(++idCounter);
        gateDB.put(gate.getId(), gate);
        System.out.println("gate has been Added successfully");
    }
}
