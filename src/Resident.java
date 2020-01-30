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
        //TODO - DONE
        setName(name);
        setRoom(room);
        setPassword(password);
    }

    /**
     * accessor method
     *
     * @return the value of name
     */
    public String getName() {
        //TODO - DONE
        return this.name;
    }

    /**
     * mutator method  - sets the name to the new value
     *
     * @param name
     */
    public void setName(String name) {
        //TODO - DONE
        this.name = name;
    }

    /**
     * accesor method
     *
     * @return the value of room
     */
    public String getRoom() {
        //TODO - DONE
        return this.room;
    }

    /**
     * mutator method  - sets the room to the new value
     *
     * @param room
     */
    public void setRoom(String room) {
        //TODO - DONE
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
        //TODO - DONE
        if (password.length() >= MIN_PASSWORD_LENGTH) {
            this.password = password;
        }
    }

    /**
     * toString() method
     *
     * @return the String object containing the resident information
     */
    public String toString() {
        //TODO - DONE
        return "name: " + name + " room: " + room + " password: " + password;
    }
}