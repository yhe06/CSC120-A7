public class Building implements BuildingRequirements {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    //Constructor
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Returns the name of the building.
     * @return name of building
     */
    public String getName() {
        return this.name;
    }

    /**
     * returns address of the building
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * returns the number of floors in the building
     * @return number of floors as
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Returns building name, nFloors, and address in a sentence when building is called.
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
