package datastructures;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        System.out.println("Stack example");

        // Stack = LIFO (Last In First Out) data structure
        // - stores objects in a "vertical tower"
        // - push() to add to the top
        // - pop() to remove from the top

        // When is Stack useful?
        // - undo/redo features in text editors
        // - moving back/forward in browser history
        // - backtracking algorithms (maze, file directories)
        // - calling functions (call stack)

        Stack<String> stack = new Stack<String>();

        // Currently the stack is empty
        System.out.println("\nStack empty: " + stack.empty());

        // Adding items to the stack
        stack.push("item1");
        stack.push("item2");
        stack.push("item3");
        stack.push("item4");

        System.out.println("\nAdded items: item1, item2, item3, item4");
        System.out.println("Stack empty: " + stack.empty());
        System.out.println("Current stack: " + stack);

        // Removing items from the stack
        System.out.println("\nRemoving item4");
        stack.pop();
        System.out.println("Current stack: " + stack);

        // Removing and printing an item
        System.out.println("\nRemoved item: " + stack.pop());
        System.out.println("Current stack: " + stack);

        // Removing and storing an item
        String removedItem = stack.pop();
        System.out.println("\nString removedItem = " + removedItem);
        System.out.println("Current stack: " + stack);

        System.out.println("\nRe-adding items");
        stack.push("item2");
        stack.push("item3");
        stack.push("item4");
        System.out.println("Current stack: " + stack);

        // Checking the top item on the stack without removing it
        System.out.println("\nTop item from the stack: " + stack.peek());
        System.out.println("Current stack: " + stack);

        // Searching a stack
        System.out.println("\nPosition of item1: " + stack.search("item1"));
        System.out.println("Position of item4: " + stack.search("item4"));
        System.out.println("Position of an unknown item: " + stack.search("item0"));

        // Duplicate objects in a stack
        for (int i = 0; i < 5; i++) {
            stack.push("item4");
        }
        System.out.println("\nAdded multiple item4 objects, stack.search() will return the position of the first found item4.");
        System.out.println("Current stack: " + stack);
        System.out.println("Position of item4: " + stack.search("item4"));

        // Finding object by index - different from position
        System.out.println("\nItem at index 0: " + stack.elementAt(0));

    }
}
