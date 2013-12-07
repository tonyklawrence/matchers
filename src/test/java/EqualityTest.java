import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static types.ComplexType.complex;
import static types.SimpleType.simple;

public class EqualityTest {
    @Test
    public void simpleTypesAreEqual() {
        assertThat(simple(), is(equalTo(simple())));
    }

    @Test
    public void sameComplexTypesAreEqual() {
        assertThat(complex(10), is(equalTo(complex(10))));
        assertThat(complex(20), is(not(equalTo(complex(30)))));
    }
}
