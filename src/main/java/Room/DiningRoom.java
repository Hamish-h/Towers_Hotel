package Room;

import enums.DiningType;

public class DiningRoom extends Room{

    private String name;
    private DiningType type;

    public DiningRoom(String name, DiningType type){
        super(type.getCapacity());
        this.name = name;
        this.type = type;
    }

    public DiningType getDiningRoomType(){
        return this.type;
    }

    public String getName() {
        return name;
    }

    public int getCapacity(){
        return this.type.getCapacity();
    }

}
