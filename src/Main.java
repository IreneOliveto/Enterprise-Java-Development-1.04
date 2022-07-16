import java.util.*;

public class Main {

    public static void main(String[] args) {

        int numbers[] = new int[]{1, 2, 3, 4, 5};

        int smallest = numbers[0];
        int largest = numbers[0];
        int secondSmallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        System.out.println(+(largest - smallest));

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < secondSmallest)
                secondSmallest = numbers[i+1];
        }

        System.out.println(+(secondSmallest));



    }

}