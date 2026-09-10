import java.util.Scanner;

/**
 * Multilevel inheritance demo using Scanner for input.
 * Classes: Continent -> Country -> State -> Place.
 * The program reads continent, country, state and place from the user
 * and displays them.
 */
public class MultiLevelDemo {

    class Continent {
        String continent;
    }

    class Country extends Continent {
        String country;
    }

    class State extends Country {
        String state;
    }

    class Place extends State {
        String place;
        void display() {
            System.out.println("Place: " + place);
            System.out.println("State: " + state);
            System.out.println("Country: " + country);
            System.out.println("Continent: " + continent);
        }
    }

    public static void main(String[] args) {
        MultiLevelDemo demo = new MultiLevelDemo();
        Scanner sc = new Scanner(System.in);
        Place p = demo.new Place();
        System.out.print("Enter continent: ");
        p.continent = sc.nextLine();
        System.out.print("Enter country: ");
        p.country = sc.nextLine();
        System.out.print("Enter state: ");
        p.state = sc.nextLine();
        System.out.print("Enter place: ");
        p.place = sc.nextLine();
        System.out.println("\n--- Location Information ---");
        p.display();
        sc.close();
    }
}
