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
		City PA = new City("PA");
		SF.connectedCities.add(KC);
		SF.connectedCities.add(PA);
		PA.connectedCities.add(KC);
		PA.distances.add(2910);
		KC.distances.add(21);
		SF.distances.add(1500);
		
		System.out.println(SF);
		
	}

}
