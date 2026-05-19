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
}
