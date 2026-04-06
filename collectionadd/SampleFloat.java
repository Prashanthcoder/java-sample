package collectionadd;

public class SampleFloat {
    static Object[] arr = new Object[10];
    static int index = 0;

    static void add(Object a) {
        arr[index++] = a;
    }

    public static void main(String[] args) {
        add(10.5f);
        add(20.2f);
        add(30.8f);

        for (Object obj : arr) {
            if (obj != null)
                System.out.println(obj);
        }
    }
}