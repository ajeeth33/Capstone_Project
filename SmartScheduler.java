import java.util.ArrayList;

public class SmartScheduler {
    private ArrayList<Task> heap;

    public SmartScheduler() {
        heap = new ArrayList<>();
    }

    public void insert(Task task) {
        heap.add(task);
        bubbleUp(heap.size() - 1);
    }

    public Task peek() {
        if (heap.isEmpty()) {
            return null;
        }
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void bubbleUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;

            if (heap.get(index).getPriority() <= heap.get(parentIndex).getPriority()) {
                break;
            }

            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void swap(int i, int j) {
        Task temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    public Task removeHighestPriority() {
    if (heap.isEmpty()) {
        return null;
    }

    Task highestPriority = heap.get(0);
    Task lastTask = heap.remove(heap.size() - 1);

    if (!heap.isEmpty()) {
        heap.set(0, lastTask);
        bubbleDown(0);
    }

    return highestPriority;
}

private void bubbleDown(int index) {
    int size = heap.size();

    while (true) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int largest = index;

        if (leftChild < size &&
            heap.get(leftChild).getPriority() > heap.get(largest).getPriority()) {
            largest = leftChild;
        }

        if (rightChild < size &&
            heap.get(rightChild).getPriority() > heap.get(largest).getPriority()) {
            largest = rightChild;
        }

        if (largest == index) {
            break;
        }

        swap(index, largest);
        index = largest;
    }
}
}
