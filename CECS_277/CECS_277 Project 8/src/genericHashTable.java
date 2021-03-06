import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class genericHashTable <K, V> {
	private Hashnode<K, V>[] nodes;
	private List<K> keyz = new ArrayList<K>();
	
	public genericHashTable(){
		nodes = new Hashnode[100];
	}
	
	public genericHashTable(int size){
		nodes = new Hashnode[size];
	}
	/**
	 * - get the index in the hashtable of the key
	 * @param key
	 * @return int (hash code of key_
	 */
	public int getIndex(K key){
		int hash = key.hashCode() % 36;
		if(keyz.size() > 7)
			hash = (36 + (key.hashCode() % 36) * (1 + key.hashCode() % 5)) % keyz.size();
		if(hash < 0){
			hash = hash + nodes.length;
		}
		return hash;
	}
	/**
	 * - open hashing
	 * - if node exist, then keep incriminting hash until finds an open index in table
	 * @param key
	 * @param val
	 * @return
	 */
	public void insert(K key, V val){
		keyz.add(key);
		int hash = getIndex(key);
		int index = hash;
		while(nodes[index] != null){
			index++;
		}
		Hashnode<K, V> newNode = new Hashnode(key, val, hash, index);
		nodes[index] = newNode;  
		}
	/**
	 * remove the key and its value
	 * if multiple of the same key, remove the last key and value
	 * @param key
	 * @return
	 */
	public V remove(K key){
		int hash = getIndex(key);
		int index = hash;
		int numOfSameKeys = 0;
		//find the number of multiple of the same key
		while(nodes[index] != null){
			if(nodes[index].hash == hash && key == nodes[index].key)
				numOfSameKeys++;
			index++;
		}
		index = hash;
		if(numOfSameKeys == 1)
			keyz.remove(key);
		for(Hashnode<K, V> n = nodes[hash]; numOfSameKeys > 0; index++){
			if(nodes[index].hash == hash && key == nodes[index].key){
				numOfSameKeys--;
			}
			if(numOfSameKeys == 0){
					nodes[index] = null;
					while(nodes[++index] != null){
						if(nodes[index].hash != nodes[index].index){
							Hashnode<K,V> t = nodes[index];
							nodes[index] = null;
							keyz.remove(t.key);
							insert(t.key, t.value);
						}
							
					}
				}
			}
		return null;
	}
	/**
	 * return the value of key
	 * @param key
	 * @return
	 */
	public V get(K key){
		int hash = getIndex(key);
		for(Hashnode<K,V> n = nodes[hash]; n != null; n = n.next){
			if(key.equals(n.key))
				return n.value;
		}
		return null;
			
	}
	/**
	 * 
	 * @return the list of keys
	 */
	public List keyList(){
		return keyz;
	}
	
	public String toString(){
		String s = "";
		for(int i = 0, k = 0; i < keyz.size();){
			if(nodes[k] != null){
				s = s + "[" + nodes[k].index + "]" + " " + nodes[k].hash + nodes[k].toString() + "\n";
				i++;
			}
			k++;
		}
		return s;
	}
}
