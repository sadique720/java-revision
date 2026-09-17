package CollectionFrameWorkApi;

import java.util.*;


public class IteratorExample {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volovo");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Toyota");


        Iterator<String> iterator = cars.iterator();
        System.out.println("Using Iterator" + iterator.next());
        while(iterator.hasNext()){
            String car = iterator.next();
            System.out.println("Car: " + car);
        }

        // for(String car : cars){
        //     System.out.println("Car: " + car);
        // }

    }
}
