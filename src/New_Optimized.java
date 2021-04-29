/***
 * Summary: The PROPOSED NEW OPTIMIZED REAL-TIME DISK SCHEDULING ALGORITHM
 *  follows the modified rule of "Simplicity is the best Policy".
 *  Performing the requests in a non-decreasing order hypothesizing that requests
 *  approaching the queue are next to each other, so they can be served one after another, whereas the
 *  last served request will not be far from the head according to the hypothesis.
 *  In simpler words, it performs a normal O(n) loop on a sorted list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class New_Optimized extends Scheduling_Algorithm {
    public New_Optimized(ArrayList<Integer> requestQueue) {
        super(requestQueue);
    }

    @Override
    public void runAlgorithm() {
        requestQueue.add(0);
        Collections.sort(requestQueue);
        initialHeadPosition = 0;
        int cur = initialHeadPosition;
        for (int i = 0; i < requestQueue.size(); i++) {
            totalHeadMovement+=Math.abs(cur - requestQueue.get(i));
            cur = requestQueue.get(i);
            outputSequence.add(cur);
        }
        printResults();


    }
}
