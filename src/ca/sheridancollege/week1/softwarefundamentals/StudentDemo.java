/*
 * March 2, 2019
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A model class to model Student Objects
 * @author dancye, 2019
 */
public class StudentDemo 
{
  private String studentID;
  private String name;
  
  /**
   * A constructor to pass in the given ID and then name
   * @param id - the ID to assign
   * @param name- the name to assign 
   */
  public StudentDemo(String id, String n)
  {
      studentID = id;
      name = n;
  }
  
  /**
   * A method to set the student ID
   * @param id the ID to set
   */
  public void setStudentID(String id)
  {
      studentID=id;
  }
  /**
   * An accessor method for studentID
   * @return the student's ID 
   */
  public String getStudentID()
  {
      return studentID;
  }

    /**
     * A method to return the student's name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * A method to set the student's name
     * @param givenName the name to set
     */
    public void setName(String n) {
        name = n;
    }
    
}
