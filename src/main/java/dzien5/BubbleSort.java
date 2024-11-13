package dzien5;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 1, 2, 8, 4};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Posortowana tablica: ");
        for (int number : numbers) {
            System.out.println(number + " ");
        }
    }
}
