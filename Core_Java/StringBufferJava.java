public class StringBufferJava {
    public static void main(String[] args){
        // StringBuffer is a mutable sequence of characters
        // StringBuffer is used to create strings that can be modified
        // StringBuffer is synchronized, meaning it is thread-safe

        StringBuffer sb = new StringBuffer("sadique");
        System.out.println("Original StringBuffer: " + sb); // prints the original StringBuffer

        sb = sb.append(" shaikh"); // appends " shaikh" to the StringBuffer
        System.out.println("After append: " + sb);
        sb.insert(0, "Mr. "); // inserts "Mr. " at the beginning of the StringBuffer
        System.out.println("After insert: " + sb);
    }
}
