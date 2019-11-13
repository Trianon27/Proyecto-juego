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
    
    private String type;
    private int manaCost;
    private int magicDamage;
    private String effect;
    private double effectModifier;

    public Spell() {
        type = "????";
        manaCost = 0;
        magicDamage = 0;
        effect = "None";
        effectModifier = 0;
    }

    public Spell(String type, int manaCost, int magicDamage, String effect, double effectModifier) {
        this.type = type;
        this.manaCost = manaCost;
        this.magicDamage = magicDamage;
        this.effect = effect;
        this.effectModifier = effectModifier;
    }

    public String getType() {
        return type;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getMagicDamage() {
        return magicDamage;
    }
    
    public String getEffect(){
        return effect;
    }
    
    public double getEffectModifier(){
        return effectModifier;
    }
    
    public void setType(String Type) {
        this.type = type;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }
    
    public void setEffect(String effect) {
        this.effect = effect;
    }
    
    public void setEffectModifier(double effectModifier){
        this.effectModifier = effectModifier;
    }
    
}
