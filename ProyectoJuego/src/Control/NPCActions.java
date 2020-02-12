
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


    
    
    private void NpcToNpc(NPC Nperson, NPC npc){   
            Nperson.setAction("neutral");
            //we apply the total damage to hero and Npc
            int damageN= Nperson.getMeleeDamage(); 
            int NPC= hero.getDefense();
            int Npcd= npc.getDefense();
            
            int totalDamagen=damageN/Npcd;
            switch (Nperson.getSide()){
                
                case "enemy":
                             do{ Nperson.setAction("attack");
                             npc.setMaxHealth(npc.getCurrentHealth()-totalDamagen);
                             //Npc waits 1.5 seconds
                             delaySegundoYMedio();
                                //Now we check the state of the npc, if his current health is 0 
                                //or less than 0, he will die
                                if (npc.getCurrentHealth()<=0){
                                    npc.setState("dead");
                                }else{}}
                             while(npc.getState()!="dead");
                             //if the state of Npc is dead, bucle will stop
                             
                         
                    break; 
                    
                 
                case "allie":
                     //firstly we have to identify the target of the allie. Is easilier do a switch 
                     switch (Nperson.getTarget()){
                         //if his target is enemy his action will change to attack 
                         case "enemy":
                             do{
                                 Nperson.setAction("attack");
                                npc.setMaxHealth(npc.getCurrentHealth()-totalDamagen);
                                delaySegundoYMedio();
                                //Now we check the state of the npc, if his current health is 0 
                                //or less than 0, he will die
                                if (npc.getCurrentHealth()<=0){
                                    npc.setState("dead");
                                }else{}}
                             while(npc.getState()!="dead");    
                                break;
                                
                              
                         case "allie":
                             //His action will change to help, but in the next circustances                         
                             if (npc.getCurrentHealth()<npc.getMaxHealth()){
                                 do{
                                     Nperson.setAction("help");
                                    hero.setCurrentHealth(npc.getCurrentHealth()+Nperson.getHelp());
                                    //if the hero has his current healt at top, npc will change his state.
                                    if  (npc.getCurrentHealth()==npc.getMaxHealth()){
                                    Nperson.setAction("neutral");                                 
                                    }else {}}
                                 while (Nperson.getState()!="neutral");
                             }
                                 break; 
                                
                        
                        }
                        break;
         
           }
         
    }
    
    private void HeroToNpc (Item Herow, NPC nPc){
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
             //we use the same in case of principal weapon,  
            case "Weapon":
                int HeroDamage=Herow.getDamage(); 
                
                int npcDefense= nPc.getDefense(); 
                
                int totalDamage= HeroDamage/npcDefense;
                nPc.setCurrentHealth(nPc.getCurrentHealth()-totalDamage);
                
                break; 
                
                
        
        }

    
    }
    
    private void NpcToHero (NPC Nperson){
        int damageN= Nperson.getMeleeDamage(); 
            int herod= hero.getDefense();
            int totalDamageh=damageN/herod;
            switch (Nperson.getSide()){
                
                 case "enemy":
                             // first we put on a bucle to have a range of time to NPC´s Attacks
                             //Using delays method
                             do{
                                Nperson.setAction("attack");
                                hero.setMaxHealth(hero.getCurrentHealth()-totalDamageh);
                                //The Npc wait 1.5 secnods to do the toher attack
                                delaySegundoYMedio();
                                //Now we check the state of the hero, if his current health is 0 or less than 0, 
                                //he will die
                                if (hero.getCurrentHealth()<=0){
                                    hero.setState("dead");
                                }else{} }
                             while(hero.getState()!="dead");
                             //if the state of hero is dead, bucle will stop
                             
                                break;
                case "allie":
                             //His action will change to help, but in the next circustances                         
                             if (hero.getCurrentHealth()<hero.getMaxHealth()){
                                 do{
                                     Nperson.setAction("help");
                                    hero.setCurrentHealth(hero.getCurrentHealth()+Nperson.getHelp());
                                    //if the hero has his current healt at top, npc will change his state.
                                    if  (hero.getCurrentHealth()==hero.getMaxHealth()){
                                    Nperson.setAction("neutral");                                 
                                    }else {}}
                                 while (Nperson.getState()!="neutral");
                             }
                                 break; 
                             
                             
                     
                     
                     
               
            }
  //In this part we think to put a range activator, this will gonna funtion 
  //as the indicator when de Npc has to attack
    
    
    }
    
    private static void delaySegundoYMedio(){
        try{
            Thread.sleep(1500);
        
        }catch(InterruptedException e){}
   
    
    }


    
 }
    
    
    

