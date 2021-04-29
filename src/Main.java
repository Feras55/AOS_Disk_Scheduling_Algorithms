import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sz,num,init;
        Scanner sc = new Scanner(System.in);
        sz = sc.nextInt();
        for (int i = 0; i < sz; i++) {
            num = sc.nextInt();
            arr.add(num);
        }
        init = sc.nextInt();
        Scheduling_Algorithm sA = new FCFS(sz,arr,init);
        sA.runAlgorithm();
    }
}
