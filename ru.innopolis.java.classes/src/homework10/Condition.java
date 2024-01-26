package homework10;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
public class Condition {
    public static void condition(String[] args) {
        byCondition NumbEven = number -> number % 2 == 0;
        byCondition Sumofnumbers = number -> {
            int sum = 0;
            int even = number;
            while (even != 0) {
                sum += even % 10;
                even /= 10;
            }
            return sum % 2 == 0;
        };

            Random n = new Random();
            int array[] = new int[10];
            for (int i = 0; i < 10; i++) {
                array[i] = n.nextInt();
            }

                System.out.println("Массив с числами: " + Arrays.toString(array));
                System.out.println("Четные числа: " + Arrays.toString(Sequence.filter(array, NumbEven));
                System.out.println("Сумма четных чисел: " + Arrays.toString(Sequence.filter(array, Sumofnumbers));

            }
        }






 // {
   //     Pair<Integer, String> pair = Pair.of(1, "hello");
   //     Integer i = pair.getFirst();
    //    String s = pair.getSecond();

    //    Pair<Integer, String> pair2 = Pair.of(1, "hello");
     //   boolean mustBeTrue = pair.equals(pair2); // true!
     //   boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
  //  }
