/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import modelo.Hero;
import modelo.Item;

/**
 *
 * @author srodr
 */
public class Weapon {
    
    public Hero hero;

    public Weapon(Hero hero) {
        this.hero = hero;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
    

    
    public void equipItem (Item heroI){
        Item weapons []= hero.getInventory(); 
        String race= hero.getRace(); 
        String weaponRace= heroI.getRace();
        int slot=0; 
        if (weaponRace==race){
           switch (heroI.getType()){
               case "Principal_Weapon": slot=1;
                     if (weapons[slot]==null){
                         weapons[slot]=heroI;
                         weaponEffect(heroI);
                     } else{}

                               break;
               case "Secunday_Weapon" : slot=2;  
                     if (weapons[slot]==null){
                         weapons[slot]=heroI;
                     } else{}
                     
                               break; 
               
                 case "spell": 
                     slot= 3;
                     do {  
                        if (weapons[slot]==null){
                           weapons[slot]= heroI; 
                        }
                        slot++; 
                     } while (slot<7);
                               break;         
           } 
           
        }
        
    }
    
    public void weaponEffect (Item heroW){
            hero.setMeleeDamage(hero.getMeleeDamage()+heroW.getDamage());
            hero.setMagicDamage(hero.getMagicDamage()+heroW.getMagicDamage());  
    }
    
    public void spellEffect ( Item heroS){
       switch (heroS.getEffect()){
           case "Health": 
             hero.setCurrentHealth(hero.getCurrentHealth()+heroS.getEffectModifier());  
               break; 
           case "Defense":
               hero.setDefense((int) (hero.getDefense()+heroS.getEffectModifier()));
           case "Damage":
               hero.setMeleeDamage((int) (hero.getMeleeDamage()+heroS.getEffectModifier()));
               
               break;
       
       
       
       
       }
    
    
    }
    

    }
    
    
    
    
    
    
    
    
