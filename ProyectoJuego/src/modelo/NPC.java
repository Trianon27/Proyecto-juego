/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author srodr
 */
public class NPC extends Hero {
    
   
    private String side; 
    private String profession; 
    private int help;   
    

    public NPC() {
       
       side = "Ally";
       profession = "Farmer"; 
       help=100; 
    }

    public NPC( String side, String profession, int help) {
       
        this.side = side;
        this.profession = profession;
        this.help=help;
    }

    public String getSide() {
        return side;
    }

    public String getProfession() {
        return profession;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getHelp() {
        return help;
    }

    public void setHelp(int help) {
        this.help = help;
    }
   
    
}