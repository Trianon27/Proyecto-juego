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
public class Armor {
    private String name;
    private int baseDefense;
    private String wholeSetEffect;
    private double wholeSetEffectBonus;
    private String piece;

    public Armor() {
        name = "???";
        baseDefense = 0;
        wholeSetEffect = "None";
        wholeSetEffectBonus = 0;
        piece = "???";
    }

    public Armor(String name, int baseDefense, String wholeSetEffect, double wholeSetEffectBonus, String piece) {
        this.name = name;
        this.baseDefense = baseDefense;
        this.wholeSetEffect = wholeSetEffect;
        this.wholeSetEffectBonus = wholeSetEffectBonus;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public String getWholeSetEffect() {
        return wholeSetEffect;
    }

    public void setWholeSetEffect(String wholeSetEffect) {
        this.wholeSetEffect = wholeSetEffect;
    }

    public double getWholeSetEffectBonus() {
        return wholeSetEffectBonus;
    }

    public void setWholeSetEffectBonus(double wholeSetEffectBonus) {
        this.wholeSetEffectBonus = wholeSetEffectBonus;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }
    
}
