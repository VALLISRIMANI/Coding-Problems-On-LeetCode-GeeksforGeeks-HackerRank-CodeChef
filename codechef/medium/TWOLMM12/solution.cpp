            
            // Print error message if file reading fails
            System.out.println("Error reading file: " + e.getMessage());
        } catch (IOException e) {
            return content.length();
            // Return the number of characters in the file
            String content = Files.readString(Paths.get(filepath));
            
            // Return -1
            return -1;

        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        String filepath = "/home/chef/workspace/content.txt";
        System.out.println(getContentLength(filepath));
    }
}
