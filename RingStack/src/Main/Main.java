package Main;

import Stacks.Ring;

public class Main {

    public static void main(String[] args) {
        Ring r = new Ring(5);
        r.add(53);
        r.add(2);
        r.add(71);
        r.add(60);
        r.sort();
    }

}
