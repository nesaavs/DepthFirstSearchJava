import java.util.ArrayList;
/**
 * Represent a node in the network. With fields representing it's state and children.
 * 
 * @author Shaun Plummer
 */
public class Node {
	String data;
	ArrayList<Node> children = new ArrayList<Node>();
	
	/**
	 * Adds the data used to represent the node state.
	 * 
	 * @param d	-Data stored in the node 
	 */
	public Node(String d) {
		this.data = d;
	}
		
	/**
	 * Allows the children of a given node to be specified.
	 * 
	 * @param n
	 */
	public void setChild(Node n){
		children.add(n);
	}
	
	/**
	 * Returns all children for the given node
	 * @return 	ArrayList	Contains all children as node objects	
	 */
	public ArrayList<Node> getChildren() {
		return this.children;
	}
	
	/**
	 * Returns the data representing the node state
	 * 
	 * @return String state information.
	 */
	public String getData() {
		return this.data;
	}

}
