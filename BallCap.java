/* CoE 2SI4 - Assignment 2 */

public class BallCap extends Clothing
{
    protected String material="";
    protected String logo="";
    
    public BallCap(int size, String color,String material, String logo)
    {
       super(size,color);
       this.material=material;
       this.logo=logo;

       this.taxRate=0.07;
    }

}
