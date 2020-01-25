/**
 * @author Jamie Hernandez
 * @version 12/26/2019
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Dorm {
    private ArrayList<Resident> residents;
    private Door door;

    /**
     * the constructor creates the door object and the residents object.
     * Reads from the file with the Scanner passed to the constructor and fills
     * the residents list with resident object based on the data retrieved from the file.
     * Must handle invalid data by catching IllegalArgumentException and  NoSuchElementException
     *
     * @param fromFile - the Scanner object that is associated with the text file
     *                 containing the residents data. The Scanner object is created
     *                 by the client
     */
    public Dorm(Scanner fromFile) {
        //TODO - in progress(come back)
        door = new Door();
        residents = new ArrayList<>();

        try {
            while(fromFile.hasNext()){
                residents.add(new Resident(fromFile.next(),fromFile.next(), fromFile.next()));
            }
        }catch (IllegalArgumentException e){
        System.out.println("illegal argument: " + e.getMessage());
        }catch (NoSuchElementException e){
        System.out.println("no such element: " + e.getMessage());
        }
    }

    /**
     * Checks if there is a resident of the given name in the list of residents.
     *
     * @param name
     * @return the Resident object or null if not found
     */
    public Resident checkResident(String name) {
        //TODO - in progress(come back)
        if (residents.contains(name)){
            return null;
        }else{
            return null;
        }
    }

    /**
     * prints the number of residents in the dorm followed by all the names of the residents,
     * uses for-each loop
     */
    public void displayResidentNames() {
        //TODO

    }

    /**
     * validates if the resident can enter the dorm
     * unlocks the door only if the valid credentials were entered
     * prints the current status of the door
     *
     * @param name
     * @param room
     * @param password
     * @return true  - the door was unlocked if the user entered the correct room number and
     * the password for the given name
     * false - the door was not unlocked because either the name was not valid or invalid
     * credentials were entered
     */
    public boolean validateAndUnlock(String name, String room, String password) {
        //TODO
        return false; // THIS IS A STUB
    }

    /**
     * asks the door object to lock itself
     */
    public void lockTheDoor() {
        //TODO

    }
}
