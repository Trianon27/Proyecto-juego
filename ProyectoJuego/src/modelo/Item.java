/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author slondonoq
 */
public class Item {
    public String name;
    public String usage;
    public String effect;
    private String race;
    private String quality;
    private String type;
    public int effectAmount;
    private int manaCost;
    private int magicDamage;
    private int damage;
    public long value;
    private double effectModifier;    

    public Item() {
        this.name = "None";
        this.usage = "None";
        this.effect = "None";
        this.race = "None";
        this.quality = "None";
        this.type = "None";
        this.effectAmount = 0;
        this.manaCost = 0;
        this.magicDamage = 0;
        this.damage = 0;
        this.value = 0;
        this.effectModifier = 0;
        
        
    }

    public Item(String name, String usage, String effect, String race, String quality, String type, int effectAmount, int manaCost, int magicDamage, int damage, long value, double effectModifier) {
        this.name = name;
        this.usage = usage;
        this.effect = effect;
        this.race = race;
        this.quality = quality;
        this.type = type;
        this.effectAmount = effectAmount;
        this.manaCost = manaCost;
        this.magicDamage = magicDamage;
        this.damage = damage;
        this.value = value;
        this.effectModifier = effectModifier;
    }

    public String getName() {
        return name;
    }

    public String getUsage() {
        return usage;
    }

    public String getEffect() {
        return effect;
    }

    public String getRace() {
        return race;
    }

    public String getQuality() {
        return quality;
    }

    public String getType() {
        return type;
    }

    public int getEffectAmount() {
        return effectAmount;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public int getDamage() {
        return damage;
    }

    public long getValue() {
        return value;
    }

    public double getEffectModifier() {
        return effectModifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEffectAmount(int effectAmount) {
        this.effectAmount = effectAmount;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public void setEffectModifier(double effectModifier) {
        this.effectModifier = effectModifier;
    }

    public Object setType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int setDamage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    



}
