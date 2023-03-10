import java.util.*;
//Nguyễn Đức Huy
public class Main {
    public static void main(String[] args) {
        System.out.print("Input 5 numbers: ");
        Scanner input = new Scanner(System.in);
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            long n = input.nextLong(); //input 5 numbers
            sum += n; //add n values to sum
            max = Math.max(max, n);// find max
            min = Math.min(min, n);// find min
        }
        System.out.println("Output: " + (sum - max) + " " + (sum - min));
    }
}