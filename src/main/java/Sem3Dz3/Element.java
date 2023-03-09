package Sem3Dz3;

public class Element {

    Object param;
    private Element next;
    private Element previous;

    public Element(Object param) {
        this.param = param;
    }

    public Object getData() {
        return param;
    }

    public void setData(String param) {
        this.param = param;
    }

    public Element getNext() {
        return next;
    }

    void setNext(Element element){
        next = element;
    }

    void setPrevious(Element element){
        previous = element;
    }

    public Element getPrevious() {
        return previous;
    }
}
