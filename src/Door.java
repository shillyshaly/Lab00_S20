/**
 * @author Jamie Hernandez
 * @version 12/26/2019
 */
public class Door {
    private final boolean UNLOCKED = true;
    private final boolean LOCKED = false;
    private boolean open;

    /**
     * default constructor, sets this.open to indicate the locked door
     */
    public Door() {
        //TODO - done
        this.open = LOCKED;
    }

    /**
     * accessor method
     *
     * @return the current value of this.open
     */
    public boolean isOpen() {
        //TODO - done
        return open;
    }

    /**
     * mutator method
     * sets the instance variable this.open to indicate the unlocked door
     */
    public void unlock() {
        //TODO - done
        this.open = UNLOCKED;
    }

    /**
     * mutator method
     * sets the instance variable this.open to indicate the locked door
     */
    public void lock() {
        //TODO - done
        this.open = LOCKED;
    }

    /**
     * toString method
     *
     * @return the String object containing the information if the door is locked or unlocked
     */
    public String toString() {
        //TODO - in progress
        return ("toString???"); // THIS IS A STUB
    }
}