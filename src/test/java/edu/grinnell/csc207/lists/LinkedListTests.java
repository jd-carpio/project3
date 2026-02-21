package edu.grinnell.csc207.lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;

public class LinkedListTests {
    @Test
    public void emptyListTest() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.size());
    }

    @Test
    public void listAddSize10() {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(10, list.size());
    }

    @Test
    public void listTestRemove() {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        for (int i = 0; i < 5; i++) {
            list.remove(i);
        }  
        assertEquals(10, list.size());
    }

    @Test
    public void removeMiddleElement() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        int removed = list.remove(1);
        assertEquals(2, list.size());
        assertEquals(3, list.get(1));
    }

    @Property
    public boolean listAddSize(@ForAll @IntRange(min = 0, max = 1000) int sz) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < sz; i++) {
            list.add(i);
        } 
        return list.size() == sz;
    }

    @Property
    public boolean listDelete(@ForAll @IntRange(min = 0, max = 500) int sz) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < sz; i++) {
            list.add(i);
        }
        for (int i = 0; i < sz; i++) {
            list.remove(0);
        }
        return list.size() == 0;
    }
}


