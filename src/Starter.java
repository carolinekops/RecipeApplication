
public class Starter extends Recipe {
		private boolean spicy;
		private boolean vegetarian;
		
		public Starter(String[] ingredients, double prepTime, String dishName, boolean spicy, boolean vegetarian) {
			super(ingredients, prepTime, dishName);
			this.spicy = spicy;
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
		public void addSauce() {
			System.out.println("Sauce added");
		}
		
}
