package dsa.HashMap;

import java.util.*;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> bucket;
    private int size;
    private int bucketSize;

    public Map() {
        this.size = 0;
        this.bucketSize = 10;
        bucket = new ArrayList<>();
        for (int i = 0; i < bucketSize; i++) {
            bucket.add(null);
        }
    }

    ////// Get HashCode //////
    private int getIndex(K key) {
        return key.hashCode() % bucketSize;
    }

    ///// Insert Functionality //////

    public void insert(K key, V value) {
        int index = getIndex(key);
        MapNode<K, V> head = bucket.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        MapNode<K, V> newNode = new MapNode<>(key, value);
        bucket.set(index, newNode);
        size++;
        double loadFact = (1.0 * size) / bucketSize;
        if (loadFact > 0.7)
            rehash();
        return;
    }

    //// Re Hash////

    private void rehash() {
        ArrayList<MapNode<K, V>> temp = bucket;
        bucket = new ArrayList<>();
        for (int i = 0; i < bucketSize * 2; i++) {
            bucket.add(null);
        }
        size = 0;
        bucketSize = bucketSize * 2;
        for (int i = 0; i < temp.size(); i++) {
            MapNode<K, V> node = temp.get(i);
            while (node != null) {
                K key = node.key;
                V value = node.value;
                insert(key, value);
                node = node.next;
            }
        }
    }

    ///// Get Value //////

    public V getValue(K key) {
        int index = getIndex(key);
        MapNode<K, V> head = bucket.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    ///// Remove Val //////

    public V delete(K key) {
        int index = getIndex(key);
        MapNode<K, V> prev = null, head = bucket.get(index);

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    bucket.set(index, head.next);
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    ///// Get Map Size ////////
    public int size() {
        return size;
    }

    ///// get Map size ////
    public int mapSize() {
        return this.bucketSize;
    }

    //// check key present or not ///

    public boolean has(K key) {
        int index = getIndex(key);
        return bucket.get(index) != null;
    }
}
