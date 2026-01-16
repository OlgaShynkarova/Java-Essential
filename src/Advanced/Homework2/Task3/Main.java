package Advanced.Homework2.Task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>();
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        if (scanner.hasNextInt()){
            n = scanner.nextInt();
        }else
            System.out.println("You did not enter a number. Please try again.");
        nums = getIntegerList(n);
        System.out.println(nums);
        System.out.println("Minimal value: " + getMinimum(nums));
        scanner.close();
    }
    public static List<Integer> getIntegerList(int num){
        List<Integer> nums = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < num ; i++) {
            nums.add(random.nextInt(100));
        }
        return nums;
    }
    public static int getMinimum(List<Integer> list){
        int minVal = list.get(0);
        for (Integer num : list) {
            if (num < minVal){
                minVal = num;
            }
        }
        return minVal;
//      Альтернатива: minVal = Collections.min(list);
    }
}