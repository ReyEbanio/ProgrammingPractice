package inheritance;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableTest {
	private final ArrayList<String> favouriteFood;
	
	public ImmutableTest(List<String> favouriteFood ) {
		favouriteFood.add("Pinya");
		System.out.println(favouriteFood);
		this.favouriteFood = new ArrayList<String>(favouriteFood);
	}

	public int getFavFoods (){
		return favouriteFood.size();
	}
	//instead of passing the List
	public String getFavouriteFoodsItem(int index) {
		return favouriteFood.get(index);
	}
	
	public List<String> getFoods(){
		//return new ArrayList<String>(this.favouriteFood);
		//return List.copyOf(favouriteFood);
		//return Collections.unmodifiableList(new ArrayList<>(favouriteFood));
		return favouriteFood;
	}
	
	public static void main(String[] args) {
		var favourites = new ArrayList<String>();
		favourites.add("apple");
		var iTest = new ImmutableTest(favourites);
		
		iTest.getFoods();
		iTest.getFoods().clear();
		iTest.getFoods().add("Kinain ko ang mansanas");		
		System.out.println(iTest.favouriteFood);
	}
}










