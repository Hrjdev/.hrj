public class TestLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addToBack("a");
        list.addToBack("b");
        list.addToBack("b");
        list.addToBack("a");

        System.out.println("List:");
        System.out.println(list);
        System.out.println("Is palindrome: " + list.isPalindrome());

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack pop operations:");
        while (stack.hasItems()) {
            System.out.println(stack.pop());
        }
    }
}
