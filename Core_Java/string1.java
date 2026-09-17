public class string1 {
    public static void main(String args[]){
        String s = "Sadique aamir aazam tarique monu sonu ponu ram jam aam gaam ";
//        s.split(' ', 4);
//         String y = s.substring(0,2);
        String[] y = s.split(" ", 8);
        System.out.println(y[1]);
    }
}
