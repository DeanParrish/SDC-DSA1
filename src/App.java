public class App {
    public static void main(String[] args) throws Exception {

        CapitalArray capitalArray = new CapitalArray();

        String userInput = capitalArray.GetUserInput("Enter a capital...");
        boolean boolIsCapitalInList = capitalArray.IsCapitalInList(userInput);

        if (boolIsCapitalInList == true) {
            System.out.println("User is correct!");
        } else {
            System.out.println("User is incorrect.");
        }

        String[][] arrCapital = capitalArray.GetCapitalArray();

        for (String[] string : arrCapital) {
            System.out.println(string[0] + " - " + string[1]);
        }

        String[][] sortedCapitalArray = capitalArray.BubbleSort(arrCapital);
        System.out.println("-----------Results after bubble sort:----------");

        for (String[] string : sortedCapitalArray) {
            System.out.println(string[0] + " - " + string[1]);
        }

        capitalArray.CapitalGame();

    }
}
