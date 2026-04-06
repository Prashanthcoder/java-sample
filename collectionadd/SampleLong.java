package collectionadd;

public class SampleLong {
    static Object[] arr = new Object[10];
    static int index = 0;

    static void add(Object a) {
        arr[index++] = a;
    }

    public static void main(String[] args) {
        add(100L);
        add(200L);
        add(300L);

        for (Object obj : arr) {
            if (obj != null)
                System.out.println(obj);
        }
    }
}