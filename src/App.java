public class App {
    public static void main(String[] args) throws Exception {

        //init new instance of Capital Array object
        CapitalArray capitalArray = new CapitalArray();

        //Prompt user for capital, return their response
        String userInput = capitalArray.GetUserInput("Enter a capital...");
        //Call for capital check method
        boolean boolIsCapitalInList = capitalArray.IsCapitalInList(userInput);

        //handle displaying if user is correct
        if (boolIsCapitalInList == true) {
            System.out.println("User is correct!");
        } else {
            System.out.println("User is incorrect.");
        }

        //returns the array
        String[][] arrCapital = capitalArray.GetCapitalArray();

        //prints the array
        for (String[] string : arrCapital) {
            System.out.println(string[0] + " - " + string[1]);
        }

        //call for bubble sorting method
        String[][] sortedCapitalArray = capitalArray.BubbleSort(arrCapital);
        //separator for pre and post bubble sort
        System.out.println("-----------Results after bubble sort:----------");
        //prints array after bubble sort
        for (String[] string : sortedCapitalArray) {
            System.out.println(string[0] + " - " + string[1]);
        }
        //call for capital game that prompts user to enter the capital for state
        //then displays the correct count
        capitalArray.CapitalGame();

    }
}
