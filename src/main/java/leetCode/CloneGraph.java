//https://leetcode.com/problems/clone-graph/
package leetCode;

import graph.Node;

import java.util.*;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Queue<Node> queue = new LinkedList<>();
        HashMap<Node, Node> hashMap = new HashMap<>();
        queue.add(node);
        hashMap.put(node, new Node(node.val));
        while (!queue.isEmpty()) {
            Node frontNode = queue.poll();
            for (Node neighbor : frontNode.neighbors) {
                if (!hashMap.containsKey(neighbor)) {
                    hashMap.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor);
                }
                hashMap.get(frontNode).neighbors.add(hashMap.get(neighbor));
            }
        }
        return hashMap.get(node);
    }
}
