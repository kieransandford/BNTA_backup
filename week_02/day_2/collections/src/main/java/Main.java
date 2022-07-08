import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String item1 = "milk";
        String item2 = "bread";
        String item3 = "coffee";
        String item4 = "toothpaste";

        String[] shoppingList = new String[5];

        // inserting into array
        shoppingList[0] = "milk";

        shoppingList[4] = "biscuits";

        // create array list

        ArrayList<String> betterShoppingList = new ArrayList();

       // System.out.println(betterShoppingList);

        // add items
        betterShoppingList.add("milk");
        betterShoppingList.add("bread");
        betterShoppingList.add("eggs");

       // System.out.println(betterShoppingList);

        // find index of item
       // System.out.println(betterShoppingList.indexOf("bread"));

        // show index value
       // System.out.println(betterShoppingList.get(2));

        // count items in array list
       // System.out.println(betterShoppingList.size());

        // remove item by index number
        betterShoppingList.remove(0);

       // System.out.println(betterShoppingList.indexOf("bread"));

        // check if item is present
       // System.out.println(betterShoppingList.contains("milk"));

        // clear all indexes
        betterShoppingList.clear();

        // check if empty
       // System.out.println(betterShoppingList.isEmpty());





        // Map - HashMap

        // key-value pairs

        HashMap<String, Integer> mappedShoppingList = new HashMap();

        // adding a value

        mappedShoppingList.put("milk", 3);
        mappedShoppingList.put("bread", 10);
        mappedShoppingList.put("eggs", 15);

        // accessing a value

        System.out.println(mappedShoppingList.get("milk"));

        // remove a value

        mappedShoppingList.remove("eggs");

        // edit a value

        mappedShoppingList.replace("bread", 6);

        System.out.println(mappedShoppingList.get("bread"));

        // add a null value

        mappedShoppingList.replace("milk", null);

        // see all keys

        System.out.println(mappedShoppingList.keySet());

        // see all values

        //System.out.println(mappedShoppingList.Values);



    }

}
