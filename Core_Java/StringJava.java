public class StringJava {

    public static void main(String[] args){

        // String is a sequence of characters
        // String is immutable, meaning once created, it cannot be changed
        // String is a reference data type

        String str = "Hello"; 
        // str = "world";
        System.out.println("Data....= " + str);// declares and initializes a string
        str = str + " world";
        System.out.println("Data after concatenation: " + str);
        
        System.out.println("str"+ str.length());// prints the concatenated string
        System.out.println("str"+ str.charAt(0)); // prints the first character of the string
        System.out.println("str"+ str.indexOf("o")); // prints the index of the character 'o' in the string
        System.out.println("str"+ str.substring(0, 5)); // prints the substring from index 0 to 5
        System.out.println("str"+ str.toUpperCase()); // converts the string to uppercase
        System.out.println("str"+ str.toLowerCase()); // converts the string to lowercase
        System.out.println("str"+ str.trim()); // removes leading and trailing whitespace from the string
        System.out.println("str"+ str.replace("o", "a")); // replaces 'o' with 'a' in the string
        System.out.println("str"+ str.startsWith("He")); // checks if the string starts with "He"
        System.out.println("str"+ str.endsWith("ld")); // checks if the string ends with "ld"
        System.out.println("str"+ str.contains("lo")); // checks if the string contains "lo"
        System.out.println("str"+ str.equals("Hello")); // checks if the string is equal to "Hello"
        System.out.println("str"+ str.equalsIgnoreCase("hello")); // checks if the string is equal to "hello" ignoring case
        System.out.println("str"+ str.compareTo("Hello")); // compares the string with "    Hello"
        System.out.println("str"+ str.compareToIgnoreCase("hello")); // compares the string ignoring case
        System.out.println("str"+ str.isEmpty()); // checks if the string is empty
        System.out.println("str"+ str.valueOf(100)); // converts an integer to a string
        System.out.println("str"+ str.split(" ")); // splits the string by space and

        String st = "Mr. Mohammad Sadique Shaikh";
        String[] part = st.split(" ");
        System.out.println("Resut= " + part[0]);
// foreach loop or enhanced loop
        for(String s : part){
            System.out.println("Sring part: "+s);
        }

        for (int i = 0; i < part.length; i++){
            System.out.println("String part using for loop: " + part[i]);
        }
        

    }
    
}
