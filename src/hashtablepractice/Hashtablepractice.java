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
public class Hashtablepractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashTable hashtable = new HashTable();
        hashtable.put("512333", "john snow");
        hashtable.put("512442", "robert baratheon");
        hashtable.put("512444", "arya stark");
        hashtable.get("512444");
        // TODO code application logic here
    }
    
}
