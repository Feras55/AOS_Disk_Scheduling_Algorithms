import java.util.ArrayList;

public class FCFS extends Scheduling_Algorithm {


    public FCFS(ArrayList<Integer> requestQueue, int initialHeadPosition) {
        super(requestQueue, initialHeadPosition);
    }

    @Override
    public void runAlgorithm(){
        outputSequence.add(initialHeadPosition);
        int cur = initialHeadPosition;
        for (int i = 0; i < requestQueue.size(); i++) {
            totalHeadMovement+=Math.abs(cur - requestQueue.get(i));
            cur = requestQueue.get(i);
            outputSequence.add(cur);
        }
        printResults();
    }

    public static void main(String[] args) {

    }
}
