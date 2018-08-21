
public class Dessert extends Recipe{
	private boolean savory;
	private int calories;
	
	public Dessert(String[] ingredients, double prepTime, String dishName, boolean savory, int calories) {
		super(ingredients, prepTime, dishName);
		this.savory = savory;
		this.calories = calories;
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
	public void batter() {
		System.out.println("Making batter");
	}
	public void bake() {
		System.out.println("Baking");
	}
	public void decorate() {
		System.out.println("Decorating");
	}
}
