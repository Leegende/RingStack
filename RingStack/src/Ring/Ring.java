package Ring;

public class Ring {

    private int n;
    private Element selected;
    private Element start;

    public Ring(int n, int initialValue) {
        this.n = n;
        this.selected = new Element(initialValue, null, 0);
        this.start = selected;

    }

    public void add(int value) {

        if (selected.position + 1 >= n) {
            System.out.println("a");
            selected = new Element(value, start, 0);
        } else {
            selected = new Element(value, selected, selected.position++);
        }
        System.out.println("pos: " + selected.position);

    }

    public Element getSelected() {
        return selected;
    }

}
