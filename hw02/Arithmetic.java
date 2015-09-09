


  public class Arithmetic{
      
      
      
      public static void main(String[] args) {
          
          
          //Number of pairs of pants
          int nPants=5;
          //Cost per pair of pants
          double pantCost$=4.50;
          int newPantCost$= (int)(4.50 * 100);
          double finalPantCost$= newPantCost$/100.0;
          
          //Number of bowls
          int nBowls=17;
          //Cost per bowl
          double bowlCost$=7.80;
          int newBowlCost$= (int)(4.50 * 100);
          double finalBowlCost$= newBowlCost$/100.0;
          
          //Number of printer ink cartridges
          int nCartridges=10;
          //Cost per cartridge
          double cartridgeCost$=11.60;
          int newCartridgeCost$= (int)(4.50 * 100);//Truncate at 2 dec places
          double finalCartridgeCost$= newCartridgeCost$/100.0;
          double taxPercent=0.06;
          //Assume three seperate transactions, indivdual sales tax on each type of item
          //Total cost item 1
          //Sales tax on total cost of pants
          double noTaxPants$= pantCost$* nPants;
          int newNoTaxPants$= (int)(noTaxPants$ * 100);
          double finalNoTaxPants$= newNoTaxPants$/100.0;//Truncated dec places
          double salesTaxPants$= pantCost$* nPants* taxPercent;
          int newSalesTaxPants$= (int)(salesTaxPants$ * 100);
          double finalSalesTaxPants$= newSalesTaxPants$/100.0;
          double yesTaxPants$= salesTaxPants$ + noTaxPants$;
          int newYesTaxPants$= (int)(yesTaxPants$ * 100);
          double finalYesTaxPants$= newYesTaxPants$/100.0;
          //Total cost item 2
          //Sales tax on total cost of bowls
          double noTaxBowls$= bowlCost$* nBowls;
          int newNoTaxBowls$= (int)(noTaxBowls$ * 100);
          double finalNoTaxBowls$= newNoTaxBowls$/100.0;//Truncated dec places
          double salesTaxBowls$= bowlCost$* nBowls* taxPercent;
          int newSalesTaxBowls$= (int)(salesTaxBowls$ * 100);
          double finalSalesTaxBowls$= newSalesTaxBowls$/100.0;
          double yesTaxBowls$= salesTaxBowls$ + noTaxBowls$;
          int newYesTaxBowls$= (int)(yesTaxBowls$ * 100);
          double finalYesTaxBowls$= newYesTaxBowls$/100.0;
          //Total cost item 3
          //Sales tax on total cost of ink cartridges
          double noTaxCartridges$= cartridgeCost$* nCartridges;
          int newNoTaxCartridges$= (int)(noTaxCartridges$ * 100);//Truncated dec places
          double finalNoTaxCartridges$= newNoTaxCartridges$/100.0;
          double salesTaxCartridges$= cartridgeCost$* nCartridges* taxPercent;
          int newSalesTaxCartridges= (int)(salesTaxCartridges$ * 100);
          double finalSalesTaxCartridges$= newSalesTaxCartridges/100.0;
          double yesTaxCartridges= salesTaxCartridges$ + noTaxCartridges$;
          int newYesTaxCartridges= (int)(yesTaxCartridges * 100);
          double finalYesTaxCartridges$= newYesTaxCartridges/100.0;
          
          //Total cost of purchases w/o sales tax
          double totalCost$= noTaxPants$ + noTaxBowls$ + noTaxCartridges$;
          int newTotalCost$= (int)(totalCost$ * 100);
          double finalTotalCost$= newTotalCost$/100.0;//Truncated dec places
          double salesTaxTotal$= totalCost$ * taxPercent;
          int newSalesTaxTotal$= (int)(salesTaxTotal$ * 100);
          double finalSalesTaxTotal$= newSalesTaxTotal$/100.0;
          double totalCostTax$= salesTaxTotal$ + totalCost$;
          int newTotalCostTax$= (int)(totalCostTax$ * 100);
          double finalTotalCostTax$= newTotalCostTax$/100.0;
          System.out.println("Pants");
          
            System.out.println(+nPants+  " pairs of pants were purchased");//Summary of pants purchase
            
            System.out.println("The pants cost $" +finalPantCost$+ "0 for each pair");
            
            System.out.println("The total cost of the pants was $" +finalNoTaxPants$+ "0 before tax");
            
            System.out.println("$"+finalSalesTaxPants$+ " was the sales tax on the pants");
            
            System.out.println("The total cost of the pants was $" +finalYesTaxPants$+ " after tax");
          
          System.out.println("Bowls");
          
            System.out.println(+nBowls+ " bowls were purchased");//Summary of bowls purchase
          
            System.out.println("The bowls cost $" +finalBowlCost$+ "0 a piece");
            
            System.out.println("The total cost of the bowls was $" +finalNoTaxBowls$+ "0 before tax");
            
            System.out.println("$"+finalSalesTaxBowls$+ " was the sales tax on the bowls");
            
            System.out.println("The total cost of the bowls was $" +finalYesTaxBowls$+ " after tax");
          
          System.out.println("Cartridges");
              
            System.out.println(+nCartridges+ " cartridges were purchased");//Summary of cartridges purchase
          
            System.out.println("The cartridges cost $" +finalCartridgeCost$+ "0 a piece");
            
            System.out.println("The total cost of the cartridges was $" +finalNoTaxCartridges$+ "0 before tax");
            
            System.out.println("$"+finalSalesTaxCartridges$+ " was the sales tax on the cartridges");
          
            System.out.println("The total cost of the cartridges was $" +finalYesTaxCartridges$+ " after tax");
            
          System.out.println("Total");
          
            System.out.println("The total cost of the items was $" +finalTotalCost$+ "0 before tax");//Summary of total purchase
            
            System.out.println("$"+finalSalesTaxTotal$+ " was the sales tax on the items");
            
            System.out.println("The total cost of the items was $" +finalTotalCostTax$+ " after tax");
      }
            }