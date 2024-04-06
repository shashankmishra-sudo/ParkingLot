package ProjectsByShashank.ParkingLot.Model;

import ProjectsByShashank.ParkingLot.Model.Enums.GateStatus;
import ProjectsByShashank.ParkingLot.Model.Enums.GateType;

public class Gate extends BaseModel{
    private int gateNumber; //Format of gate number:- 101 -> floor 1, gate no 01
    private GateType gateType;
    private GateStatus gateStatus;
    private String operatorName;

    public Gate() {
    }

    public Gate(int gateNumber, GateType gateType, GateStatus gateStatus, String operatorName) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.operatorName = operatorName;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
