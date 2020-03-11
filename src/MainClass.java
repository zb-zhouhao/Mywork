import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

class MyHashSet<T> extends HashSet<T> {
    private int addCount;

    public MyHashSet() {
        super();
        addCount = 0;
    }

    @Override
    public boolean add(T a) {
        addCount++;
        return super.add(a);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}


public class MainClass {
    public static void main(String[] args) {
        MyHashSet<String> msh = new MyHashSet<String>();
        msh.add("A");
        msh.add("B");
        msh.add("C");
        msh.addAll(Arrays.asList("D", "E", "F"));
        System.out.println(msh.getAddCount());
    }
}
