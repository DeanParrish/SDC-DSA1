import java.util.Properties;
import java.util.Scanner;

public class CapitalArray {

    // array of state capitals, ordered by state
    private String[][] arrStateCapital = {
            { "Alabama", "Montgomery" },
            { "Alaska", "Juneau" },
            { "Arizona", "Phoenix" },
            { "Arkansas", "Little Rock" },
            { "California", "Sacramento" },
            { "Colorado", "Denver" },
            { "Connecticut", "Hartford" },
            { "Delaware", "Dover" },
            { "Florida", "Tallahassee" },
            { "Georgia", "Atlanta" },
            { "Hawaii", "Honolulu" },
            { "Idaho", "Boise" },
            { "Illinois", "Springfield" },
            { "Indiana", "Indianapolis" },
            { "Iowa", "Des Moines" },
            { "Kansas", "Topeka" },
            { "Kentucky", "Frankfort" },
            { "Louisiana", "Baton Rouge" },
            { "Maine", "Augusta" },
            { "Maryland", "Annapolis" },
            { "Massachusetts", "Boston" },
            { "Michigan", "Lansing" },
            { "Minnesota", "St. Paul" },
            { "Michigan", "Lansing" },
            { "Mississippi", "Jackson" },
            { "Missouri", "Jefferson City" },
            { "Montana", "Helena" },
            { "Nebraska", "Lincoln" },
            { "Nevada", "Carson City" },
            { "New Hampshire", "Concord" },
            { "New Jersey", "Trenton" },
            { "New Mexico", "Santa Fe" },
            { "New York", "Albany" },
            { "North Carolina", "Raleigh" },
            { "North Dakota", "Bismarck" },
            { "Ohio", "Columbus" },
            { "Oklahoma", "Oklahoma City" },
            { "Oregon", "Salem" },
            { "Pennsylvania", "Harrisburg" },
            { "Rhode Island", "Providence" },
            { "South Carolina", "Columbia" },
            { "South Dakota", "Pierre" },
            { "Tennessee", "Nashville" },
            { "Texas", "Austin" },
            { "Utah", "Salt Lake City" },
            { "Vermont", "Montpelier" },
            { "Virginia", "Richmond" },
            { "Washington", "Olympia" },
            { "West Virginia", "Charleston" },
            { "Wisconsin", "Madison" },
            { "Wyoming", "Cheyenne" },

    };

    // this method returns the user input
    public String GetUserInput(String prompt) {

        // init a scanner to read the user's input
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(prompt);

        return scannerObj.nextLine();
    }

    // this method iterates through the array and checks if the entered capital is
    // in the array
    public boolean IsCapitalInList(String capital) {
        // lower case to rid of simple casing issues
        String strLowerCapital = capital.toLowerCase();
        for (String[] strings : arrStateCapital) {
            // comparison, if found return true
            if (strings[1].toLowerCase().equals(strLowerCapital)) {
                return true;
            }
        }
        return false;
    }

    public String[][] GetCapitalArray() {
        return arrStateCapital;
    }

    public String[][] BubbleSort(String[][] arr) {
        //bool value to indicate a swap has been made in the array
        boolean boolSwap = true;

        //while to continue calling sort until no more swaps have been made
        while (boolSwap) {
            //set to false for no false positive swaps
            boolSwap = false;
            //iterate array
            for (int i = 0; i < arr.length - 1; i++) { 
                //check first character of second "column" in the array and
                //compare to the next "row"              
                if (arr[i][1].charAt(0) > arr[i + 1][1].charAt(0)) {
                    //do the swap of the array
                    for (int k = 0; k < 2; k++) {
                        String temp = arr[i][k];
                        arr[i][k] = arr[i + 1][k];
                        arr[i + 1][k] = temp;
                    }
                    boolSwap = true;
                }
            }
        }
        return arr;

    }

    public void CapitalGame(){
        //counter for correct answers
        int intTotalCorrect = 0;      

        //loop through each item in the array and ask for capital of state
        for (int i = 0; i < arrStateCapital.length-1; i++) {
            //prompt user for capital, return input
            String strUserInput = GetUserInput("Enter Capital for " + arrStateCapital[i][0]);
            //convert user input and capital to lower for comparison, if equal add one to correct counter 
            if (strUserInput.toLowerCase().equals(arrStateCapital[i][1].toLowerCase())) {
                intTotalCorrect++;
            }
        }

        //display correct answer count
        System.out.println(Integer.toString(intTotalCorrect) + " correct out of 50!");
    }
}
