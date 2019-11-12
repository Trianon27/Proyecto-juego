/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;

/*
 *
 * @author slondonoq
 */
public class Hero {
    private String race;
    private String name;
    private long health;
    private int mana;
    private int meleeDamage;
    private int magicDamage;
    private int defense;
    private int magicDefense;
    private ArrayList<Item> inventory;

    public Hero() {
        race = "Human";
        name = "John Doe";
        health = 1000;
        mana = 200;
        meleeDamage = 10;
        magicDamage = 5;
        defense = 5;
        magicDefense = 0;
        inventory = new ArrayList();
    }

    public Hero(String race, String name, long health, int mana, int meleeDamage, int magicDamage, int defense, int magicDefense, ArrayList<Item> inventory) {
        this.race = race;
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.meleeDamage = meleeDamage;
        this.magicDamage = magicDamage;
        this.defense = defense;
        this.magicDefense = magicDefense;
        this.inventory = inventory;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMeleeDamage() {
        return meleeDamage;
    }

    public void setMeleeDamage(int meleeDamage) {
        this.meleeDamage = meleeDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
    
}
