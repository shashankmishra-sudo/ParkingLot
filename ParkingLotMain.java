package ProjectsByShashank.ParkingLot;

import ProjectsByShashank.ParkingLot.Controller.InitController;
import ProjectsByShashank.ParkingLot.Controller.TicketController;
import ProjectsByShashank.ParkingLot.Model.Enums.VehicleType;
import ProjectsByShashank.ParkingLot.Model.ParkingLot;
import ProjectsByShashank.ParkingLot.Model.Ticket;
import ProjectsByShashank.ParkingLot.Model.Vehicle;
import ProjectsByShashank.ParkingLot.Repository.*;
import ProjectsByShashank.ParkingLot.Service.InitializationService;
import ProjectsByShashank.ParkingLot.Service.TicketService;

import java.util.Scanner;

public class ParkingLotMain {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository=new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository=new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository=new ParkingFloorRepository();
        GateRepository gateRepository=new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();

        //Dependency Injection
        InitializationService initializationService=new InitializationService(
                gateRepository,
                parkingLotRepository,
                parkingSpotRepository,
                parkingFloorRepository
        );

        TicketService ticketService = new TicketService(
                ticketRepository,
                parkingLotRepository,
                gateRepository,
                parkingSpotRepository
        );
        TicketController ticketController=new TicketController(ticketService);
        InitController initController=new InitController(initializationService);
        System.out.println("******Initialization Start***********");
        ParkingLot parkingLot=initController.init();
        System.out.println("*******Initialization End***************");



        Scanner sc=new Scanner(System.in);


        while(true){
            System.out.println("Please Enter AN option:-> 1. Enter To ParkingLot 2.Exit To Parking Lot 3. Exit");
            int option= sc.nextInt();
            if(option==1){
                Vehicle vehicle=new Vehicle();
                System.out.println("Welcome To Parking Lot");
                System.out.println("Please Enter Your Vehicle Details");
                System.out.println("Please Enter Vehicle Number");
                String vehicleNumber=sc.next();
                vehicle.setVehicleNumber(vehicleNumber);
                System.out.println("Please Enter Vehicle clour");
                String colour=sc.next();
                vehicle.setColor(colour);
                System.out.println("Please choose the Vehicle Type:-> 1. CAR 2. Bike");
                int option1=sc.nextInt();
                if(option1==1){
                    vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
                }
                else{
                    vehicle.setVehicleType(VehicleType.TWO_WHEELER);
                }

                //These things handled by UI, but we dont have UI so Creating Like This
                System.out.println("Please enter PArkingLotId");
                int parkindlotId=sc.nextInt();
                System.out.println("Enter Gate Id");
                int gateId=sc.nextInt();
                Ticket ticket=ticketController.generateTicket(vehicle,gateId,parkindlotId);
                System.out.println("Ticket Details:-> "+ticket);
            }
            else if(option==2){
                // ask user for ticketId, and gate ID
                // call billcontroller
                // print bill details
                // ask for payment method
                // mark the bill as paid, and done.
            }
            else{
                System.out.println("Thanks");
                break;
            }
        }


    }
}
