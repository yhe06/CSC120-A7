/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building implements HouseRequirements{

  // Attributes
  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  // Constructor
  public House(String name, String address, int nFloors, boolean hasDiningRoom){
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");

  }

  /**
   * Accessor to retrieve the boolean value for if the House has a dining room
   * 
   * @return hasDiningRoom true or false
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
  /**
   * Accessor for number of residents inside the House.
   * 
   * @return number of residents
   */
  public int nResidents(){
    return this.residents.size();
  }

  /**
   * Adds a Student object into the resident ArrayList
   * 
   * @param s
   */
  public void moveIn(Student s){
    if (!this.residents.contains(s)) {
      this.residents.add(s);
    } else {
      throw new RuntimeException("This student is already a resident here.");
    }
  }
  /**
   * Removes Student object from resident ArrayList if Student is in ArrayList
   * 
   * @param s
   * @return s Student object removed
   */
  public Student moveOut(Student s){
    if (this.residents.contains(s)){
      this.residents.remove(s);
    } else {
      throw new RuntimeException("This student is not a resident of this house.");
    } 
    return s;

  }
  
  /**
   * Returns a boolean of whether or not Student object is in the resident ArrayList.
   * 
   * @param s
   * @return true or false 
   */
  public boolean isResident(Student s){
    if (this.residents.contains(s)){
      return true;
    } else {
      return false;
    }
  }


  public static void main(String[] args) {
    House morrow = new House("Morrow House", "1 Mandelle Rd", 4, false);
  }

}