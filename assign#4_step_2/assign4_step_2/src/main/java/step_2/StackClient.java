package step_2;

public class StackClient {
    StackImpl_1 stack1;
    StackImpl_2 stack2; 
    
    public StackClient(StackImpl_1 stack1,  StackImpl_2 stack2) {
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    public void printStack(){
        Iterator stacka = stack1.createIterator();
        Iterator stackb = stack2.createIterator();
        System.out.println("Toyota: ");
        printStack(stacka);
        System.out.println("Ford: ");
        printStack(stackb);
    }

    private void printStack(Iterator iterator) {
        
        while (iterator.hasNext()) {
            Car car = (Car)iterator.next();
            System.out.print(car.getName() + " ");
            System.out.println(car.getPrice());
        }
    }
 
}
