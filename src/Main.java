/**
 * This program implements all the disk-scheduling Algorithms: (FCFS, SSTF, SCAN, C-SCAN, LOOK, C-LOOK) as well as
 * a newly optimized algorithm (no uniform title for the algorithm yet).
 *
 * @Author: Fares.G Mahmoud
 * @version: 1.0
 *
 * @since 4-30-2021
 *
 */

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
        Scheduling_Algorithm sC = new Scan(arr,init,"left",200);
        sC.runAlgorithm();
        System.out.println("C-SCAN: ");
        Scheduling_Algorithm sD = new C_Scan(arr,init,"right",200);
        sD.runAlgorithm();
        System.out.println("LOOK: ");
        Scheduling_Algorithm sE = new Look(arr,init,"right");
        sE.runAlgorithm();
        System.out.println("C-LOOK: ");
        Scheduling_Algorithm sF = new C_Look(arr,init,"right");
        sF.runAlgorithm();
        System.out.println("Newly Optimized Algorithm: ");
        Scheduling_Algorithm sG = new New_Optimized(arr);
        sG.runAlgorithm();



    }
}
