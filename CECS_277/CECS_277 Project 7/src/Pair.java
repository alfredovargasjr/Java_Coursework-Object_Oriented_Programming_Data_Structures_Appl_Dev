
public class Pair <T, S> {
	private T first;
	private S second;
	
	public Pair(T firstElem, S secondElem){
		first = firstElem;
		second = secondElem;
	}
	public T getFirst(){
		return first;
	}
	public S getSecond(){
		return second;
	}
}
