package step_2;

public class Main {
    
    public static void main(String args[]) {
        StackImpl_1 stack1 = new StackImpl_1();
        StackImpl_2  stack2 = new StackImpl_2();
        StackClient stackclient = new StackClient(stack1, stack2);
        stackclient.printStack();
    }
}
