/*Gerik Swenson
 *CSE360
 * 10/5/20
 */
package cse360assignment02;

public class AddingMachine 
{
  private int total;
  private String stng;
  
  public AddingMachine () 
  {
    total = 0;  // not needed - included for clarity
    stng = "0 ";
  }
  
  public int getTotal () 
  {
    return total;
  }
  /*This method adds to total
   * @param value is the value added
   */
  public void add (int value) 
  {
	  total = total + value;
	  stng += "+ " + value + " ";
  }
  
  /*This method subtracts from total
   * @param value is the value subtracted
   */
  public void subtract (int value)
  {
	  total = total - value;
	  stng += "- " + value + " ";
  }

  public String toString () 
  {
    return stng;
  }

  public void clear() 
  {
	  total = 0;
	  stng = "0 ";
  }
}