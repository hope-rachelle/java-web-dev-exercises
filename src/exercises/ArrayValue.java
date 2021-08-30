package exercises;

public class ArrayValue {
    public static void main(String[] args) {
        int[] numbers = { 1, 1, 2, 3, 5, 8};
        for(int i=0; i< numbers.length; i++){
            //System.out.println(numbers[i]);
            if(numbers[i]%2 != 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
