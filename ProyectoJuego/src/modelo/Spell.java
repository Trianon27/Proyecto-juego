/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author srodr
 */
public class Spell {
    
    private String Type;
    private int manaCost;
    private int magicDamage; 

    public Spell() {
        this.Type = "????";
        this.manaCost = 0;
        this.magicDamage = 0;
    }

    public Spell(String Type, int manaCost, int magicDamage) {
        this.Type = Type;
        this.manaCost = manaCost;
        this.magicDamage = magicDamage;
    }

    public String getType() {
        return Type;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }
    
    
    
    
    
    
    
}
