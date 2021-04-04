package step_2;
import java.util.*;

public class StackImpl_1 implements Stack, Directory{
    ArrayList cars;
    
    public StackImpl_1() {
        cars = new ArrayList();
        push("2021 Toyota Corolla", 20000);
        push("2021 Toyota Camry", 25000);
    }
    
 
    public void push(String name, int price){
        Car car = new Car(name, price);
        cars.add(car);
    }
    
    public Object pop(){
        return cars.remove(-1);
    }
    
     public void clear(){
        cars.clear();
    }
    
    public Iterator createIterator() {
        return new StackIterator1(cars);
    }
    
}

