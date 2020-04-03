import requests.Request;

public class QueueElement {
    private Request request;
    private int requestNumber;
    private long createdAt;
    private String status;
    private boolean waiting;
    private int waitingTime;

    public QueueElement (Request request, int requestNumber, int waitingTime) {

    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setStatus (String status) {
    }

    public boolean isWaiting() {
        return waiting;
    }
}
