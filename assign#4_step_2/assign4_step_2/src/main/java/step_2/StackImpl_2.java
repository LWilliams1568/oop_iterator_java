package step_2;
import java.util.*;

public class StackImpl_2 implements Stack, Directory  {
    Vector<Object> cars;
    
    
    public StackImpl_2() {
        cars = new Vector<Object>();
        push("2021 Ford Focus", 18000);
        push("2021 Ford Fiesta", 19000);
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
        return new StackIterator2(cars);
    }
    
}
