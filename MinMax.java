public class MinMax {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
}
