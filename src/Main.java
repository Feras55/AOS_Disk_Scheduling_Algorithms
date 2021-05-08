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
        System.out.println("Choose the input method or quit: 1 - Console   2 - File ");
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

        System.out.println("Choose Algorithm to run: \n" +
                "1. FCFS\t 2. SSTF\t 3. SCAN\t 4.C-SCAN \n" +
                "5. LOOK\t 6.C-LOOK\t 7. Newly Optimized Algorithm");
        ch = sc.nextInt();

        switch (ch){
            case 1:
                System.out.println("FCFS: ");
                Scheduling_Algorithm sA = new FCFS(arr,init);
                sA.runAlgorithm();
                break;
            case 2:
                System.out.println("SSTF: ");
                Scheduling_Algorithm sB = new SSTF(arr,init);
                sB.runAlgorithm();
                break;
            case 3:
                System.out.println("Enter disk size");
                diskSize = sc.nextInt();
                System.out.println("Enter Direction");
                direction = sc.next();
                System.out.println("SCAN: ");
                Scheduling_Algorithm sC = new Scan(arr,init,direction,diskSize);
                sC.runAlgorithm();
                break;
            case 4:
                System.out.println("Enter disk size");
                diskSize = sc.nextInt();
                System.out.println("Enter Direction");
                direction = sc.next();
                System.out.println("C-SCAN: ");
                Scheduling_Algorithm sD = new C_Scan(arr,init,direction,diskSize);
                sD.runAlgorithm();
                break;
            case 5:
                System.out.println("Enter Direction");
                direction = sc.next();
                System.out.println("LOOK: ");
                Scheduling_Algorithm sE = new Look(arr,init,direction);
                sE.runAlgorithm();
                break;
            case 6:
                System.out.println("Enter Direction");
                direction = sc.next();
                System.out.println("C-LOOK: ");
                Scheduling_Algorithm sF = new C_Look(arr,init,direction);
                sF.runAlgorithm();
                break;
            case 7:
                System.out.println("Newly Optimized Algorithm: ");
                Scheduling_Algorithm sG = new New_Optimized(arr);
                sG.runAlgorithm();
            default:
                break;
        }


    }
}
