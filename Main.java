public class SortExample {
    public static void main(String[] args) {
        int[] numbers = {9, 3, 7, 1, 5, 2};
        int[] sortedNumbers = sortAscending(numbers);
        
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + " ");
        }
    }

    public static int[] sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
