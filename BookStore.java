/* CoE 2SI4 - Assignment 2 */

public class BookStore extends Exception
{
   protected Item array[]=new Item[100];
   protected int time=0;
   protected double fundsOnHand;
   protected double taxCollected;

   public Bookstore(String filename)
   {
       String name,line=;
       name=filename;
  
  
       StringBuffer temp=new StringBuffer();

       try

       {

             BufferedReader in = new BufferedReader(new FileReader(name))


             while((line=in.readLine())!=null)

             {
           
                  StringTokenizer st = new StringTokenizer(line);
                  String token1,token2;
                
                  token1=st;
                  token2=nextToken(st);

                  if(st.compareTo("Textbook")==0)
                  {
                         String temp="Textbook";                              
                         int productCode=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         double price=Double.parseDouble(token2);
                         token2=nextToken(token2);
                         double taxRate=Int.parseInt(token2)/100;
                         token2=nextToken(token2);
                         int numOnHand=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         int numInOrder=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         int minOnHand=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         String description="Textbook";
                         String title=token2;
                         token2=nextToken(token2);
                         String author=token2;
                         token2=nextToken(token2);
                         int pages=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         int edition=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         String faculty=token2;
                         token2=nextToken(token2);
                         String course=token2;
                         token2=nextToken(token2);
                         String supp=token2;
                         token2=nextToken(token2);
                         
                   }

                  if(st.compareTo("Magazines")==0)
                  {                                                                    
                         String temp="Magazines";
                         int productCode=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         double price=Double.parseDouble(token2);
                         token2=nextToken(token2);
                         double taxRate=Int.parseInt(token2)/100;
                         token2=nextToken(token2);
                         int numOnHand=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         int numInOrder=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         int minOnHand=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         String description="Magazines";
                         int issueno=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         int volno=Integer.parseInt(token2);
                         token2=nextToken(token2);
                        
                   }

                  if(st.compareTo("Tshirt")==0)
                  {
                         String temp="Tshirt";
                         int productCode=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         double price=Double.parseDouble(token2);
                         token2=nextToken(token2);
                         double taxRate=Int.parseInt(token2)/100;
                         token2=nextToken(token2);
                         int numOnHand=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         int numInOrder=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         int minOnHand=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         String description="Tshirt";
                         int size=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         String color=token2;
                         double proportion=Double.parseDouble(token2);
                         token2=nextToken(token2);
                         boolean type;
                         if(token2=="true")
                             type=true;
                         else
                             type=false;

                         token2=nextToken(token2);
                         String logo=token2;
                         
                  }

                  if(st.compareTo("BallCap")==0)
                  {
                       
                         String temp="BallCap";
                         int productCode=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         double price=Double.parseDouble(token2);
                         token2=nextToken(token2);
                         double taxRate=Int.parseInt(token2)/100;
                         token2=nextToken(token2);
                         int numOnHand=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         int numInOrder=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         int minOnHand=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         String description="Tshirt";
                         int size=Integer.parseInt(token2);
                         token2=nextToken(token2);
                         String color=token2;
                         token2=nexttoken(token2);
                         String material=token2;
                         token2=nextToken(token2);
                         String logo=token2;
                  }

                  
                  if(temp.compareTo("Textbook")==0)
                    array[i++]=new 



                 









            }
        }catch(Exception e)
         { 
              System.out.println("\n Error occured!");
         }
   }

   
// correction needed

public void processTransaction(Transaction transec){
     try{
           if(transec instanceof Purchase){

                  int code=transec.productCode;
                  int quan=transec.minOnHand;
                 
                  
           } 
            
        }
        /*if(transec instanceof Purchase)
        {
            int r =transec.cocode.getnumberOnHand();
            r-=transec.quantity;
            transec.cocode.setnumberOnHand(r);
            fundsOnHand+=transec.cocode.getPrice()*transec.quantity;
            taxCollected+=transec.cocode.getPrice()*transec.cocode.computeTax()*transec.quantity;
        }
        if(transec instanceof Return)
        {
            int r=((Return)transec).purch.cocode.getnumberOnHand();
            ((Return)transec).purch.cocode.setnumberOnHand(r);
            fundsOnHand-=((Return)transec).purch.cocode.getPrice()*((Return)transec).quantity;
            taxCollected-=((Return)transec).purch.cocode.getPrice()*((Return)transec).purch.cocode.computeTax()*transec.quantity;
        }
        time++;
    }*/
    public void orderItems(Item it){
        double pri=it.getnumInOrder()*it.getPrice();
        if(fundsOnHand>pri){
            fundsOnHand=fundsOnHand-pri;
        }
        else{
            System.out.println("Could not order due to lack of funds.");
        }
    }
    public int checkStock(Item it){
        return (it.getnumberOnHand());
    }
    public void inventory(){
        Item it=new Item();
        System.out.println("\nNumber On Hand:"+it.getnumberOnHand()+"\nNumber in Order:"+it.getnumInOrder()+"\nTotal transactions:"+this.counter1+"\nFunds On Hand:"+this.fundsOnHand+"\nTotal tax collected:"+this.taxCollected);
    }























   public void processTransaction(Transaction obj) throws
   {
            
        /*    try
              {
                    if(time<0)
              }catch(TimeException e)
              { System.out.println("\n Invalid Time");}
              catch(LackofFundsException e)
              {System.out.println("\n Sorry, the transaction cannot be processed due to lack of funds");}
              catch(InventoryException e)
              { System.out.println("\n There is no stock left");}
 
                  
          */


                check the type of the object. if the object is of type book, then process either for the purchase or return of the book asking for the course namr and the name of the book.
              
                