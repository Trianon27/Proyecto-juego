/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java. util. ArrayList;

/*
 *
 * @author srodr
 */
public class InteractiveObject {
    
    private  int   storage; 
    private String Type; 
    private ArrayList inventory; 

    public InteractiveObject() {
        storage = 0;
        Type = "???";
        inventory = new ArrayList() ;
        
    }

    public InteractiveObject(int storage, String Type, ArrayList inventory) {
        this.storage = storage;
        this.Type = Type;
        this.inventory = inventory;
    }

    public int getStorage() {
        return storage;
    }

    public String getType() {
        return Type;
    }

    public ArrayList getInventory() {
        return inventory;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setInventory(ArrayList inventory) {
        this.inventory = inventory;
    }
    
    
    
    
    
    
    
}
