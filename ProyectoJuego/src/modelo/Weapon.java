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
public class Weapon {
    private String name;
    private long value;
    private int damage;
    private String race;
    private int magicDamage;
    private String quality;

    public Weapon() {
        name = "???";
        value = 0;
        damage = 0;
        race = "???";
        magicDamage = 0;
        quality = "None";
    }

    public Weapon(String name, long value, int damage, String race, int magicDamage, String quality) {
        this.name = name;
        this.value = value;
        this.damage = damage;
        this.race = race;
        this.magicDamage = magicDamage;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
      
}
