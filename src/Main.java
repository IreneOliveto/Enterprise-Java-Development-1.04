
public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{8, 2, 7, 4, 5, 10};

        System.out.println(differenceMaxMin(numbers));

        smallestAndSecondSmallest(numbers);

        System.out.println("The result of the function is: " +function(1.0, 6.7));
    }

    //method
    public static int differenceMaxMin(int[] numbers) {
        int smallest = numbers[0];
        int largest = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest)
                largest = numbers[i];
            if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        return largest - smallest;
    }

    public static void smallestAndSecondSmallest(int[] numbers) {
        int smallest = numbers[0];
        int secondSmallest = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            }else if(numbers[i] < secondSmallest) {
                  secondSmallest = numbers[i];
            }
        }

        System.out.println("Smallest: " +smallest);
        System.out.println("Second smallest: " +secondSmallest);
    }

    public static double function(double x, double y) {
        return Math.pow(x, 2) + Math.pow((4 * y / 5) - x, 2);
    }
}