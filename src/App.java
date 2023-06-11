public class App {
    public static void main(String[] args) throws Exception {
       
        CapitalArray capitalArray = new CapitalArray();

        String userInput = capitalArray.GetUserInput("Enter a capital...");
        boolean boolIsCapitalInList = capitalArray.IsCapitalInList(userInput);

        if (boolIsCapitalInList == true) {
            System.out.println("User is correct!");
        }else{
            System.out.println("User is incorrect.");
        }

    }
}
