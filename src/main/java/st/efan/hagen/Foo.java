package st.efan.hagen;

public class Foo implements Compute {
    private int lo, hi = 100;
    private int foo = (hi - lo) / 2;
    Foo() {}
    Foo(int low, int high) {
        if (low < high) {
            this.lo = low;
            this.hi = high;
        } else {
            this.lo = high;
            this.hi = low;
        }
        foo = (hi - lo) / 2;
    }

    @Override
    public double compute(double t) {
        foo = (hi - lo) / 2;
        return foo;
    }
}

