package homework10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Sequence{
    public static int[] filter(int[] array, byCondition condition) {

        ArrayList<Integer> filteredList = new ArrayList<>();
        for (int number : array) {
            if (condition.isOk(number)) {
                filteredList.add(number);

            }
        }
        int[] filteredArray = new int[filteredList.size()];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredArray[i] = filteredList.get(i);
        }
        return filteredArray;
    }
}
