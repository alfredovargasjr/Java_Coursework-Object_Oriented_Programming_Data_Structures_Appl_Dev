import java.util.Comparator;

public class StringComparator implements Comparator <String> {
	private String first;
	private String second;
	
	public StringComparator(){
		first = null;
		second = null;
	}
	public StringComparator(String f, String s){
		first = f;
		second = s;
	}

	@Override
	public int compare(String f, String s) {
		
		return f.compareTo(s) * -1;
	}
}
