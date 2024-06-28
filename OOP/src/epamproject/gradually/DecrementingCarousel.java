package epamproject.gradually;

public class DecrementingCarousel {
    final int[] nums; // creating int array
    int count; // count the size
    final int capacity; // capacity
    boolean run; // is running or not

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity; // initializing
        this.nums = new int[capacity];
        this.count = 0;
        this.run = false;
    }

    public boolean addElement(int element) {
        if (run || element <= 0 || count >= capacity) {
            return false; // if it is running or element is 0 or capacity is full return false
        }
        nums[count++] = element; // otherwise adds element and returns true
        return true;
    }

    public CarouselRun run() {
        if (!run) { // if it is run for the first time
            this.run = true; // checking if it is running or not
            return new CarouselRun(nums, count); // initializing CarouselRun
        } else {
            return null;
        }
    }
}
