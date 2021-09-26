public class SimpleDotComTestDrive {
    
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        
        // int random = rand(0,5);
        int [] locations = {1,2,3};

        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")){
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
