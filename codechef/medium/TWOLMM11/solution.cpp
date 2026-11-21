
class Codechef
{
    public static String readFile(String filepath){
        try {
            

            // Write your code here
            String content = Files.readString(Paths.get(filepath));
            return content;


        } catch (IOException e) {
import java.io.IOException;
            return "Error reading file: " + e.getMessage();  // Handle file read errors
        }