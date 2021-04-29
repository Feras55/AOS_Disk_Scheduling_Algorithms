import java.util.ArrayList;
import java.util.Scanner;

abstract public class Scheduling_Algorithm {
    protected int size;
    protected ArrayList<Integer> requestQueue= new ArrayList<Integer>();
    protected ArrayList<Integer> outputSequence= new ArrayList<Integer>();
    protected int totalHeadMovement;
    protected  int initialHeadPosition;

    public Scheduling_Algorithm(int size, ArrayList<Integer> requestQueue, int initialHeadPosition) {
        this.size = size;
        this.requestQueue = requestQueue;
        this.initialHeadPosition = initialHeadPosition;
    }

    abstract public void runAlgorithm();

    public void showResults(){
        System.out.println("Total Head Movement: " + totalHeadMovement);
        System.out.println("Head movement Sequence: "  + outputSequence.toString());
    }

    public static void main(String[] args) {

    }
}
