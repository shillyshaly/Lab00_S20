/**
 * @author Jamie Hernandez
 * @version 12/26/2019
 */
public class Resident {
    private final int MIN_PASSWORD_LENGTH = 3;
    private String name;
    private String room;
    private String password;

    /**
     * the constructor  - calls the mutator methods
     *
     * @param name
     * @param room
     * @param password
     */
    public Resident(String name, String room, String password) {
        //TODO - done
        this.name = name;
        this.room = room;
        this.password = password;
    }

    /**
     * accessor method
     *
     * @return the value of name
     */
    public String getName() {
        //TODO - done
        return this.name; // THIS IS A STUB
    }

    /**
     * mutator method  - sets the name to the new value
     *
     * @param name
     */
    public void setName(String name) {
        //TODO - done
        this.name = name;
    }

    /**
     * accesor method
     *
     * @return the value of room
     */
    public String getRoom() {
        //TODO - done
        return room; // THIS IS A STUB
    }

    /**
     * mutator method  - sets the room to the new value
     *
     * @param room
     */
    public void setRoom(String room) {
        //TODO - done
        this.room = room;
    }

    /**
     * accesor method
     *
     * @return the value of room
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * mutator method - sets the password to the new value if it has at least three characters
     * throws IllegalArgumentException otherwise
     *
     * @param password
     * @throws IllegalArgumentException
     */
    public void setPassword(String password) throws IllegalArgumentException {
        //TODO - done
        if (password.length() >= MIN_PASSWORD_LENGTH){
            this.password = password;
        }
    }

    /**
     * toString() method
     *
     * @return the String object containing the resident information
     */
    public String toString() {
        //TODO - done
        return this.password +" "+ this.room +" "+ this.room; // THIS IS A STUB
    }
}