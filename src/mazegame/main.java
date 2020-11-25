package mazegame;

/**
 *
 * @author angel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    /*
    private static createMaze(){
            
    Maze maze = new Maze();
    
    Compartment outSideWorld = new Compartment();
    
    Room room23 = new Room(23);
    
    room23.setBorder(DIRECCTION.NORTH, new Wall(room23,outSideWorld));
    room23.setBorder(DIRECCTION.WEST, new Wall(room23,outSideWorld));
    room23.setBorder(DIRECCTION.SOUTH, new Wall(room23,outSideWorld));
    
    Room room25 = new Room(25);
    room25.setBorder(DIRECCTION.NORTH, new Wall(room23,outSideWorld));
    room25.setBorder(DIRECCTION.SOUTH, new Wall(room23,outSideWorld));
    room25.setBorder(DIRECCTION.EAST, new Wall(room23,outSideWorld));
    
    Door door = new Door(DOOR_STATUS.OPEN, room23,room25);
    
    room23.setBorder(DIRECCTION.EAST, door);
    room25.setBorder(DIRECCTION.WEST, door);
    
    maze.addCompartment(door);
    
    maze.addCompartment(room23);
    maze.addCompartment(room25);
    
    return maze;
    
    }

*/
    
    private static Maze createMaze(MazeFactory mazeFactory){
            Maze maze = new Maze();
    
    Compartment outSideWorld = mazeFactory.makeCompartment();
    
    Room room23 = mazeFactory.makeRoom(23);
    
    room23.setBorder(DIRECCTION.NORTH, new Wall(room23,outSideWorld));
    room23.setBorder(DIRECCTION.WEST, new Wall(room23,outSideWorld));
    room23.setBorder(DIRECCTION.SOUTH, new Wall(room23,outSideWorld));
    
    
    Room room25 = mazeFactory.makeRoom(25); //lo declaramos con el abtract factory
    //Room room25 = new Room(25);       //declaracion si abstrac factory
    
    room25.setBorder(DIRECCTION.NORTH, new Wall(room23,outSideWorld));
    room25.setBorder(DIRECCTION.SOUTH, new Wall(room23,outSideWorld));
    room25.setBorder(DIRECCTION.EAST, new Wall(room23,outSideWorld));
    
    Door door = mazeFactory.makeDoor(DOOR_STATUS.OPEN, room23, room25);
    //Door door = new Door(DOOR_STATUS.OPEN, room23,room25);
    
    room23.setBorder(DIRECCTION.EAST, door);
    room25.setBorder(DIRECCTION.WEST, door);
    
    maze.addCompartment(door);
    
    maze.addCompartment(room23);
    maze.addCompartment(room25);
    
    return maze;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //Maze maze = createMaze();
        
        MazeFactory mazeFactory = new MazeFactory();
        Maze maze = createMaze(mazeFactory);
        
        HauntedMazeFactory hauntedMazeFactory = new HauntedMazeFactory();
        Maze maze2 = createMaze(hauntedMazeFactory);
    }

    
    
}
