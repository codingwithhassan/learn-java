public class MaxHeap {
    private int[] heap;
    private int heapSize;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
        heapSize = 0;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void maxHeapify(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < heapSize && heap[left] > heap[largest])
            largest = left;

        if (right < heapSize && heap[right] > heap[largest])
            largest = right;

        if (largest != i) {
            swap(i, largest);
            maxHeapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void buildMaxHeap(int[] array) {
        heap = array;
        heapSize = array.length;

        for (int i = heapSize / 2 - 1; i >= 0; i--)
            maxHeapify(i);
    }

    public void heapSort() {
        for (int i = heapSize - 1; i >= 1; i--) {
            swap(0, i);
            heapSize--;
            maxHeapify(0);
        }
    }

    public int heapExtractMax() {
        if (heapSize < 1) {
            System.out.println("Heap is empty. Cannot extract maximum element.");
            return -1;
        }

        int max = heap[0];
        heap[0] = heap[heapSize - 1];
        heapSize--;
        maxHeapify(0);

        return max;
    }

    /**
     * Inserts a new element into a max-heap
     * O(lgn)
     */
    public void maxHeapInsert(int key) {
        if (heapSize == heap.length) {
            System.out.println("Heap is full. Cannot insert more elements.");
            return;
        }

        heapSize++;
        int i = heapSize - 1;
        heap[i] = Integer.MIN_VALUE;

        heapIncreaseKey(i, key);
    }

    /**
     * Increases the key of an element i in the heap
     * O(lgn)
     */
    public void heapIncreaseKey(int i, int key) {
        if (key < heap[i]) {
            System.out.println("New key is smaller than the current key. Cannot increase the key.");
            return;
        }

        heap[i] = key;
        while (i > 0 && heap[parent(i)] < heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public int heapMaximum() {
        if (heapSize < 1) {
            System.out.println("Heap is empty. Cannot get maximum element.");
            return -1;
        }

        return heap[0];
    }

    public void printHeap() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 4, 10, 3, 5, 1 };
        MaxHeap maxHeap = new MaxHeap(array.length);

        maxHeap.buildMaxHeap(array);
        System.out.println("Max Heap:");
        maxHeap.printHeap();

        maxHeap.heapSort();
        System.out.println("Sorted Array:");
        maxHeap.printHeap();

        maxHeap.maxHeapInsert(7);
        System.out.println("Max Heap after inserting 7:");
        maxHeap.printHeap();

        int max = maxHeap.heapExtractMax();
        System.out.println("Maximum element extracted: " + max);
        System.out.println("Max Heap after extracting maximum element:");
        maxHeap.printHeap();

        maxHeap.heapIncreaseKey(3, 8);
        System.out.println("Max Heap after increasing key at index 3 to 8:");
        maxHeap.printHeap();

        int maximum = maxHeap.heapMaximum();
        System.out.println("Maximum element: " + maximum);
    }
}
