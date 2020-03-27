package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void shouldReturnTheTotalNodesInBst() {
        BinarySearchTree binarySearchTreeTest = new BinarySearchTree();
        binarySearchTreeTest.insert(50);
        binarySearchTreeTest.insert(25);
        binarySearchTreeTest.insert(75);
        binarySearchTreeTest.insert(12);
        binarySearchTreeTest.insert(88);
        binarySearchTreeTest.insert(30);
        binarySearchTreeTest.insert(60);

        assertEquals(7, binarySearchTreeTest.getTotalNodes());
    }

    @Test
    public void shouldTraverseTreeInPreOrder() {
        BinarySearchTree binarySearchTreeTest = new BinarySearchTree();
        binarySearchTreeTest.insert(50);
        binarySearchTreeTest.insert(25);
        binarySearchTreeTest.insert(75);
        binarySearchTreeTest.insert(12);
        binarySearchTreeTest.insert(88);
        binarySearchTreeTest.insert(30);
        binarySearchTreeTest.insert(60);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(50);
        expectedList.add(25);
        expectedList.add(12);
        expectedList.add(30);
        expectedList.add(75);
        expectedList.add(60);
        expectedList.add(88);

        assertEquals(expectedList, binarySearchTreeTest.preOrderTraverse());
    }

    @Test
    public void shouldTraverseTreeInInorder() {
        BinarySearchTree binarySearchTreeTest = new BinarySearchTree();
        binarySearchTreeTest.insert(50);
        binarySearchTreeTest.insert(25);
        binarySearchTreeTest.insert(75);
        binarySearchTreeTest.insert(12);
        binarySearchTreeTest.insert(88);
        binarySearchTreeTest.insert(30);
        binarySearchTreeTest.insert(60);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(12);
        expectedList.add(25);
        expectedList.add(30);
        expectedList.add(50);
        expectedList.add(60);
        expectedList.add(75);
        expectedList.add(88);

        assertEquals(expectedList, binarySearchTreeTest.inOrderTraverse());
    }

    @Test
    public void shouldTraverseTreeInostOrder() {
        BinarySearchTree binarySearchTreeTest = new BinarySearchTree();
        binarySearchTreeTest.insert(50);
        binarySearchTreeTest.insert(25);
        binarySearchTreeTest.insert(75);
        binarySearchTreeTest.insert(12);
        binarySearchTreeTest.insert(88);
        binarySearchTreeTest.insert(30);
        binarySearchTreeTest.insert(60);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(12);
        expectedList.add(30);
        expectedList.add(25);
        expectedList.add(60);
        expectedList.add(88);
        expectedList.add(75);
        expectedList.add(50);

        assertEquals(expectedList, binarySearchTreeTest.postOrderTraverse());
    }

    @Test
    public void shouldReturnEmptyListWhenElementIsNeverInsertedForEveryTraversal() {
        BinarySearchTree binarySearchTreeTest = new BinarySearchTree();
        assertTrue(binarySearchTreeTest.inOrderTraverse().isEmpty());
        assertTrue(binarySearchTreeTest.preOrderTraverse().isEmpty());
        assertTrue(binarySearchTreeTest.postOrderTraverse().isEmpty());
    }
}
