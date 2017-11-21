class Sort {

    // метод полностью рабочий - ничего не удалять


    // THIS IS JAVA LAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB!

    //  не удалять никогда

    //изменяем проект вместе с Ксюшей - надо чтобы был конфликт


    static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
