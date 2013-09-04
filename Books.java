/* CoE 2SI4 - Assignment 2 */

public class Books extends Item
{
    protected String title;
    protected String author;
    protected int pages;
    
    public Books(int productCode,double price, double taxRate, String description, int numberonHand, int numInOrder, int minOnHand, String title,String author,int pages)
    {
        super(productCode,price,taxRate,description,numberOnHand,numInOrder,minOnHand);
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
}
