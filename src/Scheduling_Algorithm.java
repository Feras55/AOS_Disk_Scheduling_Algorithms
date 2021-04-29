import java.util.ArrayList;


abstract public class Scheduling_Algorithm {
    protected ArrayList<Integer> requestQueue= new ArrayList<Integer>();
    protected ArrayList<Integer> outputSequence= new ArrayList<Integer>();
    protected int totalHeadMovement;
    protected  int initialHeadPosition;

    public Scheduling_Algorithm(ArrayList<Integer> requestQueue, int initialHeadPosition) {
        this.requestQueue = requestQueue;
        this.initialHeadPosition = initialHeadPosition;
    }

    abstract public void runAlgorithm();

    public void printResults(){
        System.out.println("Total Head Movement: " + totalHeadMovement);
        System.out.println("Head movement Sequence: "  + outputSequence.toString());
    }

    public static void main(String[] args) {

    }
}
