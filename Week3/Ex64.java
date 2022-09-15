package Week3;

import java.util.ArrayList;

public class Ex64 {
    public static double average(ArrayList<Integer> list) {
        // write your code here
        Integer sum = 0;
        if(!list.isEmpty()) {
            for (Integer mark : list) {
                sum += mark;
            }
            return sum.doubleValue() / list.size();
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
