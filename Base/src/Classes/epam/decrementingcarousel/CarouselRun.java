package com.epam.rd.autotasks;

public class CarouselRun {
    private final int[] elements;
    private final int size;
    private int currentIndex;

    public CarouselRun(int[] elements, int size) {//initializing object
        this.elements = new int[size];
        System.arraycopy(elements,0,this.elements,0,size);
        this.size = size;
        this.currentIndex=0;
    }

    public int next() {
        if (isFinished()) {
            return -1;
        }

        while (elements[currentIndex] == 0) {
            currentIndex = (currentIndex + 1) % size;
        }

        int currentValue = elements[currentIndex];
        elements[currentIndex]--;
        currentIndex = (currentIndex + 1) % size;
        return currentValue;
    }

    public boolean isFinished() {
       for(int element:elements){
           if(element>0){
               return false;
           }
       }
       return true;
    }

}
