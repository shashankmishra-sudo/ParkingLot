package ProjectsByShashank.ParkingLot.Service.Stratgy.BillCalculationStratgy;

import ProjectsByShashank.ParkingLot.Model.Bill;
import ProjectsByShashank.ParkingLot.Model.ParkingLot;
import ProjectsByShashank.ParkingLot.Model.Ticket;

public interface BillCalculationStratgy {
    Bill generateBill(Ticket ticket);
}
