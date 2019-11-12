/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Faes PC
 */
public class Potion extends Item{
    
    
    private String raceDetermination;

    public Potion() {
        
        raceDetermination = "???";
        name = "???";
        usage = "None";
        effect = "None";
        effectAmount = 0;
        value = 0;
    }

    public Potion(String raceDetermination, String name, String usage, String effect, int effectAmount, long value) {
        super(name, usage, effect, effectAmount, value);
        this.raceDetermination = raceDetermination;
        this.name = name;
        this.usage = usage;
        this.effect = effect;
        this.effectAmount = effectAmount;
        this.value = value;
        
    }

    public String getRaceDetermination() {
        return raceDetermination;
    }

    public void setRaceDetermination(String raceDetermination) {
        this.raceDetermination = raceDetermination;
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


