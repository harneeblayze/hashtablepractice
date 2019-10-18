/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtablepractice;

/**
 *
 * @author appzone
 */
public class HashTable {
    private int INITIAL_SIZE = 16;
    HashEntry[]data;
    //like a node class
    class HashEntry{
        String value;
        String key;
        HashEntry next;
        HashEntry(String key, String val){
            this.key = key;
            this.value = val;
        }
    }
    HashTable(){
        data = new HashEntry[INITIAL_SIZE];
    }
    //this guy is used to set our index to help us set and lookup our linkedlist values
    public int getIndex(String key){
        int hash = key.hashCode();
        int index = (hash & 0x7fffffff)%INITIAL_SIZE;
        System.out.println(index);
        System.out.println(key);
        
        return index;
        
    }
    
    public void put(String key, String val){
        //lets get the index of our key so that we can set the linkedlist value in that index
        int index = getIndex(key);
        //now we need to create the linkedlist data and set it to that index above
        HashEntry entry = new HashEntry(key,val);
        //check if there was an existing node data in the index we created
        if(data[index]==null){
            data[index] = entry;
        }else{
            HashEntry entries = data[index];
            while(entries.next!=null){
                entries = entries.next;
            }
            entries.next = entry;
        }
        
        
        
    }
    
    public String get(String key){
        //we need to get the index of the given key
        int index = getIndex(key);
        //we need to point to the linkedlist with that key
        HashEntry getEntries = data[index];
        if(getEntries!=null){
            while(!getEntries.key.equals(key)&& getEntries.next!=null){
                getEntries = getEntries.next;
            }
            System.out.println(getEntries.value);
            return getEntries.value;
            
        }
        return null;
    }
    
}
