package hpsyche.datastructure.test2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hpsyche
 */
public class TestArrayList {
    @Test
    public void fun1(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.set(1,5));
    }
}
