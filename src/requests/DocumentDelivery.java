package requests;

abstract public class DocumentDelivery extends Request{
    DocumentDelivery(String message) {
        super(message);
        this.type = "выдача документов";
    }
}
