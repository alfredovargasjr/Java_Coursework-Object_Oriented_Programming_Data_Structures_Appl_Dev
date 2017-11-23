
public class Movie {
	private String name;
	private int id;
	public static int numMovie = 0;
	
	public Movie(){
		name = "Iron Man";
		id = ++numMovie;
	}
	
	public Movie(String s){
		name = s;
		id = ++numMovie;
	}
	
	public String getName(){
		return name;
	}
	public int getID(){
		return id;
	}
	
	public String toString(){
		return "[" + name + ", " + id + "]";
	}

}
