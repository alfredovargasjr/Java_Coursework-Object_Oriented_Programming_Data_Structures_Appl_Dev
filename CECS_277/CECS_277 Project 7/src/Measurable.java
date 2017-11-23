import java.util.ArrayList;
import java.util.Comparator;

public interface Measurable <U extends Comparable> {
	public U getMeasure();
	public static <E> E largest(ArrayList a){
		ArrayList<Measurable> list = a;
		if(list == null)
			return null;
		Measurable<?> largest = list.get(0);;
		for(int j = 1; j < list.size(); j++){
			if(largest.getMeasure().compareTo(list.get(j).getMeasure()) < 0)
				largest = list.get(j);
		}
		return (E) largest;
	}
}
