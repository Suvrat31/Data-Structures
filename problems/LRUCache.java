package problems;
import java.util.Iterator;
//Implementing LRU Caching using a LinkedHashSet
// We use a LinkedHashset to maintain order of insertion and hence making the immplementation concise
import java.util.LinkedHashSet;
import java.util.Set;

public class LRUCache {
    
    Set<Integer> cache;
    int cacheLimit;

    //Constructor declaration
    public LRUCache(int cacheLimit){
        //This line means that we are settting up a linked hash set of integer type that has the size of cacheLimit
        this.cache = new LinkedHashSet<Integer>(cacheLimit);
        this.cacheLimit = cacheLimit;
    }

    public boolean get(int key){
        //if the cache does not contain the value return false
        if(!cache.contains(key))
            return false;
        
        // this removes the key that is requested from the front and then adds it to the end of the list
        cache.remove(key);
        cache.add(key);
        return true;
    }
    // this function checks if the key isnt present then insert that key into the cache using the defined put function
    public void check(int key){
        if(get(key) == false)
        put(key);
    }

    public void put (int key){
        //If the cache contains the key then we first remove it, check if the cache is full 
        //: where if it is full we remove the first element which we call the recently used element by using iterator.next
        //We finally then add the key
        if(cache.contains(key))
        cache.remove(key);
        else if(cache.size() == cacheLimit){
            int firstvalue = cache.iterator().next();
            cache.remove(firstvalue);
        }
        cache.add(key);
    }

    //Function to display all the elements of the final List 
    public void display(){
        Iterator<Integer> i = cache.iterator();
        while(i.hasNext()){
            System.out.println(i.next() + " ");
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(4);
        cache.check(1);
        cache.check(2);
        cache.check(3);
        cache.check(1);
        cache.check(4);
        cache.check(5);
        cache.display();
    }
}
