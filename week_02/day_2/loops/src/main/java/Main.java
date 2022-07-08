import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

 //       for (int i = 1; i <= 10; i++) {
        //          System.out.println(i);

 //       }

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("milk");
        shoppingList.add("apples");
        shoppingList.add("crisps");
        shoppingList.add("bread");
        shoppingList.add("eggs");

        // initial value: 0 - because array list starts at 0
        // stop condition: length of array list
        // increment: 1
  //      for (int i = 0; i < shoppingList.size(); i++){
            // print I am buying (thing)
 //           System.out.println("I am buying " + shoppingList.get(i));

 //       }

        /*
        for (int i = shoppingList.size() - 1; i >= 0; i--){
            if (shoppingList.get(i).equals("crisps")){
                System.out.println("YAY CRISPS!");
            } else {
                System.out.println("I am buying " + shoppingList.get(i));
            }
        }
*/

  /*      for (String item : shoppingList) {
            System.out.println("I am buying " + item);
        }
*/
        for (int i = 0; i < shoppingList.size(); i++){
            shoppingList.remove(i);
        }
        System.out.println(shoppingList);
    }
}
