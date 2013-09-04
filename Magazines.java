/* CoE 2SI4 - Assignment 2 */

public class Magazines extends Books
{
    protected int issueno;
    protected int volume;
    
    public Magazines(int productCode, double price, int taxRate, String description, int numberOnHand, int numInOrder, int minOnHand,String title, String author, int pages, int issueno, int volume)
    {
        super(title,author,pages);
        this.taxRate=0.1;
    }
}
