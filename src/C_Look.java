import java.util.ArrayList;
import java.util.Collections;

public class C_Look extends Scan {
    public C_Look(ArrayList<Integer> requestQueue, int initialHeadPosition, String direction) {
        super(requestQueue, initialHeadPosition, direction);
    }

    @Override
    public void runAlgorithm() {
        ArrayList<Integer> leftQueue = new ArrayList<>();
        ArrayList<Integer> rightQueue = new ArrayList<>();
        for (int i = 0; i < requestQueue.size(); i++) {
            int pos = requestQueue.get(i);
            if (pos < initialHeadPosition) {
                leftQueue.add(pos);
            } else {
                rightQueue.add(pos);
            }
        }

        Collections.sort(leftQueue);
        Collections.sort(rightQueue);

        int curHead = initialHeadPosition; //current head

        for (int i = 0; i < 2; i++) { //runs two times to cover each direction
            if (direction == "right") {
                for (int j = 0; j < rightQueue.size(); j++) {
                    int cur = rightQueue.get(j); //current request serviced
                    totalHeadMovement += Math.abs(curHead - cur);
                    curHead = cur; //set the new head
                    outputSequence.add(cur);
                }

                direction = "left"; //switch directions
            } else {
                for (int j = 0; j < leftQueue.size(); j++) {
                    int cur = leftQueue.get(j); //current request serviced
                    totalHeadMovement += Math.abs(curHead - cur);
                    curHead = cur; //set the new head
                    outputSequence.add(cur);
                }

                direction = "right"; //switch directions

            }


        }
        printResults();
    }
}
