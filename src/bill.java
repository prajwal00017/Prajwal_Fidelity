

public class bill {
    public static void main(String[] args) {
        int pizzaPrice=200;
        int puffPrice=40;
        int drinkPrice=120;

        int noofPizzas=5;
        int noofPuffs=6;
        int noofdrinks=2;

        int totalPizzacost= noofPizzas*pizzaPrice;
        int totalPuffcost= noofPizzas*puffPrice;
        int totalDrinkcost= noofdrinks*drinkPrice;

        int totalbill = totalPizzacost + totalDrinkcost + totalPuffcost;
        System.out.println("Total Pizza Cost: "+totalPizzacost);
        System.out.println("Total Puff Cost: "+totalPuffcost);
        System.out.println("Total Drink Cost: "+totalDrinkcost);
        System.out.println("Total Bill: "+totalbill);


    }
}
