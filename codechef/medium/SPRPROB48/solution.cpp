@RestController
@RequestMapping("/api/text")
public class TextController {

    // Convert text to uppercase
    @GetMapping("/uppercase")
    public String convertToUppercase(@RequestParam String text) {

        // Write your code here
        return text.toUpperCase();
    }

    // Convert text to lowercase
    @GetMapping("/lowercase")
    public String convertToLowercase(@RequestParam String text) {

        // Write your code here
        return text.toLowerCase();
    }
}