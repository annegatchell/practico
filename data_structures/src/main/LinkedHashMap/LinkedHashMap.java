import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap<K,V> 
    extends HashMap<K, V>
{
    
    KeyNode firstKeyInserted;
    KeyNode lastKeyInserted;

   private class KeyNode< extends {
        K key;
        V value;
        KeyNode next;
        KeyNode prev;
        KeyNode(K key, V value){
            super();
            this.key = key;
            this.value = value;
   	    }
    }

    public void put(K key, V value) {
        KeyNode node = new KeyNode(key, value);
        lastKeyInserted.next = node;
        node.prev = lastKeyInserted;
        lastKeyInserted = node;
        super.put(key, node);
    }

    public V get(Object key) {
	   KeyNode node = super.get(key);
	   return node.value;
    }
    
    public V remove(Object key) {
	   KeyNode nodeToDelete = super.get(key);
       KeyNode prevOfDelete = nodeToDelete.prev;
       KeyNode nextOfDelete = nodeToDelete.next;
       prevOfDelete.next = nextOfDelete;
       nextOfDelete.prev = prevOfDelete;
       super.remove(key);
    }
    
}
