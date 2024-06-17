package com.epam.rd.autotasks;

class CycleSwap {

    public static void cycleSwap(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int lastElement = array[array.length - 1];
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = lastElement;
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        int effectiveShift = shift % length;
        if (effectiveShift == 0) {
            return;
        }
        int[] tempArray = new int[length];
        System.arraycopy(array, length - effectiveShift, tempArray, 0, effectiveShift);
        System.arraycopy(array, 0, tempArray, effectiveShift, length - effectiveShift);
        System.arraycopy(tempArray, 0, array, 0, length);
    }

}
