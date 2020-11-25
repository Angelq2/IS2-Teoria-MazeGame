package mazegame;

/**
 *
 * @author angel
 */
public class HauntedRoom extends Room{  
    Spell spell;

    public HauntedRoom(int roomNumber,Spell spell) {
        super(roomNumber);
        this.spell = spell;
    }
    
}
