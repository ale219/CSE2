


  public class Arithmetic{
      
      
      
      public static void main(String[] args) {
          
          //Number of pairs of pants
          int nPants=5;
          //Cost per pair of pants
          double pantCost$=4.50;
          
          //Number of bowls
          int nBowls=17;
          //Cost per bowl
          double bowlCost$=7.80;
          
          //Number of printer ink cartridges
          int nCartridges=10;
          //Cost per cartridge
          double cartridgeCost$=11.60;
          double taxPercent=0.06;
          //Assume three seperate transactions, indivdual sales tax on each type of item
          //Sales tax on total cost of pants
          double salesTaxPants$= (double pantCost$ * ((double) int nPants)) * double taxPercent);
          
          //Sales tax on total cost of bowls
          double salesTaxBowls$= (double bowlCost$ * (double) int nBowls) * double taxPercent);
          
          //Sales tax on total cost of ink cartridges
          double salesTaxCartridges$= (double cartridgeCost$ * (double) int nCartridges) * double taxPercent);
          
          
          //Total cost of purchases w/o sales tax
          double totalCost$= (double pantCost$ * (double) int nPants)+(double bowlCost$*(double) int nBowls)+(double cartridgeCost$ * (double) int nCartridges)
          
          
          
          
      }
  }