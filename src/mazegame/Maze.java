package mazegame;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Maze {
    private final ArrayList<Compartment> compartment = new ArrayList<>();

    public Maze() {
    }
    
    public void addCompartment(Compartment compartment){
        this.compartment.add(compartment);
    }
    
    
}
