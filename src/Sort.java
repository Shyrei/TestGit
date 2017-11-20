import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Collection;

public class Sort {

    static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
					System.out.println("method bubleSort ooo");
                    System.out.println("lalala");
                    System.out.println("Push with error22222");
					System.out.println("pp2222pp");
                }
            }
        }
    }
}
