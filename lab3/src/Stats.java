import java.util.Arrays;

/**
 * A class to do statistical calculations on a set of data
 */
public class Stats {

    /**
     * An array to store a list of numbers
     */
    int[] numbers;
    /**
     * Number of values stored in numbers array at given time
     */
    int count;


    /**
     * @param value to be added to the numbers array
     */
    public void addValue(int value) {
        //sets count to the value given
        numbers[count] = value;
        //increments count
        count++;
    }

    /**
     * @return length of the of numbers array
     */
    public int getCount() {
        return numbers.length;
    }

    /**
     * @return the maximum value in numbers array
     */
    public int getMaxValue() {
        int maxVal = numbers[0];

        //for loop to go through numbers array and find the biggest value
        for (int i = 1; i < numbers.length; i++) {
            //if statement to change max value if i is bigger than current max value
            if (numbers[i] > maxVal)
                maxVal = numbers[i];
        }
        return maxVal;
    }

    /**
     * @return the minimum value in numbers array
     */
    public int getMinValue() {
        int minVal = numbers[0];

        //for loop to go through numbers array and find the smallest value
        for (int i = 1; i < numbers.length; i++) {
            //if statement to change min value if i is smaller than current min value
            if (numbers[i] < minVal)
                minVal = numbers[i];
        }
        return minVal;
    }

    /**
     * @return the total of the values in numbers array
     */
    public int getTotal() {
        int total = 0;
        //for loop to find that total of each value in the array until all values have been added
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * @return the average of the values in numbers array
     */
    public double getAverage() {
        int total = 0;
        //for loop adds each value to x
        for (int i = 0; i < numbers.length; i++) {

            total += numbers[i];
        }
        //divides the total of values by the length of array and stores as a double value y (the average)
        double average = total/(double)numbers.length;

        return average;
    }

    /**
     * @return the string of values from numbers array
     */
    @Override
    public String toString() {
        //returns the numbers array as a string
        return Arrays.toString(numbers);
    }

    /**
     * @param length to be set for max values in stats
     */
    //constructor
    public Stats(int length) {
        //sets up numbers array to be length given
        numbers = new int[length];
    }

}