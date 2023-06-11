import java.util.Scanner;

public class CapitalArray {
    private String [][] arrStateCapital = {
        {"Alabama", "Montgomery"},
        {"Alaska", "Juneau"},
        {"Arizona", "Phoenix"},
        {"Arkansas", "Little Rock"},
        {"California", "Sacramento"},
        {"Colorado", "Denver"},
        {"Connecticut", "Hartford"},
        {"Delaware", "Dover"},
        {"Florida", "Tallahassee"},
        {"Georgia", "Atlanta"},
        {"Hawaii", "Honolulu"},
        {"Idaho", "Boise"},
        {"Illinois", "Springfield"},
        {"Indiana", "Indianapolis"},
        {"Iowa", "Des Moines"},
        {"Alaska", "Juneau"},
        {"Alaska", "Juneau"},
        {"Alaska", "Juneau"},
        {"Alaska", "Juneau"},
        {"Alaska", "Juneau"},
        {"Alaska", "Juneau"},
        {"Alaska", "Juneau"},
        {"Alaska", "Juneau"},
    };

    public String GetUserInput(String prompt){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(prompt);

        return scannerObj.nextLine();
    }
}
