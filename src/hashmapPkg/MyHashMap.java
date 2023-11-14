//Once final keyword assigned to a variable it cannot be changed
// When used in context of a method,
//static keyword says that the variable belongs to the class only instead of the instances of the class; there is only
// 1 copy that is shared among all the instances of the class.

package hashmapPkg;
import java.lang.Math ;

public class MyHashMap<K,V> {

    private static final int DEFAULT_SIZE = 1 << 4 ;
    private static final int MAXIMUM_CAPACITY = 1 << 30 ;

    Entry<K,V>[] hashTable ;

    MyHashMap() {
        hashTable = new Entry[DEFAULT_SIZE];
    }
//
    MyHashMap(int capacity) {
        int tableSize = tableSizeCapacity(capacity);
        hashTable= new Entry[tableSize];
    }

     private int tableSizeCapacity(int cap) {
        double logBase2Res = logBase2(cap) ;
        int logSize = (int)Math.ceil(logBase2Res) ;
        int res = (int)Math.pow(2, logSize) ;
        return Math.min(res, MAXIMUM_CAPACITY) ;
    }

    private static double logBase2(int x) {
        return Math.log(x) / Math.log(2) ;
    }


    static class Entry<K, V> {
        K key ;
        V value ;
        Entry<K,V> next ;

        Entry(K k, V v) {

            key = k ;
            value = v ;
        }
    }

    public void put(K key, V value) {
        int hashCode = key.hashCode() % hashTable.length ;
        Entry<K,V> node = hashTable[hashCode] ;

        if (node == null) {
            Entry<K,V> newNode = new Entry(key, value) ;
            hashTable[hashCode] = newNode ;
        }
        else {
            Entry<K,V> prevNode = node ;
            while (node != null) {
                if (node.key == key) {
                    node.value = value;
                    return ;
                }
                prevNode = node ;
                node = node.next;
            }
            Entry<K,V> newNode = new Entry(key, value) ;
            prevNode.next = newNode ;
        }

    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length ;
        Entry<K,V> node = hashTable[hashCode] ;

        while (node != null) {
            System.out.println(node.key);
            if (node.key == key) {
                return (V)node.value ;
            }
            node = node.next ;
        }

        return null ;
    }



    public static void main(String[] args) {

        MyHashMap<Integer, String> myHashMap = new MyHashMap(2);
        myHashMap.put(1, "hello") ;
        myHashMap.put(2, "bye") ;
        myHashMap.put(3, "bye2") ;
        myHashMap.put(4, "bye3") ;
        System.out.println(myHashMap.get(4) );
    }
}
