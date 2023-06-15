package chapter7;
import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
                                           // length in caps
    private static final int LENGTH = 6; // This is a different type of variable. I'm indicating that this is going to be a constant.
                                        // A constant is a field within your class whose value does not change.
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    // Let's go ahead and make this. We'll make it static , it's going to return the lottery ticket as an array.
    public static int[] generateNumbers() {
        // create a new array and let's call it ticket, and we'll give it a length of 6.
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {

            int randomNumber;
        /*
        Generate random number then search to make sure it doesn't
        already exist in the array. If it does, regenerate and search again.
        */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     *
     * @param array             Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {

    /*
    This is called an enhanced loop.
    It iterates through 'array' and
    each time assigns the current element to 'value'
    */
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
    /*
    If we've reached this point, then the entire array was searched
    and the value was not found
    */
        return false;
    }

    public static void printTicket(int ticket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " |  ");
        }
    }
}
