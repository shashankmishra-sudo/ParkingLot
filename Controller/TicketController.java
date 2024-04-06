package ProjectsByShashank.ParkingLot.Controller;

import ProjectsByShashank.ParkingLot.Exceptions.InvalidRequestException;
import ProjectsByShashank.ParkingLot.Model.Ticket;
import ProjectsByShashank.ParkingLot.Model.Vehicle;
import ProjectsByShashank.ParkingLot.Service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        if(gateId <= 0 || parkingLotId <= 0){
            throw new InvalidRequestException("Please enter valid request");
        }
        return ticketService.generateTicket(vehicle, gateId, parkingLotId);
    }
}
