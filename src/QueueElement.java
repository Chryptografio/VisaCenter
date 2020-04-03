import requests.Request;

public class QueueElement {
    Request request;
    int requestNumber;
    QueueElement (Request request, int requestNumber) {
        this.request = request;
        this.requestNumber = requestNumber;
    }
}
