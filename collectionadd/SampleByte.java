package collectionadd;

public class SampleByte {
    static Object[] arr = new Object[10];
    static int index = 0;

    static void add(Object a) {
        arr[index++] = a;
    }

    public static void main(String[] args) {
        add((byte)10);
        add((byte)20);
        add((byte)30);

        for (Object obj : arr) {
            if (obj != null)
                System.out.println(obj);
        }
    }
}