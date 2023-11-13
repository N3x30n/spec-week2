import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) throws InterruptedException {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description");
        cupcake.type();
        System.out.println("How much would you like to be charged for the cupcake? (Input a numerical number taken to the 2 decimal places)");
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("Now for our Red Velvet Cupcake");
        redVelvet.type();
        System.out.println("How much would you like to be charged for the cupcake? (Input a numerical number taken to the 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        System.out.println("Now for our Chocolate Cupcake");
        chocolate.type();
        System.out.println("How much would you like to be charged for the cupcake? (Input a numerical number taken to the 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are deciding our prices for our drinks now. Here is the description of the first drink");
        water.type();
        System.out.println("How much would you be willing to pay for the drink? (Input a numerical number taken to the 3 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);

        System.out.println("We are deciding our prices for our drinks now. Here is the description of the next drink");
        soda.type();
        System.out.println("How much would you be willing to pay for the drink? (Input a numerical number taken to the 3 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        System.out.println("We are deciding our prices for our drinks now. Here is the description of the next drink");
        milk.type();
        System.out.println("How much would you be willing to pay for the drink? (Input a numerical number taken to the 3 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        new Order(cupcakeMenu, drinkMenu);
    }
}
class Cupcake{
   public double price;

   public double getPrice(){
       return price;
   }

   public void setPrice(double price){
       this.price = price;
   }

   public void type() {
       System.out.println("A basic, generic cupcake, with vanilla frosting.");
   }
}

class RedVelvet extends Cupcake{
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}

class Chocolate extends Cupcake{
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}

class Drink{
    public double price;

    public double getPrice(){
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public void type(){
        System.out.println("A bottle of water");
    }
}
class Soda extends Drink{
    public void type(){
        System.out.println("A bottle of soda");
    }
}

class Milk extends Drink{
    public void type(){
        System.out.println("A bottle of milk");
    }
}
