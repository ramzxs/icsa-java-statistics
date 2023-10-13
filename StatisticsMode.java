import java.util.Arrays;
import java.util.List;

public class StatisticsMode {

    public static void main(String[] args) {
        System.out.println("STATISTICS - MODE");

        int[] numbers = {
            1,1,1,1,1,1,1,1,1,1,1,1,1,1,
            5, 5, 10, 12, 12,
            16, 17, 17, 17, 16,
            16, 15, 15, 15, 15,
            16, 16,
            16,
            16, 16,
            16, 16, 16, 16, 16,
            16, 17, 17, 17, 20,
            20, 20, 25, 27, 30
        };

        // MODE
        // Sort the array
        // Tally the frequency (Frequency Table)
        // Find the number with most occurences / frequency
        Arrays.sort(numbers);

        int[] uniqueNumbers = new int[ numbers.length ];
        for (int i = 0; i < uniqueNumbers.length; i++) {
            uniqueNumbers[i] = -1;
        }
        int min = -1;
        int u = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > min) {
                uniqueNumbers[u] = numbers[i];
                min = numbers[i];
                u++;
            }
        }

        int UNIQUEONLY = 0;
        for (int i = 0; i < uniqueNumbers.length; i++) {
            if (uniqueNumbers[i] != -1) {
                UNIQUEONLY++;
            } else {
                break;
            }
        }

        int[] uniqueNumbers2 = new int[UNIQUEONLY];
        for (int i = 0; i < uniqueNumbers2.length; i++) {
            uniqueNumbers2[i] = uniqueNumbers[i];
        }

        // System.out.println("Use " + uniqueOnly + " for new dimension");

        // System.out.println("UNIQUE NUNBERS:");
        // for (int i = 0; i < uniqueNumbers.length; i++) {
        //     if (uniqueNumbers[i] == -1) {
        //         break;
        //     }
        //     System.out.println(i + ". " + uniqueNumbers[i]);
        // }

        // TALLY
        int[] tally = new int[ UNIQUEONLY ];
        int lastSortedIndex = 0;
        for (int u2 = 0; u2 < uniqueNumbers2.length; u2++) {
            for (int s = lastSortedIndex; s < numbers.length; s++) {
                if (uniqueNumbers2[u2] == numbers[s]) {
                    tally[u2] += 1;
                } else {
                    lastSortedIndex = s;
                    // System.out.println(lastSortedIndex);
                    break;
                }
            }
        }
        System.out.println("TALLY TABLE:");
        for (int i = 0; i < tally.length; i++) {
            if (tally[i] == 0) {
                break;
            }
            System.out.println(i+1 + ". " + uniqueNumbers2[i] + " = " + tally[i]);
        }

        int highestFreq = 0;
        for (int i = 0; i < tally.length; i++) {
            if (tally[i] > highestFreq) {
                highestFreq = tally[i];
            }
        }
        System.out.println("Highest Frequency: " + highestFreq);

        int[] numbersWithHF = new int[uniqueNumbers2.length];
        int nwhf = 0;
        for (int i = 0; i < tally.length; i++) {
            if (tally[i] == highestFreq) {
                numbersWithHF[nwhf] = uniqueNumbers2[i];
                nwhf++;
            }
        }
        /*
        System.out.println("NUMBERS WITH MOST FREQ:");
        int sum = 0;
        int i = 0;
        for (; i < numbersWithHF.length; i++) {
            if (numbersWithHF[i] == 0) {
                break;
            }
            System.out.println(i + ". " + numbersWithHF[i]);
            sum += numbersWithHF[i];
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("No. of number with HF: " + i);
        System.out.println("MODE: " + (float) sum / i);
        */

        System.out.println("MODE(S): ");
        for (int i = 0; i < numbersWithHF.length; i++) {
            if (numbersWithHF[i] == 0) {
                break;
            }
            System.out.println(numbersWithHF[i]);
        }

    }

}