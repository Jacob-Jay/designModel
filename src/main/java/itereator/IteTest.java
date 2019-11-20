package itereator;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-20 16:03
 */
public class IteTest {
    public static void main(String[] args) {
        t1();
//        t2();
    }

    public static void t1() {
        Collection_<String> list = new ListByLink<String>();
        for(int i = 0 ;i<15;i++) {
            list.add("s"+i);
        }
        Iterator_ itereator = list.getItereator();
        while (itereator.hasNext()) {
            System.out.println(itereator.getNext());
        }

    }


}
