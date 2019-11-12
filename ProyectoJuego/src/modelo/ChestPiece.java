/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author User
 */
public class ChestPiece extends Armor {
    private String race;
    private int defense;
    private int magicDefense;
    private String atribute;
    private int atributeBonus;
    private long value;
    private String quality;

    public ChestPiece() {
        race = "None";
        defense = 0;
        magicDefense = 0;
        atribute = "None";
        atributeBonus = 0;
        value = 0;
        quality = "None";
    }

    public ChestPiece(String race, int defense, int magicDefense, String atribute, int atributeBonus, long value, String quality) {
        this.race = race;
        this.defense = defense;
        this.magicDefense = magicDefense;
        this.atribute = atribute;
        this.atributeBonus = atributeBonus;
        this.value = value;
        this.quality = quality;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
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

    public String getAtribute() {
        return atribute;
    }

    public void setAtribute(String atribute) {
        this.atribute = atribute;
    }

    public int getAtributeBonus() {
        return atributeBonus;
    }

    public void setAtributeBonus(int atributeBonus) {
        this.atributeBonus = atributeBonus;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
    
}
