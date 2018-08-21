
public abstract class Recipe {
	protected String[] ingredients;
	protected double prepTime;
	protected String dishName;
	
	public Recipe(String[] ingredients, double prepTime, String dishName) {
		this.ingredients = ingredients;
		this.prepTime = prepTime;
		this.dishName = dishName;
	}
	public abstract void prepare();
	public abstract void taste();
	public abstract void serve();
	public void CleanUp() {
		System.out.println("Load dishwasher");
	}
}
