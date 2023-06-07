package HomeWorckOOP_03;

import java.util.Iterator;
import java.util.LinkedList;

public class IterableList<Str> implements Iterable<Str>  {

    private int size = 0; 
    private int count = 0; 
    private IterableList<Str> node = null;
    private IterableList<Str> first;
    private IterableList<Str> end;
    LinkedList<Str> elements = new LinkedList<>();

    public void add(Str elem) {
        
        if (count == 0) {
            node.set(elem);
        } 
        else{
            node.add(elem);
        }
        count++;
    }



  
    public void set(Str value, int index) {
        isIndexExist(index);
        IterableList<Str> unit = getUnit(index);
        unit.elements = value;
    }





    @Override
    public Iterator<Str> iterator() {
        return new Iterator<Str>() {
            //IterableList<Str> elem = first ;
            int index = 0;
            @Override
            public boolean hasNext() {
                //return elem != null;
                return index < elements.size();
            }

            @Override
            public Str next() {
                return elements.get(index++);
            }
        };


}
