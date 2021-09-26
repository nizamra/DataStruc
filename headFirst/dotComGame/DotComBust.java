import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;

    public void setUpGame() {
        // int locals = (int)(Math.random()*5);
        ArrayList<String> locations = new ArrayList<>();
        // locations.add(""+locals);
        // locations.add(""+locals+1);
        // locations.add(""+locals+2);

        DotCom dot = new DotCom(locations);
        dot.setName("pets.com");
        DotCom dot1 = new DotCom(locations);
        dot1.setName("eToys.com");
        DotCom dot2 = new DotCom(locations);
        dot2.setName("Go2.com");
        dotComsList.add(dot);
        dotComsList.add(dot1);
        dotComsList.add(dot2);
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Try to sink them all in the fewest number of guesses");
        for (DotCom ship : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            ship.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (DotCom ship : dotComsList) {
            result = ship.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(ship);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame(){
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else { 
            System.out.println("Took you long enough. "+ numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}