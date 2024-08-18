public class ResizableArrayStack<T> {
        private static final int INITIAL_CAPACITY = 10; // Initial capacity of the stack
        private T[] stack; // Array to hold stack elements
        private int size;  // Number of elements in the stack
    
        @SuppressWarnings("unchecked")
        public ResizableArrayStack() {
            //example of casting and usage of generics in java
            stack = (T[]) new Object[INITIAL_CAPACITY];
            size = 0;
        }
    
        public void push(T item) {
            if (size == stack.length) {
                resize(stack.length * 2); // Double the size of the array
            }
            stack[size++] = item;
        }
    
        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            T item = stack[--size];
            stack[size] = null; // Avoid memory leak
            if (size > 0 && size == stack.length / 4) {
                resize(stack.length / 2); // Halve the size of the array
            }
            return item;
        }
    
        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return stack[size - 1];
        }
    
        public boolean isEmpty() {
            return size == 0;
        }
    
        public int size() {
            return size;
        }
    
        @SuppressWarnings("unchecked")
        private void resize(int newCapacity) {
            T[] newStack = (T[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
    
        public static void main(String[] args) {
            ResizableArrayStack<Integer> stack = new ResizableArrayStack<>();
            
            stack.push(1);
            stack.push(2);
            stack.push(3);
            
            System.out.println("Top element: " + stack.peek()); // Output: Top element: 3
            System.out.println("Stack size: " + stack.size());  // Output: Stack size: 3
            
            System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 3
            System.out.println("Stack size: " + stack.size());   // Output: Stack size: 2
        }
    }
