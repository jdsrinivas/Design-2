class MyQueue {
    // 1,2,3,4,P,5,P,6,P,P,P,P
    private Stack<Integer> in;
    private Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();

    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        peek();
        return out.pop();

    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}