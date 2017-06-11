package com.epam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LifoArrayList<E> extends ArrayList<E> {

    public Iterator<E> iterator() {
        return new LifoIterator();
    }

    private class LifoIterator implements Iterator<E> {
        int cursor;

        public LifoIterator() {
            cursor = size() -1;
        }

        public boolean hasNext() {
            if (cursor >= 0) {
                return true;
            } else {
                return false;
            }
        }

        public E next() {
            if (cursor >= 0) {
                E element = (E) get(cursor);
                cursor--;
                return element;
            } else {
                throw new NoSuchElementException();
            }
        }

        public void remove() {

        }
    }

}
