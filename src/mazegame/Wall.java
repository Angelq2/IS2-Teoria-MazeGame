package mazegame;

/**
 *
 * @author angel
 */
public class Wall extends Compartment{
    
    private final Compartment compartment1,compartment2; //divide una habitacion de otra

    public Wall(Compartment compartment1, Compartment compartment2) {
        this.compartment1 = compartment1;
        this.compartment2 = compartment2;
    }
    
    
}
