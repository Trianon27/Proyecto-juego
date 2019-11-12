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
    private int gold; 
    private String kind; 
    private String work; 

    public NPC() {
         this.state = "???";
        this.gold = 0;
        this.kind = "???";
        this.work = "???";

    }

    public NPC(String state, int gold, String kind, String work) {
        this.state = state;
        this.gold = gold;
        this.kind = kind;
        this.work = work;
    }

    public String getState() {
        return state;
    }

    public int getGold() {
        return gold;
    }

    public String getKind() {
        return kind;
    }

    public String getWork() {
        return work;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setWork(String work) {
        this.work = work;
    }

    
    
    
    
    
}
