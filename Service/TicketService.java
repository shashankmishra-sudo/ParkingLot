package ProjectsByShashank.ParkingLot.Service;

import ProjectsByShashank.ParkingLot.Model.Enums.ParkingSpotStatus;
import ProjectsByShashank.ParkingLot.Model.ParkingLot;
import ProjectsByShashank.ParkingLot.Model.ParkingSpot;
import ProjectsByShashank.ParkingLot.Model.Ticket;
import ProjectsByShashank.ParkingLot.Model.Vehicle;
import ProjectsByShashank.ParkingLot.Repository.GateRepository;
import ProjectsByShashank.ParkingLot.Repository.ParkingLotRepository;
import ProjectsByShashank.ParkingLot.Repository.ParkingSpotRepository;
import ProjectsByShashank.ParkingLot.Repository.TicketRepository;
import ProjectsByShashank.ParkingLot.Service.Stratgy.SpotAllocationStratgy.SpotAllocationStratgy;
import ProjectsByShashank.ParkingLot.Service.Stratgy.SpotAllocationStratgy.SpotAllocationStratgyFactory;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, GateRepository gateRepository, ParkingSpotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        SpotAllocationStratgy strategy = SpotAllocationStratgyFactory.getSpotAllocationFactory();
        ParkingLot parkingLot = parkingLotRepository.getParkingLot(parkingLotId);

        ParkingSpot allocatedSpot = strategy.getSpotForVehicle(parkingLot, vehicle);
        allocatedSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        allocatedSpot.setVehicle(vehicle);
        parkingSpotRepository.addParkingSpot(allocatedSpot);

        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(allocatedSpot);
        ticket.setEntryGate(gateRepository.getGate(gateId));
        return ticketRepository.addTicket(ticket);
    }
}
