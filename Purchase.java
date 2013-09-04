/* CoE 2SI4 - Assignment 2 */

public class Purchase extends Transaction
{
    public Purchase(int productCode,int quantity)
    {
        this.productCode=productCode;
        this.quantity=quantity;
        time++;
    }
   
    public String toString(String str,double price,int productCode)
    {
       String productdesc="Item: "+str+"\nPrice: "+price+"\nProduct Code: "+productCode;
       return productdesc;
   }
}
