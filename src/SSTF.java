import java.util.ArrayList;

public class SSTF extends Scheduling_Algorithm{

    public SSTF(ArrayList<Integer> requestQueue, int initialHeadPosition) {
        super(requestQueue, initialHeadPosition);
    }

    @Override
    public void runAlgorithm() {
        ArrayList<Request> queue = new ArrayList<>();
        //Moving the normal requests array to an array of requests (for the boolean isServiced)
        for (int i = 0; i < requestQueue.size(); i++) {
            Request r = new Request((int)requestQueue.get(i));
            queue.add(r);
        }
        int cur = initialHeadPosition;
        for (int i = 0; i < queue.size(); i++) {
            int mini = (int) 1e6, pos = -1; //pointers to point at the shortest seek time request from the cur position
            for (int j = 0; j < queue.size(); j++) {
                Request r = queue.get(j);
                int dist = Math.abs(r.getPosition() - cur);
                if( dist < mini && !r.isServiced()){ //If distance is the shortest and the request is not serviced before, make it the minimum and save its position
                    mini = dist;
                    pos = j;
                }
            }
            int next = queue.get(pos).getPosition(); //The next closest request
            totalHeadMovement+=Math.abs(cur - next); //add to the total head movement
            cur = next; //move head to the next request
            outputSequence.add(cur);
            queue.get(pos).setServiced(true);
        }
        printResults();
    }


}
