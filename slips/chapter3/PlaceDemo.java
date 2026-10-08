// Level 1
class Continent {
    String continentName;

    public Continent(String name) {
        continentName = name;
    }
}

// Level 2
class Country extends Continent {
    String countryName;

    public Country(String continent, String country) {
        super(continent); 
        countryName = country;
    }
}

// Level 3
class State extends Country {
    String stateName;

    public State(String continent, String country, String state) {
        super(continent, country);
        stateName = state;
    }
}

// Level 4
class Place extends State {
    String placeName;

    public Place(String continent, String country, String state, String place) {
        super(continent, country, state);
        placeName = place;
    }

    public void displayLocation() {
        System.out.println("Continent: " + continentName);
        System.out.println("Country: " + countryName);
        System.out.println("State: " + stateName);
        System.out.println("Place: " + placeName);
    }
}

public class PlaceDemo {
    public static void main(String[] args) {
        Place myPlace = new Place("Asia", "India", "Maharashtra", "Pune");
        myPlace.displayLocation();
    }
}
