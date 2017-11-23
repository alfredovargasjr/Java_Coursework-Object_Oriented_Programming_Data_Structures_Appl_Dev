package NotationConversion;

public class inputField {
	/**
	 * hold the string
	 * edit the string, delete, add
	 */
	private String s;
	
	public inputField(){
		s = "";
	}
	
	public inputField(String st){
		s = st;
	}
	
	public void add(String st){
		s = s + st;
	}
	
	public void delete(){
		if(s != "" && s.length() != 0){
			s = s.substring(0, s.length() - 1);
		}
	}
	
	public void clear(){
		s = "";
	}
	
	public String get(){
		return s;
	}

}
