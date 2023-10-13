import java.util.Arrays;

public class StatisticsMeanMedian {
    public static void main(String[] args) {
        System.out.println("STATISTICS");

        // Data Structure - Array
        int[] numbers = {
             5,  5, 10, 12, 12,
            16, 17, 17, 17, 16,
            16, 15, 15, 15, 15,
            16, 16,
            16,
            16, 16,
            16, 16, 16, 16, 16,
            16, 17, 17, 17, 20, 
            20, 20, 25, 27, 30
        };

        System.out.println("Dataset's total number of items: " + numbers.length);

        // MEAN or AVERAGE
        // for (initialize; check; update) {}
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum: " + sum);

        float mean = (float) sum / numbers.length;
        // System.out.println("The Mean is " + mean);
        System.out.format("Mean: %.2f\n", mean);


        // MEDIAN
        // Middle item for odd-numbered population
        // Average of two middle items for even-numbered population
        // + - * /
        // % Modulo or remainer operator
        // int quotient = 28 / 2;
        // int remainder = 28 % 2;
        // System.out.println("Quotient: " + quotient);
        // System.out.println("Remainder: " + remainder);
        // boolean isEven = false;
        // if (remainder == 0) {
        //     isEven = true;
        // }
        // System.out.println("Even? " + isEven);

        // System.out.println("PRIOR SORT");
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(i + ". " + numbers[i]);
        // }

        
        Arrays.sort(numbers);
        System.out.println("AFTER SORT");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+1 + ". " + numbers[i]);
        }


        float MEDIAN = 0;
        boolean isEven = (numbers.length % 2 == 0);
        int mid = numbers.length / 2;
        if (isEven) {
            MEDIAN = (float) (numbers[mid-1] + numbers[mid]) / 2;
        } else {
            // Odd
            // (35 / 2) + 1= 17 (Array starts from 0)
            // numbers[0] .. numbers[34] = 35 total items
            MEDIAN = numbers[mid];
        }
        System.out.println("Median: " + MEDIAN);

        // MODE
    }
}