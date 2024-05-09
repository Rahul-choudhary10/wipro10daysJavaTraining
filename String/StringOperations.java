package String;
public class StringOperations {
    
    public static String middleSubstring(String str1, String str2, int length) {
        // Concatenate the two strings
        String concatenated = str1.concat(str2);
        
        // Reverse the concatenated string
        StringBuilder reversed = new StringBuilder(concatenated).reverse();
        
        // Find the middle index of the reversed string
        int middleIndex = reversed.length() / 2;
        
        // Adjust the middle index if the length of the substring is odd
        int startIndex = middleIndex - length / 2;
        
        // Ensure the start index is non-negative
        if (startIndex < 0) {
            startIndex = 0;
        }
        
        // Ensure the start index is within bounds
        if (startIndex + length > reversed.length()) {
            length = reversed.length() - startIndex;
        }
        
        // Extract the middle substring
        String middleSubstring = reversed.substring(startIndex, startIndex + length);
        
        return middleSubstring;
    }
    
    public static void main(String[] args) {
        String str1 = "Rahul";
        String str2 = "Kumar";
        int length = 4;
        String result = middleSubstring(str1, str2, length);
        System.out.println("Middle Substring: " + result);
    }
}