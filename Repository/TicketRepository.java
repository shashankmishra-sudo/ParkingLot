package ProjectsByShashank.ParkingLot.Repository;

import ProjectsByShashank.ParkingLot.Exceptions.TicketNotFoundException;
import ProjectsByShashank.ParkingLot.Model.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private static int idCounter=0;

    private HashMap<Integer, Ticket> ticketDB;

    public TicketRepository() {
        this.ticketDB = new HashMap<>();
    }

    public Ticket getTicket(int ticketId){
        Ticket ticket=ticketDB.get(ticketId);
        if(ticket==null){
            throw new TicketNotFoundException("Ticket With Given id is not present");
        }
        return ticket;
    }

    public Ticket addTicket(Ticket ticket){
        ticket.setId(++idCounter);
        ticketDB.put(ticket.getId(), ticket);
        System.out.println("Ticket has been Added successfully");
        return ticket;
    }
}
