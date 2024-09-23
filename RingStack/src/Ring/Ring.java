package Ring;

import java.util.Arrays;
import java.util.Collections;

public class Ring {

    private int index = -1;

    private final Element[] elements;

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
               
              

                
            }
        } while (!isSorted(temp));
        temp = elements;
        for (Element element : temp) {
            System.out.println(element.value);
        }
        
    }

    public boolean isSorted(Element[] temp) {
        Integer lastValue = null;
        for (Element element : temp) {
            if (lastValue == null) {
                lastValue = element.value;
            }
            if (lastValue > element.value) {
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
