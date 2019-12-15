/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import modelo.Armor;
import modelo.Hero;

/**
 *
 * @author slondonoq
 */
public class ArmorManagement {
    private Hero hero;

    public ArmorManagement(Hero hero) {
        this.hero = hero;
    }

    public ArmorManagement() {
        hero = new Hero();
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
    
    private boolean isCompleteSet(Armor[] armor){
        String possibleArmorSet = "";
        // checking if the first slot is not empty to compare armor piece names
        if (armor[0] != null){
            possibleArmorSet = armor[0].getName();
        } else {
            // if it is, set is not complete
            return false;
        }
        for(int i=1; i<=3; i++){
            // checking if every other armor slot is empty to keep on comparing
            if (armor[i] != null){
                if (armor[i].getName().equals(possibleArmorSet)){
                } else {
                    // if armor name is not the same, then the set is not complete
                    return false;
                }
            } else {
                // if any other armor slot is empty, set is not complete
                return false;
            }
        }
        return true;
    }
    
    private void applyArmorBonus(Armor[] armor){
        switch (armor[0].getWholeSetEffect()) {
            case "Increases melee damage":
                int currentDamage = hero.getMeleeDamage();
                int newDamage = (int) (currentDamage*(armor[0].getWholeSetEffectBonus()+1));
                hero.setMeleeDamage(newDamage);
                break;
            case "Increases magic damage":
                int currentMagicDamage = hero.getMagicDamage();
                int newMagicDamage = (int) (currentMagicDamage*(armor[0].getWholeSetEffectBonus()+1));
                hero.setMagicDamage(newMagicDamage);
                break;
            case "Increases defense":
                int currentDefense = hero.getDefense();
                int newDefense = (int) (currentDefense*(armor[0].getWholeSetEffectBonus()+1));
                hero.setDefense(newDefense);
                break;
            case "Increases magic defense":
                int currentMagicDefense = hero.getMagicDefense();
                int newMagicDefense = (int) (currentMagicDefense*(armor[0].getWholeSetEffectBonus()+1)); 
                hero.setMagicDefense(newMagicDefense);
                break;
            case "Increases health":
                long currentMaxHealth = hero.getMaxHealth();
                long newMaxHealth = (long)(currentMaxHealth*(armor[0].getWholeSetEffectBonus()+1));
                hero.setMaxHealth(newMaxHealth);
                break;
            case "Increases mana":
                long currentMaxMana = hero.getMaxMana();
                long newMaxMana = (long)(currentMaxMana*(armor[0].getWholeSetEffectBonus()+1));
                hero.setMaxHealth(newMaxMana);
                break;
                }
    }
    
    private void removeArmorBonus(Armor[] armor){
        switch (armor[0].getWholeSetEffect()) {
            case "Increases melee damage":
                int currentDamage = hero.getMeleeDamage();
                int newDamage = (int) (currentDamage/(armor[0].getWholeSetEffectBonus()+1));
                hero.setMeleeDamage(newDamage);
                break;
            case "Increases magic damage":
                int currentMagicDamage = hero.getMagicDamage();
                int newMagicDamage = (int) (currentMagicDamage/(armor[0].getWholeSetEffectBonus()+1));
                hero.setMagicDamage(newMagicDamage);
                break;
            case "Increases defense":
                int currentDefense = hero.getDefense();
                int newDefense = (int) (currentDefense/(armor[0].getWholeSetEffectBonus()+1));
                hero.setDefense(newDefense);
                break;
            case "Increases magic defense":
                int currentMagicDefense = hero.getMagicDefense();
                int newMagicDefense = (int) (currentMagicDefense/(armor[0].getWholeSetEffectBonus()+1)); 
                hero.setMagicDefense(newMagicDefense);
                break;
            case "Increases health":
                long currentMaxHealth = hero.getMaxHealth();
                long newMaxHealth = (long)(currentMaxHealth/(armor[0].getWholeSetEffectBonus()+1));
                hero.setMaxHealth(newMaxHealth);
                break;
            case "Increases mana":
                long currentMaxMana = hero.getMaxMana();
                long newMaxMana = (long)(currentMaxMana/(armor[0].getWholeSetEffectBonus()+1));
                hero.setMaxHealth(newMaxMana);
                break;
        }
    }
    
    private void equipArmor(Armor armorPiece){
        Armor[] currentArmor = hero.getArmorSpaces();
        // initializing pieceIndex to avoid compiling errors
        int pieceIndex = 0;
        
        // asigning an index to the piece to make the management easier
        switch(armorPiece.getPiece()){
            case "Helmet":
                pieceIndex = 0; 
                break;
            case "Chestplate":
                pieceIndex = 1;
                break;
            case "Leggins":
                pieceIndex = 2;
                break;
            case "Boots":
                pieceIndex = 3;
                break;
        }
        
        // then checking if the piece slot where the armor piece goes in is empty 
        if (currentArmor[pieceIndex] == null){
            // if empty, equipping armor piece
            currentArmor[pieceIndex] = armorPiece;
            
            // if the armor set is now complete, proceed to apply it's bonus
            if (isCompleteSet(currentArmor)) {
                applyArmorBonus(currentArmor);
            } else {
                // if set is not complete we do nothing
            }
        } else {
            // if slot is not empty, we proceed to check if set is already complete
            if (isCompleteSet(currentArmor)){
                // if it is, we have to remove it's bonus before equipping the armor piece
                removeArmorBonus(currentArmor);
            } else {
                // if it's not, we equip the piece and then check if the armor set was completed
                currentArmor[pieceIndex] = armorPiece;
                if (isCompleteSet(currentArmor)){
                    // if it is now complete, we apply the bonus
                    applyArmorBonus(currentArmor);
                }
            }
        }
        
        //after going through all the possible cases, all that is left is to set our hero armor
        hero.setArmorSpaces(currentArmor);
    }
    
    private void unequipArmor(Armor armorPiece){
        Armor[] currentArmor = hero.getArmorSpaces();
        // initializing pieceIndex to avoid compiling errors
        int pieceIndex = 0;
        
        // asigning an index to the piece to make the management easier
        switch(armorPiece.getPiece()){
            case "Helmet":
                pieceIndex = 0; 
                break;
            case "Chestplate":
                pieceIndex = 1;
                break;
            case "Leggins":
                pieceIndex = 2;
                break;
            case "Boots":
                pieceIndex = 3;
                break;
        }
        
        // then we would need to check if our hero has a complete set of armor
        if (isCompleteSet(currentArmor)){
            // if it is, we proceed to remove it's bonus
            removeArmorBonus(currentArmor);
        }
        
        /* then, we can unequip the armor piece.
           As arrays are a bit strict, to do this we need to copy the elements
           we have in the armor array into a new one except for the armor piece
           we want to unequip
        */
        
        Armor[] newArmorSet = new Armor[4];
        
        /* we copy them by using two for loops, one that goes before the item
           we want to unequip, and one after it.
        */
        for(int i=0; i<pieceIndex; i++) {
            newArmorSet[i] = currentArmor[i];
        }
        for( int i=pieceIndex+1; i==3; i++) {
            newArmorSet[i] = currentArmor[i];
        }
        // and we're done!
    }
}
