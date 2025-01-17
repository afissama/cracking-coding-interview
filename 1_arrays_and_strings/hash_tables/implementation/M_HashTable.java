class HashNode<V> {
	String key;
	V value;
	HashNode<V> next;
	final int hashCode;
	public HashNode(String key, V value, int hashCode) {
		this.key = key;
		this.value = value;
		this.hashCode = hashCode;
	}
}

public class M_HashTable<V> {

	private HashNode<V>[] buckets;
	
	private int numBuckets;
	private int size;
	
	public M_HashTable(int capacity) {
		numBuckets = capacity;
		size = 0;
		buckets = (HashNode<V>) new HashNode[numBuckets];
	}
	
	public int getBucketIndex(int hashCode) {
		return Math.abs(hashCode % numBuckets);
	}
	
	public int getHashCode(String key) {
		return key.hashCode();
	}

	public V get(String key) {
		int hashCode = getHashCode(key);
		int idx = getBucketIndex(hashCode);
		
		HashNode<V> current = buckets[idx];
		
		while(current != null) {
			if (current.key.equals(key)){
				return current.value;
			}
			current = current.next;
		}
		return null;
	}

	public int getSize() {
		return size;
	}

	public void add(String key, V value) {
		int hashCode = getHashCode(key);
		int idx = getBucketIndex(hashCode);
		
		HashNode<V> current = buckets[idx];

		while(current != null) {
			if (current.key.equals(key)){
				saveTo.value = value;
				return;
			}
			if (current.next == null){
				break;
			}
			current = current.next;
		}
		if (current == null) {
			buckets[idx] = new HashNode<>(key, value, hashCode);
		}
		else {
			current.next = new HashNode<>(key, value, hashCode);
		}
		size++;
	}

	public void remove(K key) {
		int hashCode = getHashCode(key);
		int idx = getBucketIndex(hashCode);
		HashNode<V> current = buckets[idx];
		HashNode<V> prev = null;

		while(current != null) {
			if (current.key.equals(key)) {
				if (prev != null) {
					prev.next = current.next;
				}
				else
				{
					buckets[idx] = current.next;
				}
				size--;
				return;
			}
			prev = current;
			current = current.next;
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
