package collections;

import java.util.HashMap;

public class Node <K,T>{
	private T element;
	private HashMap<K, Edge<K,T>> list;
	private int position;
	private K key;
	private boolean visited;
	private int distance;
	
	public Node(T element, int position) {
		this.element = element;
		this.position = position;
		list = new HashMap<>();
		visited = false;
		distance = Integer.MAX_VALUE;
	}


	public T getElement() {
		return element;
	}


	public void setElement(T element) {
		this.element = element;
	}


	public HashMap<K, Edge<K,T>> getList() {
		return list;
	}


	public void setList(HashMap<K, Edge<K,T>> adyacenceList) {
		this.list = adyacenceList;
	}
	
	public void addEdge(K key, Edge<K,T> edge) {
		list.put(key, edge);
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}
	
	public K getAdjacent() {
		K q = null;
		for(Edge<K,T> s:list.values()) {
			q = s.getAdjacentTo();
			break;
		}
		return q;
	}


	public K getKey() {
		return key;
	}


	public void setKey(K key) {
		this.key = key;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}