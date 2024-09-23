package Main;

import Ring.Ring;

public class Main {

    public static void main(String[] args) {
        Ring r = new Ring(3);
        r.add(53);
        r.add(2);
        r.add(71);
        r.add(60);
        r.sort();
    }

}
