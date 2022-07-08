package _1_enums;

public class Main {


    public static void main(String[] args) {

       Trees tree = Trees.CONNIFER;

        // check enum using if

        if(tree == Trees.CONNIFER) {
            System.out.println("This tree is evergreen");
        }

        // check enum using switch

       switch (tree) {
           case OAK:
               System.out.println("Old tree");
               break;
           case ASH:
               System.out.println("Fast growing tree");
               break;
           case BIRCH:
               System.out.println("Skinny tree");
               break;
           case CONNIFER:
               System.out.println("Evergreen tree");
               break;
           case CHERRY:
               System.out.println("Produces cherries");
               break;
           default:
               System.out.println("No trees found");

       }

    }

}
