
    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return "Error: Division by zero is not allowed";
        }
        return String.valueOf(a / b);
    }
}
