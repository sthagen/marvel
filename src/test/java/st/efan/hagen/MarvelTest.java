package st.efan.hagen;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static st.efan.hagen.Marvel.add;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class Test_two_arguments {
    @Test
    void integers_only() {
        assertEquals(add(42, 0), 42);
    }
    @Test
    void strings_holding_integers() {
        assertEquals(add("42", "0"), 42);
    }

    @Test
    void one_string_holding_integer_the_other_being_bad() {
        assertEquals(add("42", "x"), -1);
    }

}