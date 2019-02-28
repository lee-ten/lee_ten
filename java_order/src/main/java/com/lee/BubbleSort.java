package com.lee;

/**
 * @author  lee
 * @Description: buddle sort
 * @Date: 2019/2/28
 * @Time: 12:59
 */
public class BubbleSort {

    private static void bubbleSort(int[] array) {
        if (null == array || array.length == 0) {
            throw new SortException("array is empty");
        }

        int temp = 0;
        for (int i = 1;i < array.length;i++) {
            for (int j = 0;j < array.length - i;j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{0,2,3,5,1,6};
        bubbleSort(array);

        for (int i = 0;i < array.length;i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }
}
