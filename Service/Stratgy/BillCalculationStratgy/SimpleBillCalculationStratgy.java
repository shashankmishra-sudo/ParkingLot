package ProjectsByShashank.ParkingLot.Service.Stratgy.BillCalculationStratgy;

import ProjectsByShashank.ParkingLot.Model.Bill;
import ProjectsByShashank.ParkingLot.Model.Enums.BillStatus;
import ProjectsByShashank.ParkingLot.Model.ParkingLot;
import ProjectsByShashank.ParkingLot.Model.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SimpleBillCalculationStratgy implements BillCalculationStratgy{

    @Override
    public Bill generateBill(Ticket ticket) {
        //1Sec 10 rs
        LocalDateTime entryTime=ticket.getEntryTime();
        LocalDateTime exitTime=LocalDateTime.now();
        long numberOfSec= ChronoUnit.SECONDS.between(exitTime,entryTime);
        long amount=numberOfSec*10;
        Bill bill=new Bill();
        bill.setAmount(amount);
        bill.setTicket(ticket);
        bill.setExitTime(exitTime);
        bill.setId(entryTime.hashCode());
//        bill.setExitGate();
        bill.setStatus(BillStatus.UNPAID);
        return bill;
    }
}
