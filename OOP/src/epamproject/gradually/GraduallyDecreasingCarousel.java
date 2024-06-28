package epamproject.gradually;

public class GraduallyDecreasingCarousel extends DecrementingCarousel {
    public GraduallyDecreasingCarousel(int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (!run) {
            this.run = true;
            return new GraduallyDecreasingCarouselRun(nums, count);
        } else {
            return null;
        }
    }
    public class GraduallyDecreasingCarouselRun extends CarouselRun {
        private final int[] decrements;

        public GraduallyDecreasingCarouselRun(int[] elements, int size) {
            super(elements, size);
            this.decrements = new int[size]; // Initialize the decrements array
        }

        @Override
        public int next() {
            if (isFinished()) {
                return -1;
            }

            while (elements[currentIndex] <= 0) {
                currentIndex = (currentIndex + 1) % size;
            }

            int currentValue = elements[currentIndex];
            decrements[currentIndex]++;
            elements[currentIndex] -= decrements[currentIndex];
            currentIndex = (currentIndex + 1) % size;
            return currentValue;
        }
    }
}
