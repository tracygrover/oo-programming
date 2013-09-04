/* CoE 2SI4 - Assignment 2 */

public class Tshirt extends Clothing
{
    protected int proportion;
    protected boolean neck;
    protected String logo="";

    public Tshirt(int size, int color,int proportion,boolean neck,String logo)
    {
        super(size,color);
        this.proportion=proportion;
        this.neck=neck;
        this.logo=logo;
         
        this.taxRate=0.06;
    }
}  