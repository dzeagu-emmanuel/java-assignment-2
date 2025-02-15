package question5;

public class Sum2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for (int[] row : array) {
            for (int value : row) {
                sum += value;
            }
        }

        System.out.println("Sum of all elements in the 2D array: " + sum);
    }
}
