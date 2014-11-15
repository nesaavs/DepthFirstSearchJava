/**
 * This class is the main entry point for the program. Responsible for carrying out the search throughthe graph
 * 
 * @author Shaun Plummer
 */
import java.util.ArrayList;


public class DepthFirstSearch {
	/**
	 * The main method is responsible for creating the graph and populating it with sample data.
	 * It then controls searching through the resulting tree using the depth first search algorithm.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Graph g = new Graph();
		ArrayList<Node> open = new ArrayList<Node>();
		ArrayList<Node> closed = new ArrayList<Node>();
		ArrayList<Node> xChildren = new ArrayList<Node>();
		Node x;
		String result = "Fails";
		
		//populate with sample data
		g.popSampleNodes();
		
		Node goal = g.getNode(16);
		
		//initialise open list with start node
		open.add(g.getRootNode());
		
		System.out.println("Depth First:");
		System.out.println("Start: "+g.getRootNode().getData());

		//iterate through the open list
		while(open.size() > 0) {
			
			//remove the leftmost state from open and call it x
			x = open.get(0);
			
			
			//if x is the goal return success else
			if(x.equals(goal)) {
				result = "Success! "+ x.getData()+" Node reached";
				break;
				
			}
			
			//generate children of x
			xChildren = x.getChildren();
		
			
			//put x in closed
			closed.add(x);
			open.remove(0);
			
			//print list state
			System.out.print("Open: ");
			printListState(open);
			
			//print list state
			System.out.print("Closed: ");
			printListState(closed);
			
			//discard children of x if already in open or closed
			for(int i = xChildren.size()-1; i > 0 ; i--) {
				if(open.contains(xChildren.get(i)) || closed.contains(xChildren.get(i)) ) {
					xChildren.remove(i);
				}
			}
			
			// put remaining children at the start of open
			for(int i = xChildren.size(); i > 0; i--) {				
				open.add(0, xChildren.get(i-1));
			}
			
			
			
			

			System.out.println("");
		}//end while
		
		System.out.println(result);
		

	}
	
	public static void printListState(ArrayList<Node> list) {
		//output results			
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getData()+", ");
		}
		System.out.print(" || ");	
		
	}
	
}
