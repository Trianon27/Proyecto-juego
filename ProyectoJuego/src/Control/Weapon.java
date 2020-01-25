
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
    
// We equip the hero
    
    public void equipItem (Item heroI){
        //First we have to verify if the weapon or the item is the same class of the hero.
        // if not the hero wouldnt equip the weapon. 
        Item weapons []= hero.getMainInventory(); 
        String race= hero.getRace(); 
        String weaponRace= heroI.getRace();
        int slot=0; 
        if (weaponRace==race){
           switch (heroI.getType()){
               //we check if the inventory is empty in the specified slot 
               case "Principal_Weapon": slot=1;
                     if (weapons[slot]==null){
                         weapons[slot]=heroI;
                         // if it is empty we equip and aplly the effects of the weapon.
                         weaponEffect(heroI);
                     } else{}

                               break;
               case "Secunday_Weapon" : slot=2;  
                     if (weapons[slot]==null){
                         weapons[slot]=heroI;
                         // if it is empty we equip and aplly the effects of the weapon.
                         weaponEffect(heroI);
                     } else{}
                     
                               break; 
               
                 case "spell": 
                     slot= 3;
                     do {  
                        if (weapons[slot]==null){
                           weapons[slot]= heroI;
                         // if it is empty we equip and aplly the effects of the spell.
                            spellEffect(heroI);
                        }else {}
                        slot++; 
                     } while (slot<7);
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
             hero.setCurrentHealth(hero.getCurrentHealth()+heroS.getEffectModifier());  
               break; 
           case "Defense":
               hero.setDefense((int) (hero.getDefense()+heroS.getEffectModifier()));
           case "Damage":
               hero.setMeleeDamage((int) (hero.getMeleeDamage()+heroS.getEffectModifier()));
               
               break;
       }
    }
    
    // This is gonna be the part of unequip weapons and remove the weapons effects
    //as to spells , their effects are momentany so they only will have the removment 
    //of the object. 
    
    //the objects arent gonna be deleted, they will be transfered from the main inventory
    //To the secundary inventory.
    

    
    public void unequipWeapon(Item heroU){
          Item weapons[]= hero.getMainInventory(); 

          
          switch (heroU.getType()){
                case "Principal_Weapon": 
                    transfer(hero.getMainInventory());
                    removeEffect(heroU);
                               break;
                               
               case "Secunday_Weapon" : 
                    transfer(hero.getMainInventory());
                    removeEffect(heroU);   
                               break;  
                               
                 case "spell": 
                    transfer(hero.getMainInventory());
                     
                               break;         
           } 

    }
    
    //We check if the secundary inventory has slots to deposite the item that hero will remove.
    public void transfer (Item inventory[]){
            
            Item secondInventory[]= hero.getSecundaryInventory();
            for (int i=0; i<secondInventory.length; i++){
                    if (secondInventory[i]==null){
                       inventory[i]=secondInventory[i];
                    } else {}
            }
    }
    // wew remove the effects of the heroes. 
    public void removeEffect(Item weapon){
            hero.setMeleeDamage(hero.getMeleeDamage()-weapon.getDamage());
            hero.setMagicDamage(hero.getMagicDamage()-weapon.getMagicDamage());   
    
    }

    }


    
    
    
    
    
    
    