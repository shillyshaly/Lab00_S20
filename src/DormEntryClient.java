import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author atb
 * @version 12/26/2019
 */
public class DormEntryClient {
    public static void main(String[] args) {
        File file = null;
        try {
            file = new File("residents.txt");
            Dorm dorm = new Dorm(new Scanner(file));

            dorm.displayResidentNames();

            System.out.println("\n*** Processing entry requests ***");

            String name;
            String room;
            String password;
            Scanner keyboard = new Scanner(System.in);
            // user wants to enter the dorm
            do {
                System.out.println("\nEnter your name:");
                name = keyboard.nextLine();
                Resident resident = dorm.checkResident(name);
                if (resident != null) {
                    System.out.println("Hello " + resident.getName() + ", please enter your room number:");
                    room = keyboard.nextLine();
                    System.out.println("Enter password:");
                    password = keyboard.nextLine();
                    if (dorm.validateAndUnlock(name, room, password)) {
                        dorm.lockTheDoor();
                    }
                }
                else {
                    System.out.println(name + " is not a registered resident of this dorm");
                }
                System.out.println("\nIs there another resident to enter the dorm? (yes/no)");
            } while (keyboard.nextLine().equalsIgnoreCase("yes"));
        } catch (IOException e) {
            System.out.print("Cannot read " + file.getName() + " file.");
        } catch (Exception e) {
            String msg = e.getMessage();
            if (msg == null || msg.length() == 0)
                msg = "Incorrect format of " + file.getName() + " file.";
            System.out.print(msg);
        }
    }
}
