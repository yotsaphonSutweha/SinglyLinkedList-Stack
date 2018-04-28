public class Main {
    public static void main(String args[]){
        Stack stack = new Stack();

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        stack.push(1);

        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(3);

        System.out.println(stack.size());

        System.out.println(stack.display());

        stack.pop();

        System.out.println(stack.size());

        System.out.println(stack.display());

        System.out.println(stack.peak());

        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        System.out.println(stack.display());
        System.out.println(stack.peak());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.display());


    }
}
