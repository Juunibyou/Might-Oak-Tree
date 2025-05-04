package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testSquirrel() {
        Squirrel squirrel = new Squirrel("Test");
        Node node = new Node(squirrel);

        assertEquals("Test", node.get_detail().getName());
    }

    @Test
    public void testLeftRight() {
    Node test = new Node(new Squirrel("Jon"));
    Node left = new Node(new Squirrel("Jane"));
    Node right = new Node(new Squirrel("Joe"));

    test.set_left(left);
    test.set_right(right);

    assertEquals("Jane", test.left().get_detail().getName());
    assertEquals("Joe", test.right().get_detail().getName());
    }
}
