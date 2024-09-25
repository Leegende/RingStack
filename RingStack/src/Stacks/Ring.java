package Stacks;

import Main.Element;
import java.util.Arrays;
import java.util.Collections;

public class Ring {

    private int index = -1;

    private Element[] elements;

    public Ring(int n) {
        this.elements = new Element[n];
    }

    public void add(int value) {
        index++;
        if (index >= elements.length) {
            index = 0;
        }
        elements[index] = new Element(value);

    }

    public Element getOldestElement() {
        return elements[index];
    }

    public void sort() {
        Element[] temp = elements.clone();
        do {
            for (int i = 0; i < temp.length - 1; i++) {
                if (temp[i + 1] == null) {
                    break;
                }

                if (temp[i].value > temp[i + 1].value) {
                    Collections.swap(Arrays.asList(temp), i, i + 1);
                }
            }
        } while (!isSorted(temp));
        elements = temp;
    }

    private boolean isSorted(Element[] temp) {
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i + 1] == null) {
                break;
            }
            if (temp[i].value > temp[i + 1].value) {
                return false;
            }
        }
        return true;

    }

    public Element get(int index) {
        try {
            return elements[index];
        } catch (Exception e) {
            System.out.println("Their is no element with the index: " + index);
        }
        return new Element(0);
    }

    public Element[] getElements() {
        return elements;
    }

}
