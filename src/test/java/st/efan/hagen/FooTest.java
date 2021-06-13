package st.efan.hagen;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class Test_foo_for_fun {

    @Test
    void empty_foo() {
        Foo foo = new Foo();
        assertEquals(50, foo.compute(42.0));
    }

    @Test
    void twin_integer_foo() {
        Foo foo = new Foo(2, 2);
        assertEquals(0, foo.compute(42.0));
    }

    @Test
    void two_integer_foo() {
        Foo foo = new Foo(2, 4);
        assertEquals(1, foo.compute(42.0));
    }

}
