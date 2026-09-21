    public int[] findNextGreaterElement(int[] subsetNumbers, int[] fullNumbers) {
        int n = fullNumbers.length;
        java.util.Map<Integer, Integer> nextGreaterMap = new java.util.HashMap<>();
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        for (int num : fullNumbers) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }
        int[] result = new int[subsetNumbers.length];
        for (int i = 0; i < subsetNumbers.length; i++) {
            result[i] = nextGreaterMap.get(subsetNumbers[i]);
        }
        return result;
    }
