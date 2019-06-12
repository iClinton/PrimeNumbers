/*Returns primes numbers with a set Range*/
package javaapplication16;
import java.util.ArrayList;
/* @author Clinton*/
public class PrimeNumbers {

    private final int startNumber;
    private final int finalNumber;

    public PrimeNumbers(int startNumber, int finalNumber) {
        this.startNumber = startNumber;
        this.finalNumber = finalNumber;
    }

    public ArrayList<Integer> myNumbers() {
        //Creates two lists. one for storing the primes numbers and one for the results of numbers being divided.
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> DivNums = new ArrayList<>();
        for (int i = startNumber; i < finalNumber; i++) {
            for (int j = 1; j < i; j++) {
                //if a number has remainder of 0 add it to divied number list
                if (i % j == 0) {
                    DivNums.add(i / j);
                }
            }
            //if the size of the array is 1, add it to prime number list, as it's prime number.
            if (DivNums.size() == 1) {
                List.add(i);
            }
            //Empty the divied number list.
            DivNums.clear();
        }
        return List;
    }
}
