/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author srodr
 */
public class NPC extends Hero {
    
    private String state; 
  
    private String side; 
    private String profession; 

    public NPC() {
       state = state;
       side = side;
       profession = profession;
        
        
    }

    public NPC(String state, String side, String profession) {
        this.state = state;
        this.side = side;
        this.profession = profession;
    }

    public String getState() {
        return state;
    }

    public String getSide() {
        return side;
    }

    public String getProfession() {
        return profession;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    
  
    
    
    
}
