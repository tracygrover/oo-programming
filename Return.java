/* CoE 2SI4 - Assignment 2 */

public class Return extends Transaction
{
    public Return(int productCode,int quantity)      
    {
        this.cocode=productCode;
        this.quantity=quantity;
    }
   
    public String toString(String str,double price,int productCode)
    {
       String productdesc="Item: "+str+"\nPrice: "+price+"\nProduct Code: "+productCode;
       return productdesc;
    }
}
