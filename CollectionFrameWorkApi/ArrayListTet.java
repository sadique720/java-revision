package CollectionFrameWorkApi;
import java.util.ArrayList;

public class ArrayListTet {
    public static void main(String[] args){

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");   
        cars.add("Toyota");
        cars.add("Volvo");
        
        System.out.println("Cars in the list:"  + cars);

        System.out.println("First car in the list: " + cars.get(0));
        System.out.println("Total number of cars: " + cars.size());

        for(String car : cars){
            System.out.println("Enhance loop Car: " + car);
        }

        for(int i = 0; i < cars.size(); i++){
            System.out.println("For loop Car at index " + i + ": " + cars.get(i));

        }
        int i = 0;
        while(i < cars.size()) {
            System.out.println("While loop Car at index " + i + ": " + cars.get(i));
            i++;
        }
        
    }
}
