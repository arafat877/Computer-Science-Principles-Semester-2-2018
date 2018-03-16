import java.util.ArrayList;

public class City {
	private ArrayList<City>connectedCities = new ArrayList<City>();
	private ArrayList<Integer>distances = new ArrayList<Integer>();
	private static ArrayList<City>clist = new ArrayList<City>();
	private String myName;
	
	public City(String name){
		myName = name;
		clist.add(this);
	}
	
	public String toString() {
		return "City[name=" + myName + " connectedCities=" + connectedCities + " distance=" + distances + "]"; 
	}
	
	public static void main(String[] args) {
		City KC = new City("KC");
		City SF = new City("SF");
		KC.connectedCities.add(SF);
		KC.distances.add(1500);
		
		System.out.println(KC);
	}

}
