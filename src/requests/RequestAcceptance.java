package requests;

abstract public class RequestAcceptance extends Request{
    RequestAcceptance(String message) {
        super(message);
        this.type = "прием заявок";
    }
}
