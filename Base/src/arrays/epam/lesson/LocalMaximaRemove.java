package com.epam.rd.autotasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {
        if (array == null || array.length <= 1) {
            return array.clone();
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        // Add the first element (it can't be a local maximum)
        if(!(array[0]>array[1])) {
            resultList.add(array[0]);
        }
        // Check for local maxima from the second element to the second-to-last element
        for (int i = 1; i < array.length - 1; i++) {
            if (!(array[i] > array[i - 1] && array[i] > array[i + 1])) {
                resultList.add(array[i]);
            }

        }

        // Add the last element (it can't be a local maximum)
        if(!(array[array.length-1]>array[array.length-2])) {
            resultList.add(array[array.length - 1]);

        }
        // Convert resultList back to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
