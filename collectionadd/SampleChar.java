package collectionadd;

public class SampleChar {
    static Object[] arr = new Object[10];
    static int index = 0;

    static void add(Object a) {
        arr[index++] = a;
    }

    public static void main(String[] args) {
        add('A');
        add('B');
        add('C');

        for (Object obj : arr) {
            if (obj != null)
                System.out.println(obj);
        }
    }
}