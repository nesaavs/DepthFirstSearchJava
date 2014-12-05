import java.util.ArrayList;

/**
 * The graph class represents the collection of nodes. 
 * 
 * @author Shaun Plummer
 */
public class Graph {
    private Node rootNode;
    private ArrayList<Node> nodes= new ArrayList<Node>();
    
    /**
     * Returns the root node of the graph 
     * 
     * @return Node	
     */
    public Node getRootNode() {
		return rootNode;
	}

    /**
     * Allows the root node of the graph to be specified.
     * 
     * @param rootNode
     */
	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

	/**
	 * Add a new node to the graph
	 * 
	 * @param n	The node to be added
	 */
	public void addNode(Node n) {
    	this.nodes.add(n);
    }
	
	/**
	 * Returns the node at the requested position in the children array
	 * 
	 * @param i	the index of the requested node in the array
	 * @return	The node found at the position specified in the index.
	 */
	public Node getNode(int i) {
		return nodes.get(i);
		
	}
	/**
	 * Searches searches each node. If it cannot be found the null is returned. 
	 * 
	 * @param search The node to be searched for
	 * @return	The node found at the position specified in the index.
	 */
	public Node findNode(String search) {
		Node currentNode = null;
			for(int i = 0; i < nodes.size(); i++) {
				currentNode = nodes.get(i);
					if(search.equals(currentNode.getName())) {
						break;
					}
			}
		return currentNode;
	}
	
	
	/**
	 * Populates the graph with sample data. 
	 */
	public void popSampleNodes() {
		//Lets create nodes as given as an example in the article
		Node nA = new Node("Animalia");
		Node nVert = new Node("Vertebrates");
		Node nInvert = new Node("Invertebrates");
		Node nReptiles = new Node("Reptiles");
		Node nFish = new Node("Fish");
		Node nAmphibians = new Node("Amphibians");
		Node nBirds = new Node("Birds");
		Node nMammals = new Node("Mammals");
		Node nMollusks = new Node("Mollusks");
		Node nWorms = new Node("Worms");
		Node nSponges = new Node("Sponges");
		Node nCrocodiles  =new Node("Crocodiles");
		Node nSnakes = new Node("Snakes");
		Node nLizards = new Node("Lizards");
		Node nTurtles = new Node("Turtles");
		Node nJawless = new Node("Jawless");
		Node nJawed = new Node("Jawed");
		Node nFrogs = new Node("Frogs");
		Node nToads = new Node("Toads");

		//add nodes, create edges between nodes
		nA.setChild(nVert);
		nA.setChild(nInvert);
		nVert.setChild(nReptiles);
		nVert.setChild(nFish);
		nVert.setChild(nAmphibians);
		nVert.setChild(nBirds);
		nVert.setChild(nMammals);
		nInvert.setChild(nMollusks);
		nInvert.setChild(nWorms);
		nInvert.setChild(nSponges);
		nReptiles.setChild(nCrocodiles);
		nReptiles.setChild(nSnakes);
		nReptiles.setChild(nLizards);
		nReptiles.setChild(nTurtles);
		nFish.setChild(nJawless);
		nFish.setChild(nJawed);
		nFrogs.setChild(nFrogs);
		nFrogs.setChild(nToads);
		
		addNode(nA);
		addNode(nVert);
		addNode(nInvert);
		addNode(nReptiles);
		addNode(nFish);
		addNode(nAmphibians);
		addNode(nBirds);
		addNode(nMammals);
		addNode(nMollusks);
		addNode(nWorms);
		addNode(nSponges);
		addNode(nCrocodiles);
		addNode(nSnakes);
		addNode(nLizards);
		addNode(nTurtles);
		addNode(nJawless);
		addNode(nJawed);
		addNode(nFrogs);
		addNode(nToads);
		setRootNode(nA);
	} //End sample data method
}
