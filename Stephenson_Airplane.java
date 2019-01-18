//Author Name: Jacob Stephenson
//Date: 12/01/2018
//Program Name: Stephenson_Airplane
//Purpose: Main application which integrated UI with backend 

import java.util.List;

public class Stephenson_Airplane {
   private List<Stephenson_Seat> seats;

    public List getSeats() {
        return seats;
    }

    public void setSeats(List seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        String result="";
        for(Stephenson_Seat seat:seats)
        {
            result+=seat;
        }
        
       return result;
    }
    
    //method to find the seat by name. 
    public Stephenson_Seat findSeatByName(String name)
    {
        for(Stephenson_Seat seat:seats)
        {
           if(seat.getName().equalsIgnoreCase(name) && seat.getIsLightOn()==false)
           {
               return seat;
           }
        }
        return null;
    }
    
    //to check if the seat name entered by the user exist.
     public boolean doesSeatNameExist(String name)
    {
        Boolean result=false;
        for(Stephenson_Seat seat:seats)
        {
           if(seat.getName().equalsIgnoreCase(name))
           {
               result=true;
               break;
           }
        }
        return result;
    }
     
    //Reset all seats to false. This is used by the attender.
     
    public void resetAllSeats()
    {
        for(Stephenson_Seat seat:seats)
        {
           seat.setIsLightOn(false);
        }
    }
    
    
}
