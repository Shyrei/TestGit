import java.util.Collection;

public class Sort {

    static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
<<<<<<< HEAD
					System.out.println("method bubleSort");
					System.out.println("method2");
=======
					System.out.println("method bubleSort ooo");
>>>>>>> 14079c46c5086de3923bd715c14b6c1ed1b4e6a4
                }
            }
        }
    }
}
