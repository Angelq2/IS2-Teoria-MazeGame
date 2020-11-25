package mazegame;

/**
 *
 * @author angel
 */
public class HauntedMazeFactory extends MazeFactory{ //Factory Method

    public HauntedMazeFactory() {
    }
    
    public Room makeRoom(int roomNumber){
        return new HauntedRoom(roomNumber, new Spell());
    }
    
}
