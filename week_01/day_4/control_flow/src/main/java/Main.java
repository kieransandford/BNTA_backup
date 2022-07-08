public class Main {

    public static void main(String[] args) {

        int priceOfBook = 5;
        int amountInWallet = 5;
        int booksInStock = 10;

        if (amountInWallet >= priceOfBook && booksInStock > 0) {
            System.out.println("You've got more than enough to pay for the book!");
            System.out.println("Thanks for shopping with us.");
        } else {
            System.out.println("Sorry, you can't afford that.");
        }

    }

}