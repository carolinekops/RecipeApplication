
public class Entree extends Recipe {
	private String orderSize;
	private boolean vegetarian;
	public Entree(String[] ingredients, double prepTime, String dishName, String orderSize, boolean vegetarian) {
		super(ingredients, prepTime, dishName);
		this.orderSize = orderSize;
		this.vegetarian = vegetarian;
	}
	
	public void prepare() {
		System.out.println("Preparing " + dishName);
	}
	public void taste() {
		System.out.println("Tasting " + dishName );
	}
	public void serve() {
		System.out.println(dishName + " is served!");
	}
}
