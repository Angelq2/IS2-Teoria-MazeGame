/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

/**
 *
 * @author angel
 */
public class Door extends Compartment{
    
    private final Compartment compartment1, compartment2;
    private DOOR_STATUS status;
    
    public Door(DOOR_STATUS status, Compartment compartment1,Compartment compartment2){
        this.compartment1 = compartment1;
        this.compartment2 = compartment2;
        this.status = status;
    }
    
    public Compartment atOtherSide(Compartment compartment){
        return compartment == compartment1 ? compartment2: (compartment2 == compartment? compartment1: null);
    }
    
    public DOOR_STATUS getStatus(){
        return this.status;
    }
    
    public void setStatus(DOOR_STATUS status){
        this.status = status;
    }
           
}
