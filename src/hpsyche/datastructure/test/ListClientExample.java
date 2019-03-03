package hpsyche.datastructure.test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Hpsyche
 */
public class ListClientExample {
    private List list;
    public ListClientExample() {
        list=new LinkedList();
    }

    public List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample example=new ListClientExample();
        System.out.println(example.getList());
    }
}
