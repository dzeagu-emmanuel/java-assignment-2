package question1;

public class LargestElement {
    public static void main(String[] args) {
        int [] numbers = {5,7,10,25,15,13};
        int arrayLength = numbers.length;
        int largestNumber = numbers[0];

        for (int i = 1; i < arrayLength; i++) {
            if(largestNumber < numbers[i] ) {
                largestNumber = numbers[i];
            }

        }
        System.out.println("The largest number is: " + largestNumber);

    }

}
