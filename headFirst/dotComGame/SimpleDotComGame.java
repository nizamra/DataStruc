import java.util.Scanner;
public class SimpleDotComGame {
    
    public static void main(String[] args){
        int numOfGuesses = 0;
        int locals = (int)(Math.random()*5);
        int [] locations = {locals,locals+1,locals+2};
        SimpleDotCom dot = new SimpleDotCom();
        dot.setLocationCells(locations);
        boolean isAlive=true;
        Scanner scanner = new Scanner (System.in);
        while(isAlive==true){
            numOfGuesses++;
            System.out.print("Enter a number: ");  
            String userGuess = scanner.next();
            String res = dot.checkYourself(userGuess);
            if (res.equals("kill")){
                isAlive=false;
                System.out.println("you took "+numOfGuesses+" guesses");
            }
        }
        scanner.close();
    }
}
