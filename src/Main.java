import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;

        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = new int[5];
        numbers2[0] = 10;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.length);

        for(int i = 0; i < numbers.length; i = i + 1) {
            System.out.println(numbers[i]);
        }

        for(Integer n : numbers){
            System.out.println(n);
        }
    }
}