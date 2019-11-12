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
public class NPC {
    private String name; 
    private int life; 
    private int defense; 
    private int damage; 
    private boolean state; 
    private int gold; 
    private ArrayList inventory; 

    public NPC() {
        this.name = "???";
        this.life = 0;
        this.defense = 0;
        this.damage = 0;
        this.state = false;
        this.gold = 0;
        this.inventory = new ArrayList();
        
    }

    public NPC(String name, int life, int defense, int damage, boolean state, int gold, ArrayList inventory) {
        this.name = name;
        this.life = life;
        this.defense = defense;
        this.damage = damage;
        this.state = state;
        this.gold = gold;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getDefense() {
        return defense;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isState() {
        return state;
    }

    public int getGold() {
        return gold;
    }

    public ArrayList getInventory() {
        return inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setInventory(ArrayList inventory) {
        this.inventory = inventory;
    }

  
    
    
    
    
    
}
