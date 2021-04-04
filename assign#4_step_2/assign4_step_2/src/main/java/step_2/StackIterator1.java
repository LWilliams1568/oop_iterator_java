package step_2;
import java.util.*;

public class StackIterator1 implements Iterator {
    ArrayList cars;
    int position;
  
    
    public StackIterator1 (ArrayList cars) {
        this.cars = cars;
        position= cars.size()-1;
    }
     
    public Object next() {  
        Object object = cars.get(position);
        position = position-1;        
        return object;
    }
    public boolean hasNext() {
        if (position < cars.size()&& position >= 0) {
            return true;
        } 
        else {
            return false;
        }
    }
    
    public Object remove(){
        
        return cars.remove(-1);
    }
    
}
