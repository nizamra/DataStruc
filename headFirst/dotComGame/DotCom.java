import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locals){
        this.locationCells = locals;
    }
    public void setName(String nm){
        this.name = nm;
    }
    public DotCom(ArrayList<String> lo){
        this.locationCells = lo;
    }
    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0 ){
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk "+this.name+" : ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}