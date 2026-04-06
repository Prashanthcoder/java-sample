package collectionadd;

public class SampleInt {
    static Object[] arr = new Object[10];
    static int index = 0;

    static void add(Object a) {
        arr[index++] = a;
    }

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);

        for (Object obj : arr) {
            if (obj != null)
                System.out.println(obj);
        }
    }
}