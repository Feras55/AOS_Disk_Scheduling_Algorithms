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

    public Scheduling_Algorithm(ArrayList<Integer> requestQueue) {
        this.requestQueue = requestQueue;
    }

    abstract public void runAlgorithm();

    public void printResults(){
        System.out.println("Initial Head Position: " + initialHeadPosition);
        System.out.println("Total Head Movement: " + totalHeadMovement);
        System.out.println("Head movement Sequence: "  + outputSequence.toString());
        System.out.println();
        GraphDrawer graphDrawer = new GraphDrawer(outputSequence);
        graphDrawer.setSize(500,500);
        graphDrawer.setResizable(!false);
        graphDrawer.setVisible(true);

    }

    public static void main(String[] args) {

    }
}
