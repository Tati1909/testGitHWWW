package lesson2;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 1, 0, 0, 0, 1, 1, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                System.out.print(array1[i] = 1);
            } else if (array1[i] == 1) {
                System.out.print(array1[i] = 0);
            }
        }
        System.out.println();

        int[] array2 = new int[8];
        array2[0] = 1;
        System.out.print(array2[0] + " ");
        for (int i = 1; i < array2.length; i++) {
            array2[i] = array2[i - 1] + 3;
            System.out.print(array2[i] + " ");
        }

        System.out.println();

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                System.out.print(array3[i] * 2 + " ");
            } else if (array3[i] > 6) {
                System.out.print(array3[i] + " ");
            }
        }

        System.out.println();

        int[] array4 = {8, 5, 3, 2, 11, 1, 5, 2, 4, 8, 9, 25};
        int min = array4[0];
        int max = array4[0];
        for (int i = 1; i < array4.length; i++) {
            if (array4[i] < min)
                min = array4[i];
        }
        System.out.println("Минимальное число массива: " + min);
        for (int i = 1; i < array4.length; i++) {
            if (array4[i] > max)
                max = array4[i];
        }
        System.out.println("Максимальное число массива: " + max);

        int[][] array5 = new int[10][10];
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = 0;
                if (i == j)
                    array5[i][j] = 1;
                if (j == array5.length - i - 1)
                    array5[i][j] = 1;
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

}
