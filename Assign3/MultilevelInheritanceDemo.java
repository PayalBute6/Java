// Continent -> Country -> State
class Continent {
    String continentName;
    Continent(String cName) { this.continentName = cName; }
    void displayContinent() { System.out.println("Continent: " + continentName); }
}

class Country extends Continent {
    String countryName;
    Country(String cName, String coName) { super(cName); this.countryName = coName; }
    void displayCountry() { System.out.println("Country: " + countryName); }
}

class State extends Country {
    String stateName;
    String placeName;
    State(String cName, String coName, String sName, String pName) {
        super(cName, coName);
        this.stateName = sName;
        this.placeName = pName;
    }
    void displayPlace() {
        System.out.println("Place: " + placeName);
        System.out.println("State: " + stateName);
        displayCountry();
        displayContinent();
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        State myPlace = new State("Asia", "India", "Maharashtra", "Mumbai");
        myPlace.displayPlace();
    }
}
