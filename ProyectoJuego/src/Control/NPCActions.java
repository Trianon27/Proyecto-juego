
package Control;

import modelo.Hero;
import modelo.NPC;



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


    
    
    public void Npcactions (NPC Nperson, NPC npc){
         //first we check if the NPC is enemy, allie or neutral and also if the hero or npc is alive
         
         if (hero.getState()== "alive" || npc.getState()=="alive"){
            npc.setAction("neutral");
            Nperson.setAction("neutral");
            switch (Nperson.getSide()){
                
                 case "enemy":
                    
                    //We check the target of the enemy                
                    if(Nperson.getTarget()== "hero" || Nperson.getTarget()== "allie"){
                        // if target are the hero or a allie, he will attack, firstly to the hero. 
                        Nperson.setState("attack");
                        
                        if(Nperson.getState()=="attack" && Nperson.getTarget()=="hero"){
                            hero.setCurrentHealth(hero.getCurrentHealth()-Nperson.getMeleeDamage());
                            //Now we check the state of the hero, if his current health is 0 or less than 0, he will die
                            if (hero.getCurrentHealth()<=0){
                                hero.setState("dead");
                                //the NPC will change his state
                                }else{}
                        }else {
                        //Now we know that the target is an allie NPC
                         
                                npc.setMaxHealth(npc.getCurrentHealth()-Nperson.getMeleeDamage());
                                //Now we check the state of the npc, if his current health is 0 or less than 0, he will die
                                if (npc.getCurrentHealth()<=0){
                                    npc.setState("dead");
                                    // NPC will change his state
                                   
                                }
                          
                        }
                    //If the enemy didnt find a target he will with his neutral state.
                    }  else {}
                    break; 
                    
                 
                 case "allie":
                     //firstly we have to identify the target of the allie. Is easilier do a switch 
                     switch (npc.getTarget()){
                         //if his target is enemy his action will change to attack 
                         case "enemy":
                             npc.setAction("attack");
                             Nperson.setMaxHealth(Nperson.getCurrentHealth()-npc.getMeleeDamage());
                                //Now we check the state of the npc, if his current health is 0 or less than 0, he will die
                                if (Nperson.getCurrentHealth()<=0){
                                    Nperson.setState("dead");
                                }else{}
                                
                                break;
                            
                         case "hero":
                             //His action will change to help, but in the next circustances                         
                             if (hero.getCurrentHealth()<hero.getMaxHealth()){
                                 npc.setAction("help");
                                 hero.setCurrentHealth(hero.getCurrentHealth()+npc.getHelp());
                                 //if the hero has his current healt at top, npc will change his state.
                                 if (hero.getCurrentHealth()==hero.getMaxHealth()){
                                    npc.setAction("neutral");                                 
                                 }else {}
                                 break; 
                             }
      
                     
                        }
                           
           }
                 
        }
  
         
    }
    

    
 }
    
    
    

