package ProjectsByShashank.ParkingLot.Service.Stratgy.BillCalculationStratgy;

public class BillCalculationStratgyFactory {

    //Add Surgecalculationstratgy with Switch
    public static BillCalculationStratgy getBillCalculationStratgy()
    {
        return new SimpleBillCalculationStratgy();
    }
}
