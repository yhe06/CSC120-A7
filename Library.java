import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building implements LibraryRequirements{

  // Attributes
  private Hashtable<String, Boolean> collection;

  // Constructor
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<>();
    System.out.println("You have built a library: 📖");
  }

  // Methods

  /**
   * Puts a string as a key with value true in collection Hashtable.
   * 
   * @param title
   */
  public void addTitle(String title){
    if (!this.collection.containsKey(title)){
      this.collection.put(title, true);
    } else {
      throw new RuntimeException("This library also owns this title.");
    }
  }

  /**
   * Removes string from collection Hashtable.
   * 
   * @param title
   * @return title The name of the object removed
   */
  public String removeTitle(String title){
    if (this.collection.containsKey(title)){
      // the true part makes sure that the title is not checked out
      this.collection.remove(title, true);
      return title;
    } else {
      throw new RuntimeException("The library does not own this title or it is currently checked out");
    }
  }

  /**
   * Replaces the value of the key wanted to false.
   * 
   * @param title
   */
  public void checkOut(String title){
    if (this.isAvailable(title)){
      this.collection.replace(title, false);
    } else {
      throw new RuntimeException("You cannot check out this title");
    }
    
  }

  /**
   * Replaces the value of the key wanted to true.
   * @param title
   * 
   */
  public void returnBook(String title){
    if (this.containsTitle(title)){
      this.collection.replace(title, true);
    } else {
      throw new RuntimeException("This title is not in our system.");
    }
  }

  /** 
   * Returns a boolean depending on whether or not the collection Hashtable contains key.
   * @param title
   * @return true or false depending on if library contains title.
   */
  public boolean containsTitle(String title){
    return this.collection.containsKey(title);
  }

  /** 
   * Returns a boolean depending on whether a title is available to check out.
   * @param title
   * @return true or false depending on if title is available.
   */
  public boolean isAvailable(String title){
    return this.collection.get(title).equals(true);

  }
  
  /**
   * Prints out the title of all the titles in the library and its availability.
   */
  public void printCollection(){
    System.out.println(this.getName() + " Collection:");
    this.collection.forEach(
            (title, value) -> {System.out.println("--------------------");
            if (value == true){
              System.out.println("Title: " + title + ", Availability: " + "Available");
            } else {
              System.out.println("Title: " + title + ", Availability: " + "Unavailable");
            }
  });
    }


  public static void main(String[] args) {
    Library neilson = new Library("Neilson Library", "100 Elm St", 3);

    neilson.addTitle("The Price of Salt");
    neilson.addTitle("The Lilac People");

    neilson.checkOut("The Price of Salt");
    System.out.println(neilson.isAvailable("The Price of Salt"));

    


  }
  
  }