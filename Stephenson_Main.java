//Author Name: Jacob Stephenson
//Date: 12/01/2018
//Program Name: Stephenson_Main
//Purpose: Main application which integrated UI with backend 


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Stephenson_Main {

  //main method starts here. 
    public static void main(String[] args) {

        Stephenson_Airplane airplane = new Stephenson_Airplane();
        List<Stephenson_Seat> seats = new ArrayList<>();
        seats.add(new Stephenson_Seat("a1", false));
        seats.add(new Stephenson_Seat("a2", false));
        seats.add(new Stephenson_Seat("b1", false));
        seats.add(new Stephenson_Seat("b2", false));
        seats.add(new Stephenson_Seat("c1", false));
        airplane.setSeats(seats);

        //infinite loop untill the user presses q to quit the application. 
        while (true) {
            System.out.println("*********** Options ***********");
            System.out.println("seatName,light Status");
            System.out.print(airplane);
            System.out.println("r,swith off all lights");
            System.out.println("Enter the name to switch on,r to reset,q to quit:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("r")) {
                airplane.resetAllSeats();
                System.out.println("all lights are switched off");
            } else if (input.equalsIgnoreCase("q")) {
                break;
            } else if (airplane.doesSeatNameExist(input)==true) {

                Stephenson_Seat seat = airplane.findSeatByName(input);
                if (seat == null) {
                    System.out.println("lights are currently on for seat:" + input);
                }
                else
                {
                    seat.setIsLightOn(Boolean.TRUE);
                }
            } else {
                System.out.println("invalid choice. Please try again");
            }
        }

    }
}
