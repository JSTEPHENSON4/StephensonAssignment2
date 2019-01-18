//Author Name: Jacob Stephenson
//Date: 12/01/2018
//Program Name: Stephenson_Seat
//Purpose: Seat class which has status of light and a name


//Seat is a part of Airplane.
public class Stephenson_Seat {
    
    //class attributes
    private String name;
    private Boolean isLightOn;

    
    //creation of attribute beans
    public Stephenson_Seat(String name, Boolean isLightOn) {
        this.name = name;
        this.isLightOn = isLightOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsLightOn() {
        return isLightOn;
    }

    public void setIsLightOn(Boolean isLightOn) {
        this.isLightOn = isLightOn;
    }

    //This is used to display the object in System.out.println
    @Override
    public String toString() {
        return name+","+setOnOff(isLightOn)+"\n";
    }
    
    //this method is to convert boolean true/false to on/off 
    public String setOnOff(Boolean isLightOn)
    {
        String result="";
        if(isLightOn)
        {
            result="on";
        }
        else
            result="off";
     return result;
        
    }
    
    
}
