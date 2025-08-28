class Stack<T> {
    private Object[] arr;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        arr = new Object[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Nothing to pop.");
        } else {
            System.out.println(arr[top--] + " popped from stack.");
        }
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            return (T) arr[top];
        }
    }
}

public class Exp1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());

        s.pop();
        System.out.println("Top element after pop: " + s.peek());

        s.pop();
        s.pop();
        s.pop();  // This will show underflow
    }
}
