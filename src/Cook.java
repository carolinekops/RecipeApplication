import java.util.Scanner;
public class Cook {

static final String welcome = "Welcome to my resturant! Would you like a Starter, Entree, or Dessert?";
static final String starters = "Do you want chicken wings or garlic bread?";
static final String entrees = "Do you want pizza or pasta?";
static final String dessert = "Do you want a sundae or doughnut?";
static final String another = "Want another meal?";
boolean another = true;

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	System.out.println(Cook.welcome);
	String orderType = keyboard.nextLine();
	if(orderType.equalsIgnoreCase("starter")){
		System.out.println(Cook.starters);
		String starterType = keyboard.nextLine();
		
		if(starterType.equalsIgnoreCase("chicken wings")) {
			Starter ChickenWings = new Starter(new String[]{"chicken","sauce","celery"}, 45.5, "Chicken Wings", true, false);
			ChickenWings.prepare();
			ChickenWings.addSauce();
			ChickenWings.taste();
			ChickenWings.serve();
		}else {
			Starter GarlicBread = new Starter(new String[]{"bread","garlic","cheese"}, 10.0, "Garlic Bread", false, true);
			GarlicBread.prepare();
			GarlicBread.addSauce();
			GarlicBread.taste();
			GarlicBread.serve();
			}
	}else if(orderType.equalsIgnoreCase("entree")) {
		System.out.println(entrees);
		String entreeType = keyboard.nextLine();
		if(entreeType.equalsIgnoreCase("pizza")) {
				//String[] ingredients, double prepTime, String dishName, String orderSize, boolean vegetarian
			Entree Pizza = new Entree(new String[] {"dough", "cheese", "pepperoni","sauce"}, 30.0, "Pizza", "Large",false);
			Pizza.prepare();
			Pizza.taste();
			Pizza.serve();
		}else {
			Entree Pasta = new Entree(new String[] {"noodles", "cheese", "sauce"}, 13.5, "Pasta", "Medium",true);
			Pasta.prepare();
			Pasta.taste();
			Pasta.serve();
			}
	}else {
		System.out.println(dessert);
		String dessertType = keyboard.nextLine();	
		if(dessertType.equalsIgnoreCase("sundae")) {
			Dessert Sundae = new Dessert(new String[] {"ice cream", "chocolate sauce", "cherry"}, 7.5, "Sundae", false, 345);
			Sundae.prepare();
			Sundae.taste();
			Sundae.serve();
		}else {
			Dessert Doughnut = new Dessert(new String[] {"dough", "oil", "sugar"}, 36.0, "Doughnut", false, 450);
			Doughnut.prepare();
			Doughnut.taste();
			Doughnut.serve();
			}
		System.out.println(another);
		Boolean again = keyboard.nextBoolean();
		while(again);
		
}
}
}