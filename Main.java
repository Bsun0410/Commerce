public class Main
{
    public static void main(String[] args)
    {
     
      BankApp app = new BankApp();
      app.start();
  

        // // ---- WRITE EACH PIECE OF TEST CODE, STEP BY STEP --------
        // // ---- THIS TESTING SCENARIO ILLUSTRATES A USE CASE OF A --
        // // ---- COMPLETE CLIENT PROGRAM THAT USES THESE CLASSES ----

        // // 1. write code to create a new Bank object. then, print out the Bank
        // //    object to check that its default values match expected output.
        // Bank money = new Bank();
        // System.out.println(money);


        // // 2. write code to create a new CreditCard with a holder name of
        // //    Mr. Miller (or your name!) and a PIN of 9254. then, print
        // //    the CreditCard object to check that its state matches the 
        // //    expected output.

        // CreditCard swipe = new CreditCard("Miller", "9254");
        // System.out.println(swipe);

        
        // // 3. write code to create a new BagelShop object with a name "Jim’s
        // //    Bagel Shop", a starting inventory of 1000 bagels, a price of 2
        // //    dollars, and the bank object you created in step 1 as the Bank.
        // //    then, print the BagelShop object to check that its state matches
        // //    the expected output.
        // BagelShop donut = new BagelShop("Jim's Bagel Shop", 1000, 2, money);
        // System.out.println(donut);

        
        // // 4. write code in which Mr. Miller uses his credit card to buy 5
        // //    bagels at Jim’s Bagel Shop with PIN "9254" using the
        // //    payForBagels method, and confirm that the purchase was indeed 
        // //    successful printing the by printing the value returned
        // //    by the method (should be true).

        // boolean purchase = donut.payForBagels(swipe, 5, "9254");
        // System.out.println(purchase);


        // // 5. next, write code to print out Mr. Miller’s credit card object
        // //    and Jim’s Bagel Shop object again to check that the appropriate
        // //    instance variables were updated correctly in those two objects.

        // System.out.println(swipe);
        // System.out.println(donut); 


        // // 6. write code in which Mr. Miller tries to use his credit card 
        // //    to buy 10 more bagels at Jim’s Bagel Shop, but accidentally
        // //    enters his PIN wrong as "9354". print the value returned from
        // //    the payForBagels method in this case to confirm it’s false.

        //   boolean purchase2 = donut.payForBagels(swipe, 10, "9354");
        //   System.out.println(purchase2);



        // // 7. next, print out Mr. Miller’s credit card object and
        // //    Jim’s Bagel Shop object again to confirm NO VALUES WERE CHANGED
        // //    since the PIN was incorrect and the purchase was unsuccessful.
        // System.out.println(swipe);
        // System.out.println(donut); 


        // // 8. fixed the PIN, phew!  write code to attempt to purchase
        // //    10 bagels again, using the correct PIN this time ("9254").
        // //    print out the returned value to make sure it’s true,
        // //    and print out the CreditCard and BagelShop objects to confirm
        // //    the correct values were updated this time after the successful
        // //    purchase.

        //  boolean purchase3 = donut.payForBagels(swipe, 10, "9254");
        //   System.out.println(purchase3);
        //      System.out.println(swipe);
        // System.out.println(donut); 


        
        // // 9. eww! moldy bagels!  write code in which Mr. Miller returns 3 of
        // //    the bagels using the returnBagels method, and confirm that the
        // //    return was processed successfully by printing the value returned
        // //    by the method (should be true). then print the CreditCard and
        // //    BagelShop objects to make sure the credit card balance went down
        // //    (refund) and bagel shop profit went down, but the inventory did
        // //    NOT change (returned bagels are thrown away).

        // boolean refund = donut.returnBagels(swipe, 3, "9254");
        //  System.out.println(swipe);
        // System.out.println(donut); 

        
        // // 10. time to pay bills!  write code in which Mr. Miller goes to the
        // //     bank and makes a $15 payment on his credit card. use the
        // //     makePayment method on the bank object, then print out the
        // //     CreditCard object and Bank object to make sure that the balance
        // //     on the credit card decreased by 15 and the cash on hand at the
        // //     bank increased by 15.

        // money.makePayment(swipe, 15);

        // System.out.println(money);
        // System.out.println(swipe);


        
        // // 11. new credit card! write code in which John opens a NEW credit 
        // //     card (i.e. a new CreditCard object) with the name "John" and
        // //     PIN "1022". print the new CreditCard object.

        // CreditCard card = new CreditCard("John", "1022");
        // System.out.println(card);


        
        // // 12. John is catering a breakfast at a conference center (during
        // //     covid, shame!).  he uses his credit card and correct PIN to 
        // //     purchase 300 bagels from Jim’s Bagel Shop.  write the code to
        // //     test this situation, and print the value returned by the 
        // //     payForBagels method (should be true).
        // //
        // //     then, print John’s CreditCard object and Jim’s BagelShop object
        // //     to make sure the values are updated correctly:  the credit card
        // //     balance and bagel shop’s profit should go up by 600, and the
        // //     bagel shop’s inventory should drop by 300.

        // boolean buy = donut.payForBagels(card, 300, "1022");
        // System.out.println(buy);
        // System.out.println(card);
        // System.out.println(donut);


        
        // // 13. write code in which John goes to the bank and pays $75 of his 
        // //     credit card’s balance.  then print out the CreditCard 
        // //     object and Bank object to make sure that the balance on
        // //     John’s credit card decreased by 75 and the cash on hand at the
        // //     bank increased by 75. however, because John’s balance is above
        // //     the high balance amount, there is a $5 charge, so his balance
        // //     should be $530 not $525.
        //   money.makePayment(card, 75);

        // System.out.println(money);
        // System.out.println(card);


        
        // // 14. Jim’s Bagel Shop has a lot of money!  write code to have Jim
        // //     deposit all of his bagel shop’s profits at the bank using the
        // //     depositProfits method on the BagelShop object.
        // //
        // //     then, print out the BagelShop and Bank objects to make sure the
        // //     bagel shop’s profits are back at 0, and both the bank’s vendor
        // //     account balance and cash on hand amount have increased by 624.
        // donut.depositProfits();
        // System.out.println(donut);
        // System.out.println(money);

        
        // // 15. write code to compare the two credit card balances and print
        // //     out who has the lower balance and what their balance is. use
        // //     the lowerBalance method on the Bank object to do this.
        // //     hint: the lowerBalance method returns a CreditCard object
        // //     reference, so store that in a variable, and then call the 
        // //     getAccountHolder and getBalanceOwed methods on that variable

        // CreditCard lower= money.lowerBalance(swipe, card);
        // System.out.println(lower.getAccountHolder());
        // System.out.println(lower.getBalanceOwed());

            
        // // 16. write code to have John pay off his credit card balance in full
        // //    (in other words, pay the entire amount so his balance is 0).
        // //    print his CreditCard and Bank objects to make sure his balance
        // //    went to 0 and the bank’s cash on-hand increased by his balance
        // //    amount. Note that John’s credit card should by 0, not 5, since
        // //    he shouldn’t have incurred the high balance penalty after this
        // //    payment.
        // money.makePayment(card, 530);
        // System.out.println(card);
        // System.out.println(money);



        
        // // 17. write code to compare the two credit card balances again and
        // //     print out who has the lower balance and what their balance is.
        // //     use the same strategy as before (feel free to reuse test
        // //     variables or declare new ones).
        // CreditCard least= money.lowerBalance(swipe, card);
        // System.out.println(least.getAccountHolder());
        // System.out.println(least.getBalanceOwed());


        // // 18. write code to have Mr. Miller pay off his credit card balance
        // //     in full, then print his CreditCard object and the Bank object.
        // money.makePayment(swipe,swipe.getBalanceOwed());
        // System.out.println(swipe);
        // System.out.println(money);


        
        // // 19. write code to compare the two credit card balances again and
        // //     print out who has the lower balance and what their balance is.
        // //     Note: You will run into a NullPointerException if you try
        // //     calling a method on a null object (e.g. you attempt to call
        // //     getAccountHolder() on a CreditCard object that is null).
        // //     to avoid this, check that the returned CreditCard reference is
        // //     not null before trying to call methods on it:
        // //                       if (lowestCard != null)...
        // //     IN THIS CASE, since null is returned ONLY if the two balances
        // //     are equal, print "The balances are the same" in the event the
        // //     value is null.
        // CreditCard less= money.lowerBalance(swipe, card);
        // if(less!=null)
        // {
        //   System.out.println(less.getAccountHolder());
        //   System.out.println(less.getBalanceOwed());
        //   System.out.println(less.getAccountHolder() + " has a lower balance of $ " + less.getBalanceOwed());
        // }
        // else
        // {
        //   System.out.println("The balances are the same");
        // }

    }
}