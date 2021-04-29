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
        System.out.println("FCFS: ");
        Scheduling_Algorithm sA = new FCFS(arr,init);
        sA.runAlgorithm();
        System.out.println("SSTF: ");
        Scheduling_Algorithm sB = new SSTF(arr,init);
        sB.runAlgorithm();
        System.out.println("SCAN: ");
        Scheduling_Algorithm sC = new Scan(arr,init,"right",200);
        sC.runAlgorithm();

    }
}
