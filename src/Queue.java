import requests.Request;

import java.util.ArrayList;

public class Queue {
    private ArrayList<QueueElement> queueElements;
    public Queue () {

    }

    /**
     * Adds request to the queue and returns requestNumber
     * @param request
     * @return
     */
    public int add (Request request) {
        return 0;
    }

    /**
     * Calculates waiting time for the request in the given queue
     * @param request
     * @return
     */

    private int calculateWaitingTime (Request request) {
        return 0;
    }

    public void delete (Request request) {

    }

    public ArrayList<QueueElement> getQueueElements() {
        return queueElements;
    }

    public ArrayList<QueueElement> getQueueElementsOfTypes (String[] types) {
        return queueElements;
    }
}
