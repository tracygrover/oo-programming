/* CoE 2SI4 - Assignment 2 */

public class Item 
{
    private int productCode=0;
    private double price=0.0;
    private double taxRate=0.0;
    private String description=0;
    private int numberOnHand=0;
    private int numInOrder=0;
    private int minOnHand=0;
    private int time=0;
    private String description="";
    
    public Item (int productCode, double price, double taxRate, String description, int numberOnHand, int numInOrder, int minOnHand)
    {
        this.productCode=productCode;
        this.price=price;
        this.description=description;
        this.taxRate=taxRate;
        this.minOnHand=minOnHand;
        this.numberOnHand=numberOnHand;
        this.numInOrder=numInOrder;
    }
    public double computeTax()
    {
       return (this.taxRate*this.price);
    }
    
    public String toString()
    {
        return ("The item is :"+ this.description+ "and its product code is :"+this.productCode);
    }
    
    public int findNum()
    {
        return (this.numberOnHand-this.minOnHand);
    }
}
