package com.fcs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] nums = new int[]{25,18,86,7,96};


    }

    public static void quickSort(int[] values, int left ,int right){
        int num = values.length;
        for (int i = left, j = num - 1; j >= 0; j--) {
            int key = values[0];
            if (values[j] < key) {
                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
            }
        }
    }

}
