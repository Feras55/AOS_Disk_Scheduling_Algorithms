/**
 * This program implements all the disk-scheduling Algorithms: (FCFS, SSTF, SCAN, C-SCAN, LOOK, C-LOOK) as well as
 * a newly optimized algorithm (no uniform title for the algorithm yet).
 *
 * Check the New_Optimized Class for the summary
 *
 * @Author: Fares.G Mahmoud
 * @version: 1.0
 *
 * @since 4-30-2021
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //testing GIT
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> arr = new ArrayList<>();
        int sz,num,init,ch,diskSize;
        String direction = new String();
        File inputFile = new File("D:\\College\\Year-3\\Second Semester\\Advanced Operating Systems\\Assignments\\Assignment 2\\Disk_Scheduling\\AOS_Disk_Scheduling_Algorithms\\src\\input.txt");

        Scanner sc = null, sch = null;
        System.out.println("Choose the input method: 1 - Console   2 - File ");
        sch = new Scanner(System.in);
        ch = sch.nextInt();
        if(ch == 1){
        sc = new Scanner(System.in);
        }else if(ch == 2){
            sc = new Scanner(inputFile);
        }
        System.out.println("Enter number of requests");
        sz = sc.nextInt();
        System.out.println("Enter " + sz + " requests");
        for (int i = 0; i < sz; i++) {
            num = sc.nextInt();
            arr.add(num);
        }
        System.out.println("Enter initial head position");
        init = sc.nextInt();

        System.out.println("Enter disk size (For SCAN, C-SCAN Algorithms)");
        diskSize = sc.nextInt();

        System.out.println("Enter Direction (For SCAN, C-SCAN, LOOK, and C-LOOK Algorithms)");
        direction = sc.next();
        //Testing Algorithms
        ///Testing FCFS
        System.out.println("FCFS: ");
        Scheduling_Algorithm sA = new FCFS(arr,init);
        sA.runAlgorithm();

        ///Testing SSTF
        System.out.println("SSTF: ");
        Scheduling_Algorithm sB = new SSTF(arr,init);
        sB.runAlgorithm();

        ///Testing SCAN
        System.out.println("SCAN: ");
        Scheduling_Algorithm sC = new Scan(arr,init,direction,diskSize);
        sC.runAlgorithm();

        ///Testing C-SCAN
        System.out.println("C-SCAN: ");
        Scheduling_Algorithm sD = new C_Scan(arr,init,direction,diskSize);
        sD.runAlgorithm();

        ///Testing LOOK
        System.out.println("LOOK: ");
        Scheduling_Algorithm sE = new Look(arr,init,direction);
        sE.runAlgorithm();

        ///Testing C-LOOK
        System.out.println("C-LOOK: ");
        Scheduling_Algorithm sF = new C_Look(arr,init,direction);
        sF.runAlgorithm();

        ///Testing Newly Optimized Algorithm
        System.out.println("Newly Optimized Algorithm: ");
        Scheduling_Algorithm sG = new New_Optimized(arr);
        sG.runAlgorithm();



    }
}
