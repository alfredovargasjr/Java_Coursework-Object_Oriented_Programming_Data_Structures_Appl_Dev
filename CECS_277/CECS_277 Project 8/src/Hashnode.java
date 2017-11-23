
public class Hashnode <K, V> {
	//genertic datamembers
	public K key;
	public V value;
	public Hashnode<K, V> next;
	public int hash;
	public int index;
	
	/**
	 * overoaded construcotr 
	 * @param k
	 * @param v
	 * @param n
	 * @param h
	 * @param i
	 */
	public Hashnode(K k, V v, Hashnode<K, V> n, int h, int i){
		key = k;
		value = v;
		next = n;
		hash = h;
		index = i;
	}
	/**
	 * overloaded constructor 
	 * @param k
	 * @param v
	 * @param h
	 * @param i
	 */
	public Hashnode(K k, V v, int h, int i){
		key = k;
		value = v;
		hash = h;
		index = i;
	}
	/**
	 * string override, return string value of object
	 */
	public String toString(){
		return "[" + key + ", " + value + "]";
	}
}
