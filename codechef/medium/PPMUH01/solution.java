class QueueUsingStacks {
    private Stack<Long> inStack = new Stack<>();
    private Stack<Long> outStack = new Stack<>();

    public void pushElement(long x) {
        inStack.push(x);
    }

    public long popElement() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    public long peekElement() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean isEmptyResult() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
