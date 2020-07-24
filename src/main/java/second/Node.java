package second;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Node class represents cities, that connected to each other.
 * Field distance describes the distance from start node to current node.
 * Field shortestPath describes list of nodes that is a path to current node.
 * Field adjacentNodes represents the previous node
 * */

class Node {
    private String name;
    private List<Node> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    private Map<Node, Integer> adjacentNodes = new HashMap<>();

    void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    Node(String name) {
        this.name = name;
    }

	List<Node> getShortestPath() {
		return shortestPath;
	}

	void setShortestPath(List<Node> shortestPath) {
		this.shortestPath = shortestPath;
	}

	Integer getDistance() {
		return distance;
	}

	void setDistance(Integer distance) {
		this.distance = distance;
	}

	Map<Node, Integer> getAdjacentNodes() {
		return adjacentNodes;
	}
}
