package epamproject.halving;
public class HalvingCarousel extends DecrementingCarousel {
    public HalvingCarousel(int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (!run) {
            this.run = true;
            return new HalvingCarouselRun(nums, count);
        } else {
            return null;
        }
    }

    private class HalvingCarouselRun extends CarouselRun {

        public HalvingCarouselRun(int[] elements, int size) {
            super(elements, size);
        }

        @Override
        public int next() {
            if (isFinished()) {
                return -1;
            }

            while (elements[currentIndex] == 0) {
                currentIndex = (currentIndex + 1) % size;
            }

            int currentValue = elements[currentIndex];
            elements[currentIndex] /= 2;
            currentIndex = (currentIndex + 1) % size;
            return currentValue;
        }
    }
}