/* CoE 2SI4 - Assignment 2 */

public class Clothing extends Item
{
  protected int size;
  protected String color="";

  public Clothing(int productCode, double price, int taxRate,String description, int numberOnHand, int numInOrder, int minOnHand,int size,String color)
  {
      super(productCode,price,taxRate,description,numberOnHand,numInOrder,minOnHand);
      this.size=size;
      this.color=color;
  }
}
  