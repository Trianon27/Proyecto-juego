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
    private long maxHealth;
    private long currentHealth;
    private long maxMana;
    private long currentMana;
    private int meleeDamage;
    private int magicDamage;
    private int defense;
    private int magicDefense;
    private Item [] inventory;
    private Armor[] armorSpaces;
    private long gold;

    public Hero() {
        race = "Human";
        name = "John Doe";
        maxHealth = 1000;
        currentHealth = 1000;
        maxMana = 200;
        currentMana = 200;
        meleeDamage = 10;
        magicDamage = 5;
        defense = 5;
        magicDefense = 0;
        inventory = new Item[7];
        armorSpaces = new Armor[4];
        gold = 1000;
    }

    public Hero(String race, String name, long maxHealth, long currentHealth, long maxMana, long currentMana, int meleeDamage, int magicDamage, int defense, int magicDefense, Item[] inventory, Armor[] armorSpaces, long gold) {
        this.race = race;
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.maxMana = maxMana;
        this.currentMana = currentMana;
        this.meleeDamage = meleeDamage;
        this.magicDamage = magicDamage;
        this.defense = defense;
        this.magicDefense = magicDefense;
        this.inventory = inventory;
        this.armorSpaces = armorSpaces;
        this.gold = gold;
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

    public long getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(long maxHealth) {
        this.maxHealth = maxHealth;
    }
    
    public long getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(long currentHealth) {
        this.currentHealth = currentHealth;
    }

    public long getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(long maxMana) {
        this.maxMana = maxMana;
    }
    
    public long getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(long currentMana) {
        this.currentMana = currentMana;
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

    public  Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }
    
    public long getGold () {
        return gold;
    }
    
    public void setGold (long gold){
        this.gold = gold;
    }

    public Armor[] getArmorSpaces() {
        return armorSpaces;
    }

    public void setArmorSpaces(Armor[] armorSpaces) {
        this.armorSpaces = armorSpaces;
    }

    public int setMeleeDamage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Item[] setInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
