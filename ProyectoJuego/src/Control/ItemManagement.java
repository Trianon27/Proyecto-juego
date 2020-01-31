/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import modelo.Hero;
import modelo.Item;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author slondonoq
 */
public class ItemManagement {
    private Hero hero;

    public ItemManagement(Hero hero) {
        this.hero = hero;
    }

    public ItemManagement() {
        hero = new Hero();
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
    
    //The easiest action to do is to add or remove them from the inventory
    private void addToInventory(Item item){
        ArrayList<Item> currentInventory = hero.getMainInventory();
        /*just by adding the item into the ArrayList, and setting the hero's inventory
          to the medified ArrayList we would be done*/
        currentInventory.add(item);
        hero.setMainInventory(currentInventory);
    }
    
    //same thing with removing
    private void removeFromInventory(Item item){
        ArrayList<Item> currentInventory = hero.getMainInventory();
        currentInventory.remove(item);
        hero.setMainInventory(currentInventory);
    }
    
    //They can also be sold
    private void sellItem(Item item, int quantity) {
        ArrayList<Item> currentInventory = hero.getMainInventory();
        //First we need to check if user can sell the desired amount of items
        if(quantity <= item.getAmount()){
            //if it's possible, we calculate the new amount of gold the hero is going to have
            long newGoldAmount = item.getValue()*quantity + hero.getGold();
            //also checking the item index in the ArrayList will be helpful
            int itemIndex = currentInventory.indexOf(item);
            //then we have to check two possible stages
            if(quantity<item.getAmount()){
                /*if the hero has more items than the amount desired to sell:
                    just by changing the item amount and putting it in the same
                    index it was the job is done*/
                item.setAmount(item.getAmount()-quantity);
                currentInventory.set(itemIndex, item);       
            } else {
                /*if the quantity desired to sell is the same amount the hero has,
                  we need to delete the item from the ArrayList*/
                currentInventory.remove(itemIndex);
            }
            /*all that's left to do is to set the hero's main invontory to the modified 
              one and to add the gold recieved from selling the item(s)*/
            hero.setMainInventory(currentInventory);
            hero.setGold(newGoldAmount);
        }
    }
    /*Items can be in cooldown, wich means we can't use them for a certain amount of time,
      so we need to create a function to do the whole process*/
    private void applyCooldown(Item item, long coolDownSecs) throws InterruptedException{
        //we first set the item in cooldown
        item.setInCooldown(true);
        //then we make the function "sleep" so it waits for the specified time to complete
        TimeUnit.SECONDS.sleep(coolDownSecs);
        //once the specified time has passed, we can set the item's cooldown off
        item.setInCooldown(false);
    }
    
    
    /* The main option: use the item, there's two main cases: the item being a 
       consumable (it disappears once it's used) or not*/
    private void useItem(Item item){
        /*The first thing we want to check is if the hero can use it, there's two reasons
          for an item to not be usable:
              -incompatible races
              -item is in cooldown */
        if(hero.getRace().equals(item.getRace()) && !item.isInCooldown()){
            //once we know the conditions required are satisfied we proceed to check if the item is a consumable
            if(item.isConsumable()){
                //if it is we use their specific function
                useConsumableItem(item);
            }
            else{
                //if they're not we proceed to use them depending on the type of items they are
                switch(item.getType()){
                    /*ya que esto hace parte de armas y hechizos de las que ustedes 
                      se encargan dejo esta parte en blanco para que la terminen*/
                }
            }
        }
    }
    
    private void useConsumableItem(Item item){
        switch(item.getType()){
        /*by now we have just thought about potions as consumables,
          as we add more the switch statement will be bigger*/
            case "Potion":
                switch(item.getEffect()){
                    case "healing":
                        /*we have to check if health is not at max to prevent 
                          users from exploiting it as a glitch*/
                        
                        if (hero.getMaxHealth()!=hero.getCurrentHealth()){
                            /*now we know the potion can be used, so we reduce it's amount
                              and add a cooldown*/
                            
                            item.setAmount(item.getAmount()-1);
                            try{
                                applyCooldown(item, item.getCooldownSecs());
                            }
                            catch(Exception InterruptedException){}
                                    /*there´s two posibilities: the player can 
                                      get it's full health or not*/
                                    
                                    if((hero.getCurrentHealth()+item.getEffectAmount())>=hero.getMaxHealth()){
                                        hero.setCurrentHealth(hero.getMaxHealth());
                                    } else {
                                        hero.setCurrentHealth(hero.getCurrentHealth()+item.getEffectAmount());
                                    }
                                }
                                break;
                                /*the other type of potions will give a momentary buff*/
                    case "defense":
                        //we first reduce the item amount
                        
                        item.setAmount(item.getAmount()-1);
                        //then apply the buff
                        
                        hero.setDefense(hero.getDefense()+item.getEffectAmount());
                        //we use the sleep method to mantain the buff for the time we want
                                
                        try{
                            TimeUnit.SECONDS.sleep(30);
                        }
                        catch(Exception InterruptedException){}
                        //once that time has passed we remove the buff
                                
                        hero.setDefense(hero.getDefense()-item.getEffectAmount());
                        break;
                    //the other cases will be the same just changing another stat
                    case "magic defense":
                        item.setAmount(item.getAmount()-1);
                        hero.setMagicDefense(hero.getMagicDefense()+item.getEffectAmount());
                        try{
                            TimeUnit.SECONDS.sleep(30);
                        }
                        catch(Exception InterruptedException){}
                        hero.setMagicDefense(hero.getMagicDefense()-item.getEffectAmount());
                        break;
                    case "damage":
                        item.setAmount(item.getAmount()-1);
                        hero.setMeleeDamage(hero.getMeleeDamage()+item.getEffectAmount());
                        try{
                            TimeUnit.SECONDS.sleep(30);
                        }
                        catch(Exception InterruptedException){}
                        hero.setMeleeDamage(hero.getMeleeDamage()-item.getEffectAmount());
                        break;
                    case "magic damage":
                        item.setAmount(item.getAmount()-1);
                        hero.setMagicDamage(hero.getMagicDamage()+item.getEffectAmount());
                        try{
                            TimeUnit.SECONDS.sleep(30);
                        }
                        catch(Exception InterruptedException){}
                        hero.setMagicDamage(hero.getMagicDamage()-item.getEffectAmount());
                        break;
                }
                break;
            case "":
                break;
        }
    }
             
}