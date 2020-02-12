
package Control;

import java.util.ArrayList;
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
    
// We equip the hero
    
    public void equipItem (Item heroI){
        //First we have to verify if the weapon or the item is the same class of the hero.
        // if not the hero wouldnt equip the weapon. 
        Item[] weapons= hero.getSecondaryInventory(); 
        String race= hero.getRace(); 
        String weaponRace= heroI.getRace();
        int slot=0; 
        if (weaponRace==race){
           switch (heroI.getType()){
               //we check if the inventory is empty in the specified slot 
               case "Weapon": slot=0;
                     if (weapons[slot]==null){
                         weapons[slot]= heroI;
                         // if it is empty we equip and aplly the effects of the weapon.
                         weaponEffect(heroI);
                     } else{ 
                         slot=1;
                         if (weapons[slot]==null){
                         weapons[slot]= heroI;
                         // if it is empty we equip and aplly the effects of the weapon.
                         weaponEffect(heroI);
                        } else{}}

                               break;
 
                 case "spell": 
                     slot= 2;
                     do {  
                        if (weapons[slot]==null){
                           weapons[slot]=heroI;
                         // if it is empty we equip and aplly the effects of the spell.
                            spellEffect(heroI);
                        }else {}
                        slot++; 
                     } while (slot<6);
                               break;         
           } 
         
        }else{}
        
    }
    
    //When is a weapon que apply damage and magic damage, bro.
    public void weaponEffect (Item weapon){
            hero.setMeleeDamage(hero.getMeleeDamage()+weapon.getDamage());
            hero.setMagicDamage(hero.getMagicDamage()+weapon.getMagicDamage());  
    }
    
    //When we apply the spell effects, may vary according the type of spell.
    public void spellEffect ( Item heroS){
       switch (heroS.getEffect()){
           case "Health": 
             hero.setCurrentHealth(hero.getCurrentHealth()+heroS.getEffectAmount());  
               break; 
           case "Defense":
               hero.setDefense((int) (hero.getDefense()+heroS.getEffectAmount()));
           case "Damage":
               hero.setMeleeDamage((int) (heroS.getEffectAmount()+hero.getMeleeDamage()));
               
               break;
       }
    }
    
    // This is gonna be the part of unequip weapons and remove the weapons effects
    //as to spells , their effects are momentany so they only will have the removment 
    //of the object. 
    
    //the objects arent gonna be deleted, they will be transfered from the main inventory
    //To the secundary inventory.
    

    
    public void unequipWeapon(Item heroU){
          Item[] weapons= hero.getSecondaryInventory(); 

          
          switch (heroU.getType()){
                case "Principal_Weapon": 
                    transfer(hero.getSecondaryInventory());
                    removeEffect(heroU);
                               break;
                               
               case "Secunday_Weapon" : 
                    transfer(hero.getSecondaryInventory());
                    removeEffect(heroU);   
                               break;  
                               
                 case "spell": 
                    transfer(hero.getSecondaryInventory());
                     
                               break;         
           } 

    }
    
    //We check if the secundary inventory has slots to deposite the item that hero will remove.
    public void transfer (Item inventory[]){
            int MainInventoryLimit= 0;
            ArrayList<Item> mainInventory= hero.getMainInventory();
            for (int i=0; i< MainInventoryLimit; i++){
                    if (mainInventory.get(i) ==null){
                       mainInventory.set(i, mainInventory.get(i));
                    } else {}
            }
    }
    // wew remove the effects of the heroes. 
    public void removeEffect(Item weapon){
            hero.setMeleeDamage(hero.getMeleeDamage()-weapon.getDamage());
            hero.setMagicDamage(hero.getMagicDamage()-weapon.getMagicDamage());   
    
    }

    }


    
    
    
    
    
    
    
