import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers = new int[10];
        //int sum2 = 0;
        for(int i = 0; i < 10; i++){
            numbers[i] = i + 1;
            //sum2 += numbers[i];
        }
        //System.out.println("sum2: " + sum2);

        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        /*for(Integer n : numbers){
            sum += n;
        }*/
        System.out.println("sum: " + sum);

        int biggestNumber = numbers[0];
        for(Integer n : numbers){
            if (n > biggestNumber){
                biggestNumber = n;
            }
        }
        System.out.println("biggest number: " + biggestNumber);

        int[] numbers2 = new int[10];
        for(int i = 0; i < 10; i++){
            numbers2[i] = i + 11;
            //sum2 += numbers[i];
        }
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers3[i] = numbers[i] + numbers2[i];
        }
        System.out.println(Arrays.toString(numbers3));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text to read: ");

        String enteredText = scanner.nextLine();
        System.out.println("Bonus Task");


//        with for each loop
        for (char c : enteredText.toCharArray()) {
            System.out.println(c);
        }


//        with for loop
        for (int i = 0; i < enteredText.length(); i++) {
            System.out.println(enteredText.charAt(i));

        }

        System.out.println("The text is: " + enteredText);
    }
}
