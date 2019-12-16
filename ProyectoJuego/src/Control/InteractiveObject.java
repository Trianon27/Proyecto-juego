package Control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java. util. ArrayList;
import modelo.Hero;
import modelo.Item;


/*
 *
 * @author srodr
 */
public class InteractiveObject {
    
   private Hero _hero;
 
           
    public InteractiveObject() {
        _hero=new Hero();
    }

    public InteractiveObject(Hero _hero) {
        this._hero = _hero;
    }

    public Hero getHero() {
        return _hero;
    }

    public void setHero(Hero _hero) {
        this._hero = _hero;
    }
   

  private void equipItem(Item object){
    
  Item[] heroObject = _hero.getInventory();
  
 //the 1 and 2 slot will be weapons
  //the 3 to 8 slot will be spells, the slots will define the equipment of the hero.
  int slot=0;
  switch (object.getType() ){
      case "principalWeapon": 
         slot=1;
         break;
      case "secudaryWeapon":
         slot=2;
         break;
      case "spell":
          for (int i = 3; i <=7;i++){
          slot = i; 
          break;
          }
    
    //duda sobre el slot      
   if (null== heroObject[slot]){
    
       heroObject[slot]= object; 

  }
  }
  }
  private void ItemBonus (Item object){
  _hero.setMeleeDamage(_hero.getMeleeDamage()+object.getDamage());

  
  
  }
  
  
  

}  
    
    
    
    
    

