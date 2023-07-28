package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numberToSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Integer theSum =ArrayListPractice.sumAllEvenValues(numberToSum);
        System.out.println("The sum is: " + theSum.toString() );
    }

    public static Integer sumAllEvenValues(ArrayList<Integer> valuesToSum) {
        Integer sum=0;
        for (int i = 0; i < valuesToSum.size(); i++) {
            if (valuesToSum.get(i) % 2 == 0) {
                sum=sum + valuesToSum.get(i);
            }
            }
            return sum;

        }
    }
