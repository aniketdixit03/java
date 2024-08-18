import java.util.*;
public class ResizableArrayQueue<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int size;

    @SuppressWarnings("unchecked")
    public ResizableArrayQueue() {
        queue = (T[]) new Object[2]; // Initial capacity
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T item) {
        if (size == queue.length) {
            resize(queue.length * 2); // Double the size of the array
        }
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow");
        }
        T item = queue[front];
        queue[front] = null; // Avoid memory leak
        front = (front + 1) % queue.length;
        size--;
        if (size > 0 && size == queue.length / 4) {
            resize(queue.length / 2); // Shrink the size of the array
        }
        return item;
    }

    public T getFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public T getRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[(rear - 1 + queue.length) % queue.length];
    }

    @SuppressWarnings("unchecked")
    private void resize(int newCapacity) {
        T[] newQueue = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % queue.length];
        }
        queue = newQueue;
        front = 0;
        rear = size;
    }

    public static void main(String[] args) {
        ResizableArrayQueue<Integer> queue = new ResizableArrayQueue<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter integers to enqueue to the queue (type 'exit' to stop):");

        while (scanner.hasNext()) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                queue.enqueue(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or 'exit' to stop.");
            }
        }

        System.out.println("Queue contents before dequeue:");
        printQueue(queue);

        // Dequeue all elements
        while (!queue.isEmpty()) {
            queue.dequeue();
        }

        System.out.println("Queue contents after dequeue:");
        printQueue(queue);

        scanner.close();
    }

    public static <T> void printQueue(ResizableArrayQueue<T> queue) {
        int current = queue.front;
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.queue[(current + i) % queue.queue.length] + " ");
        }
        System.out.println();
    }
}
