import java.util.Collection;

public class Sort {

    static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
					System.out.println("method bubleSort");
					System.out.println("method2");
                }
            }
        }
    }
}
