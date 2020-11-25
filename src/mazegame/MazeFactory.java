package mazegame;

/**
 *
 * @author angel
 */
public class MazeFactory {  // Abstract Factory

    public MazeFactory() {
    }
    
    public Maze makeMaze(){
        return new Maze();
    }
    
    public Compartment makeCompartment(){
        return new Compartment();
    }
    
    public Room makeRoom(int roomNumber){
        return new Room(roomNumber);
    }
    
    public Wall makeWall(Compartment compartment1, Compartment compartment2){
        return new Wall(compartment1, compartment2);
    }
    
    public Door makeDoor(DOOR_STATUS status, Compartment compartment1,Compartment compartment2){
        return new Door(status,compartment1,compartment2);
    }
    
}
