import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        //init new instance of Capital Hashmap object
        CapitalHashMap objCapitalHashMap = new CapitalHashMap();
        
        Map<String,String> hashStateCapital = objCapitalHashMap.GetStateCapitalHM();
        //display the contents of hashmap
        hashStateCapital.forEach((key, values)
        -> System.out.println(key + " - " +values));

        //tree map for sorting by key
        Map<String, String> treeStateCapital = objCapitalHashMap.GetSortedTreeMap();
        System.out.println("-----Tree Map -----");
        //iterate over treemap to show sort
        treeStateCapital.forEach((key, values)
        -> System.out.println(key + " - " +values));

        //start game of entering state and returning capital
        System.out.println("-----Start Game -----");
        String strCapital = objCapitalHashMap.GetCapitalForStateGame();
        if (strCapital != null) {
            System.out.println(strCapital);
        }else{
            System.out.println("Not Found");
        }
    }
}
