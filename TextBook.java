/* CoE 2SI4 - Assignment 2 */

public class TextBook extends Books
{
  protected int edition;
  protected String faculty="";
  protected String course;
  protected String supplementary="";
   
  
  public TextBooks(int productCode, double price, int taxRate, String description, int numberOnHand, int NumInOrder, int minOnHand, String title, String author, int pages, int edition,String faculty, String course, String supp)
  {
      super(title,author,pages);
      this.taxRate=0.15;
      this.edition=edition;
      this.faculty=faculty;
      this.course=course;
      this.supplemeentary=supplementary;
  }
}