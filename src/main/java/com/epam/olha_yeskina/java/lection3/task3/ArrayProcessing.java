package com.epam.olha_yeskina.java.lection3.task3;


/**
 * В массиве целых чисел поменять местами максимальный отрицательный элемент и минимальный положительный.
 */
public class ArrayProcessing {

    final static int ARRAY_LENGTH = 20;
    final static int MIN = -10;
    final static int MAX = 10;

    public static void main(String[] args) {
        int array[] = new int[ARRAY_LENGTH];
        fillRandomNumberArray(array);
        System.out.println("");
        outputArray(array);
        replaceMaxNegativeValueWithMinPositiveValue(array);
        outputArray(array);
    }

    public static void fillRandomNumberArray(int array[]){
        for (int i=0;i<array.length;i++)
            array[i] = (int) (Math.random() * (MAX - MIN) + MIN);
    }
    public static void outputArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void replaceMaxNegativeValueWithMinPositiveValue(int array[]){
        int maxNegativeValue = 0;
        int minPositiveValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i] > array[maxNegativeValue])
                    maxNegativeValue = i;
                if (array[maxNegativeValue] >= 0)
                    maxNegativeValue = i;
            } else if (array[i] > 0) {
                if (array[i] < array[minPositiveValue])
                    minPositiveValue = i;
                if (array[minPositiveValue] <= 0)
                    minPositiveValue = i;
            }
        }
        int temp = array[maxNegativeValue];
        array[maxNegativeValue] = array[minPositiveValue];
        array[minPositiveValue] = temp;
    }


}
