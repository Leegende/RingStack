package Ring;

public class Element {

    public final int value;
    public final Element previous;
    protected  int position;

    public Element(int value, Element previous, int position) {
        this.value = value;
        this.previous = previous;
        this.position = position;
    }

}
