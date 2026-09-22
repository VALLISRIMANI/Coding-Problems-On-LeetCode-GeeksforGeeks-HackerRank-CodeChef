    public static int[] findNextGreaterElements(int[] numbers) {
        int n = numbers.length;
        int[] result = new int[n];
        java.util.Arrays.fill(result, -1);
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;
            while (!stack.isEmpty() && numbers[stack.peek()] <= numbers[index]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[index] = numbers[stack.peek()];
            }
            stack.push(index);
        }
        return result;
    }