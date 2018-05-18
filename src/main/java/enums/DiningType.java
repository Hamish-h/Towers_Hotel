package enums;

public enum DiningType {

    BREAKFASTBAR(25),
    RESTAURANT(50);

    private final int capacity;

    DiningType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

}

