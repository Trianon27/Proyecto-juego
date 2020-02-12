
package Control;

import modelo.Hero;
import modelo.NPC;
import Control.ItemManagement;
import modelo.Item;


public class NPCActions {
     
    public Hero hero;
   

    public  NPCActions(Hero hero, NPC npc) {
        this.hero = hero;
         
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;}


    
    
    public void NpcIdeas (NPC Nperson, NPC npc){
         //first we check if the NPC is enemy, allie or neutral and also if the hero or npc is alive
         
         if (hero.getState()== "alive" || npc.getState()=="alive"){
            Nperson.setAction("neutral");
            switch (Nperson.getSide()){
                
                 case "enemy":
                    
                    //We check the target of the enemy                
                     switch (Nperson.getTarget()){
                         //if his target is hero his action will change to attack 
                         case "hero":
                             npc.setAction("attack");
                             hero.setMaxHealth(hero.getCurrentHealth()-Nperson.getMeleeDamage());
                                //Now we check the state of the hero, if his current health is 0 or less than 0, he will die
                                if (hero.getCurrentHealth()<=0){
                                    hero.setState("dead");
                                }else{}
                                break;
                    // Now we repeat the same procedure with npc´s
                          case "allie":
                             Nperson.setAction("attack");
                             npc.setMaxHealth(npc.getCurrentHealth()-Nperson.getMeleeDamage());
                                //Now we check the state of the hero, if his current health is 0 or less than 0, he will die
                                if (npc.getCurrentHealth()<=0){
                                    npc.setState("dead");
                                }else{} 
                     }
                                
                              
                    break; 
                    
                 
                 case "allie":
                     //firstly we have to identify the target of the allie. Is easilier do a switch 
                     switch (Nperson.getTarget()){
                         //if his target is enemy his action will change to attack 
                         case "enemy":
                             Nperson.setAction("attack");
                             npc.setMaxHealth(npc.getCurrentHealth()-Nperson.getMeleeDamage());
                                //Now we check the state of the npc, if his current health is 0 or less than 0, he will die
                                if (npc.getCurrentHealth()<=0){
                                    npc.setState("dead");
                                }else{}
                                
                                break;
                            
                         case "hero":
                             //His action will change to help, but in the next circustances                         
                             if (hero.getCurrentHealth()<hero.getMaxHealth()){
                                 Nperson.setAction("help");
                                 hero.setCurrentHealth(hero.getCurrentHealth()+Nperson.getHelp());
                                 //if the hero has his current healt at top, npc will change his state.
                                 if (hero.getCurrentHealth()==hero.getMaxHealth()){
                                    Nperson.setAction("neutral");                                 
                                 }else {}
                                 break; 
                             }
                        }
                        break;
                        
              
                           
           }
        //If the npc or hero are dead, the interaction dont ocurred          
        }else{}
  
         
    }
    
    public void HeroToNpc (Item Herow, NPC nPc){
        //First we specfied what kind of attack use the hero
        switch (Herow.getType() ){
        
            case "spell": 
                //Now we look how many damage the hero cause. 
                int HeroMagicDamage=Herow.getMagicDamage(); 
                //Now we take the defense of NPC
                int npcMagicDefense= nPc.getMagicDefense(); 
                //now we interact, but we have to do the next equiation, the total damage will be split by defense
                int totalMagicDamage= HeroMagicDamage/npcMagicDefense;
                nPc.setCurrentHealth(nPc.getCurrentHealth()-totalMagicDamage);
                
                break; 
                
            case "Principal_Weapon":
                int HeroDamage=Herow.getDamage(); 
                
                int npcDefense= nPc.getDefense(); 
                
                int totalDamage= HeroDamage/npcDefense;
                nPc.setCurrentHealth(nPc.getCurrentHealth()-totalDamage);
                
                break; 
        
        }
    
    
    
    
    }

    
 }
    
    
    

