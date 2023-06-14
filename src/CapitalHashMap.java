import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CapitalHashMap {
    //init hashmap object of string,string
    private Map<String, String> hashStateCapital = new HashMap<String, String>();

    public CapitalHashMap(){
        //insert data into hashmap in constructor
        hashStateCapital.put("Alabama", "Montgomery");
        hashStateCapital.put("Alaska", "Juneau");
        hashStateCapital.put("Arizona", "Phoenix");
        hashStateCapital.put("Arkansas", "Little Rock");
        hashStateCapital.put("California", "Sacramento");
        hashStateCapital.put("Colorado", "Denver");
        hashStateCapital.put("Connecticut", "Hartford");
        hashStateCapital.put("Delaware", "Dover");
        hashStateCapital.put("Florida", "Tallahassee");
        hashStateCapital.put("Georgia", "Atlanta");
        hashStateCapital.put("Hawaii", "Honolulu");
        hashStateCapital.put("Idaho", "Boise");
        hashStateCapital.put("Illinois", "Springfield");
        hashStateCapital.put("Indiana", "Indianapolis");
        hashStateCapital.put("Iowa", "Des Moines");
        hashStateCapital.put("Kansas", "Topeka");
        hashStateCapital.put("Kentucky", "Frankfort");
        hashStateCapital.put("Louisiana", "Baton Rouge");
        hashStateCapital.put("Maine", "Augusta");
        hashStateCapital.put("Maryland", "Annapolis");
        hashStateCapital.put("Massachusetts", "Boston");
        hashStateCapital.put("Michigan", "Lansing");
        hashStateCapital.put("Minnesota", "St. Paul");
        hashStateCapital.put("Mississippi", "Jackson");
        hashStateCapital.put("Missouri", "Jefferson City");
        hashStateCapital.put("Montana", "Helena");
        hashStateCapital.put("Nebraska", "Lincoln");
        hashStateCapital.put("Nevada", "Carson City");
        hashStateCapital.put("New Hampshire", "Concord");
        hashStateCapital.put("New Jersey", "Trenton");
        hashStateCapital.put("New Mexico", "Santa Fe");
        hashStateCapital.put("New York", "Albany");
        hashStateCapital.put("North Carolina", "Raleigh");
        hashStateCapital.put("North Dakota", "Bismarck");
        hashStateCapital.put("Ohio", "Columbus");
        hashStateCapital.put("Oklahoma", "Oklahoma City");
        hashStateCapital.put("Oregon", "Salem");
        hashStateCapital.put("Pennsylvania", "Harrisburg");
        hashStateCapital.put("Rhode Island", "Providence");
        hashStateCapital.put("South Carolina", "Columbia");
        hashStateCapital.put("South Dakota", "Pierre");
        hashStateCapital.put("Tennessee", "Nashville");
        hashStateCapital.put("Texas", "Austin");
        hashStateCapital.put("Utah", "Salt Lake City");
        hashStateCapital.put("Vermont", "Montpelier");
        hashStateCapital.put("Virginia", "Richmond");
        hashStateCapital.put("Washington", "Olympia");
        hashStateCapital.put("West Virginia", "Charleston");
        hashStateCapital.put("Wisconsin", "Madison");
        hashStateCapital.put("Wyoming", "Cheyenne");
    }

    // this method returns the user input
    public String GetUserInput(String prompt) {

        // init a scanner to read the user's input
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(prompt);

        return scannerObj.nextLine();
    }

    //returns the hashmap
    public Map<String, String> GetStateCapitalHM(){
        return hashStateCapital;
    }

    //inits a treemap, populated by hashmap
    public TreeMap<String, String> GetSortedTreeMap(){
        return new TreeMap<String, String>(hashStateCapital);        
    }

    //method for handling the game of entering state
    //and returning the capital
    public String GetCapitalForStateGame(){
        //get user input with prompt for state
        String strUserState = GetUserInput("Enter a state...");
        //inits a case insensitive-key treemap
        Map<String, String> treeStateCapital = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        //populates with state-capital data
        treeStateCapital = PopulateCaseInsensitive(treeStateCapital);
        //gets the object value based on what user entered
        String objStateCapital = treeStateCapital.get(strUserState);     
        return objStateCapital;
    }

    private Map<String, String> PopulateCaseInsensitive(Map<String, String> treeMap){
        //insert data into treemap
        treeMap.put("Alabama", "Montgomery");
        treeMap.put("Alaska", "Juneau");
        treeMap.put("Arizona", "Phoenix");
        treeMap.put("Arkansas", "Little Rock");
        treeMap.put("California", "Sacramento");
        treeMap.put("Colorado", "Denver");
        treeMap.put("Connecticut", "Hartford");
        treeMap.put("Delaware", "Dover");
        treeMap.put("Florida", "Tallahassee");
        treeMap.put("Georgia", "Atlanta");
        treeMap.put("Hawaii", "Honolulu");
        treeMap.put("Idaho", "Boise");
        treeMap.put("Illinois", "Springfield");
        treeMap.put("Indiana", "Indianapolis");
        treeMap.put("Iowa", "Des Moines");
        treeMap.put("Kansas", "Topeka");
        treeMap.put("Kentucky", "Frankfort");
        treeMap.put("Louisiana", "Baton Rouge");
        treeMap.put("Maine", "Augusta");
        treeMap.put("Maryland", "Annapolis");
        treeMap.put("Massachusetts", "Boston");
        treeMap.put("Michigan", "Lansing");
        treeMap.put("Minnesota", "St. Paul");
        treeMap.put("Mississippi", "Jackson");
        treeMap.put("Missouri", "Jefferson City");
        treeMap.put("Montana", "Helena");
        treeMap.put("Nebraska", "Lincoln");
        treeMap.put("Nevada", "Carson City");
        treeMap.put("New Hampshire", "Concord");
        treeMap.put("New Jersey", "Trenton");
        treeMap.put("New Mexico", "Santa Fe");
        treeMap.put("New York", "Albany");
        treeMap.put("North Carolina", "Raleigh");
        treeMap.put("North Dakota", "Bismarck");
        treeMap.put("Ohio", "Columbus");
        treeMap.put("Oklahoma", "Oklahoma City");
        treeMap.put("Oregon", "Salem");
        treeMap.put("Pennsylvania", "Harrisburg");
        treeMap.put("Rhode Island", "Providence");
        treeMap.put("South Carolina", "Columbia");
        treeMap.put("South Dakota", "Pierre");
        treeMap.put("Tennessee", "Nashville");
        treeMap.put("Texas", "Austin");
        treeMap.put("Utah", "Salt Lake City");
        treeMap.put("Vermont", "Montpelier");
        treeMap.put("Virginia", "Richmond");
        treeMap.put("Washington", "Olympia");
        treeMap.put("West Virginia", "Charleston");
        treeMap.put("Wisconsin", "Madison");
        treeMap.put("Wyoming", "Cheyenne");

        return treeMap;
    }
}
