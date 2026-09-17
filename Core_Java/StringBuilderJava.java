public class StringBuilderJava {

    public static void main(String[] args){

        // StringBuilder is a mutable sequence of characters
        // StringBuilder is used to create strings that can be modified
        // StringBuilder is not synchronized, meaning it is not thread-safe


        StringBuilder sb = new StringBuilder("Sadique");
        System.out.println("Original StringBuilder: " + sb); // prints the original StringBuilder
        sb.append(" Shaikh"); // appends " Shaikh" to the StringBuilder
        System.out.println("After append: " + sb);
        sb.insert(0, "Mr. "); // inserts "Mr. " at the beginning of the StringBuilder
        System.out.println("After insert: " + sb);
    }
    
}
