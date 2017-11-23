import java.util.function.Function; 
import java.util.List; 
import java.util.ArrayList;
import java.util.Iterator;

public class ListUtil {
	
	public static <T, R> List<Pair <T, R>> map(List<T> values, Function <T, R> f){
		List<Pair<T, R>> list = new ArrayList<>();
		T val;
		Iterator<T> iter = values.iterator();
		while(iter.hasNext()){
			val = iter.next();
			list.add(new Pair<T, R> (val, f.apply(val)));
		}
		return list;
	}
}
