import java.util.Scanner;
public class BankApp
{
  private String name;
  private String names;
  private String PINnum;
  public CreditCard card;
  Scanner scan =  new Scanner(System.in);

  public void start()
  {
    System.out.print("Please enter your name: ");
    String name = scan.nextLine();
    System.out.print("Please create your PIN: ");
    String PIN = scan.nextLine();
    CreditCard swipe = new CreditCard(name, PIN);
    Bank money = new Bank();
    BagelShop donut = new BagelShop(name + "'s Bagel Shop", 1000, 2, money);
    System.out.println("Enter any number to continue");
    int selection  = scan.nextInt();
    while (selection != 7) 
    {
      System.out.println("\nPlease select what you would like to do:\n---------------");
      System.out.println("1. Make a purchase or return at the bagel shop\n2. Make a payment on the credit card\n3. Open a second credit card\n4. Compare credit card balances\n5. Deposit bagel shop profits into the bank\n6. Check bagel shop inventory\n7. Quit");
      selection =  scan.nextInt();

      if (selection==1)
      {
        System.out.print("Would you like to make a purchase(1) or a return(2)?");
        int response = scan.nextInt();
        if(response==1)
        {
          System.out.println("How many bagels would you like to buy?");
          int bagels = scan.nextInt();
          System.out.println("Which card would you like to swipe? 1 or 2?");
          int cards = scan.nextInt();
          if(cards==1)
          {
            boolean purchase = donut.payForBagels(swipe, bagels, PIN);
            if(purchase = true)
            {
              System.out.println("Transaction successful!");
              System.out.println(swipe);
              System.out.println(donut);
            }
          }
          else if(cards==2)
          {
            boolean pay = donut.payForBagels(card, bagels, names);
            if(pay = true)
            {
              System.out.println("Transaction successful!");
              System.out.println(card);
              System.out.println(donut);
            }
          }
          else
          {
            System.out.println("There was an error with your purchase.");
          }
        }
        else if(response==2)
        {
          System.out.println("How many bagels would you like to return?");
          int returnBagels = scan.nextInt();
          System.out.println("Which card would you like to return to? 1 or 2?");
          int returnNum = scan.nextInt();
          if (returnNum==1)
          {
            boolean refund = donut.returnBagels(swipe, returnBagels, PIN);
            if(refund = true)
            {
              System.out.println("Transaction successful!");
              System.out.println(swipe);
              System.out.println(donut); 
            }
          }
          else if(returnNum==2)
          {
            boolean refund = donut.returnBagels(card, returnBagels, names);
            if(refund = true)
            {
              System.out.println("Transaction successful!");
              System.out.println(card);
              System.out.println(donut); 
            }
          }
          else
          {
            System.out.println("There was an error with your refund.");
          }
        }
      }
      else if (selection==2)
      {
        System.out.println("Which card would you like to pay off? 1 or 2?");
        int carddd = scan.nextInt();
        if(carddd==1)
        {
          System.out.println("How much would you like to pay off?");
          int payOff = scan.nextInt();
          money.makePayment(swipe, payOff);
          System.out.println(money);
        }
        else if(carddd==2)
        {
          System.out.println("How much would you like to pay off?");
          int payOff = scan.nextInt();
          money.makePayment(card, payOff);
          System.out.println(money);
        }
      }
      else if (selection==3)
      {
        System.out.print(" ");
        String names = scan.nextLine();
        System.out.println("What is the PIN for your new card?");
        String PINnum = scan.nextLine();
        this.PINnum=PINnum;
        //this.names=name + "'s Second Card";
        card = new CreditCard(name + "'s Second Card", PINnum);
      }
      else if (selection==4)
      {
        card = new CreditCard(names, PINnum);
        CreditCard lower= money.lowerBalance(swipe, card);
        System.out.println(lower.getAccountHolder());
        System.out.println(lower.getBalanceOwed());
      }
      else if (selection==5)
      {
        donut.depositProfits();
        System.out.println(donut);
        System.out.println(money);
      }
      else if (selection==6)
      {       
        System.out.println(donut);
        System.out.println(card);
        System.out.println(swipe);
        System.out.println(names);
        System.out.println(PINnum);
      }
    }
  }
}