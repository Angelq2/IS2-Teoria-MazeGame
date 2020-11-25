package mazegame;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author angel
 */
public class Compartment {
    
    private final Map<DIRECCTION, Compartment> border = new HashMap<>();
    
    public Compartment(){
        
    }
    
    public void setBorder(DIRECCTION direction, Compartment compartment){
        this.border.put(direction,compartment);
    }
    
    public Compartment getBordwer(DIRECCTION direction){
        return this.border.get(direction);
    }
}
