public class Array {

    public static void main(String[] args){
        // array is a collection of similar data types
        // array is a fixed size data structure
        // array is a reference data type
        
        // int[] num = new int[2]; declares an array of integers with size 2
        int nums[] = new int[3]; // declares an array of integers with size 3
        // int nums[] = {2,5,6,7,9,100}; // declares and initializes an array of integers
        nums[0] = 10; // assigns value 10 to the first element of the array
        nums[1] = 20;
        nums[2] = 30;

        System.out.println("First element: " + nums[0]);

        String names[] = {"John", "Doe", "Jane"}; // declares and initializes an array of strings
        System.out.println("First name: " + names[0]);

        Object[] obj = new Object[10]; // onject is super class of all classes in java, so we can store any type of object in this array
        obj[0] = "Hello"; // assigns a string to the first element of the object array
        obj[1] = 100; // assigns an integer to the second element of the object array
        System.out.println("First object: " + obj[0]);


        // for loop to iterate through the array
        for(int i = 0; i<nums.length; i++){
            System.out.println("Elements of arry: " + nums[i]);
        }

        // for each (for enhance) loop to iterate through the 
        for(int n : nums){
            System.out.println("Elements of array using for each loop: " + n);
        }

    }

}