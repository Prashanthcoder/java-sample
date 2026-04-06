package collectionadd;

public class SampleBoolean {
    static Object[] arr = new Object[10];
    static int index = 0;

    static void add(Object a) {
        arr[index++] = a;
    }

    public static void main(String[] args) {
        add(true);
        add(false);
        add(true);

        for (Object obj : arr) {
            if (obj != null)
                System.out.println(obj);
        }
    }
}