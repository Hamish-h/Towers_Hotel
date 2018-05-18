package enums;

public enum ConferenceType {

    LARGE(100),
    SMALL(50);

    private final int capacity;

    ConferenceType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

}
