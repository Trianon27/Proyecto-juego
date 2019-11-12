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
    private String usage;
    private String effect;
    private int effectAmount;
    private long value;

    public Item() {
        name = "???";
        usage = "None";
        effect = "None";
        effectAmount = 0;
        value = 0;
    }

    public Item(String name, String usage, String effect, int effectAmount, long value) {
        this.name = name;
        this.usage = usage;
        this.effect = effect;
        this.effectAmount = effectAmount;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getEffectAmount() {
        return effectAmount;
    }

    public void setEffectAmount(int effectAmount) {
        this.effectAmount = effectAmount;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
    
}
