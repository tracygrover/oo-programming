/* CoE 2SI4 - Assignment 2 */

public class Transaction
{
   protected int time;
   protected int productCode;
   protected int quantity;

   public Transaction(int time, int productCode,int quantity)
   {
        this.time=time;
        this.productCode=productCode;
        this.quantity=quantity;
   }
}
