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
    private String name;
    private int amount;
    private String effect;
    private String race;
    private String quality;
    private String type;
    public int effectAmount;
    private int manaCost;
    private int magicDamage;
    private int damage;
    public long value;
    private long effectModifier;    

    public Item() {
        name = "None";
        amount = 1;
        effect = "None";
        race = "None";
        quality = "None";
        type = "None";
        effectAmount = 0;
        manaCost = 0;
        magicDamage = 0;
        damage = 0;
        value = 0;
        effectModifier = 0;
    }

    public Item(String name, int amount, String effect, String race, String quality, String type, int effectAmount, int manaCost, int magicDamage, int damage, long value, long effectModifier) {
        this.name = name;
        this.amount = amount;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public long getEffectModifier() {
        return effectModifier;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setEffectModifier(long effectModifier) {
        this.effectModifier = effectModifier;
    }

}
