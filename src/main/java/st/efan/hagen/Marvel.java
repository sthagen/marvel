package st.efan.hagen;

public class Marvel {
    static Foo foo;
    public static void main(String[] args) {
        System.out.printf("Found %d args%n", args.length);
        if (args.length == 2) {
            try {
                foo = new Foo(Integer.decode(args[0]), Integer.decode(args[1]));
            } catch (java.lang.NumberFormatException numberFormatException) {
                foo = new Foo();
            }
            var sum = add(args[0], args[1]);
            System.out.printf("Sum = %d%n", sum);
        }
    }

    public static int add(String a, String b) {
        try {
            return add(Integer.decode(a), Integer.decode(b));
        } catch (java.lang.NumberFormatException numberFormatException) {
            return -1;
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
