import org.junit.Test;
import types.ComplexType;
import types.SimpleType;
import types.Type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static types.ComplexType.complex;
import static types.SimpleType.simple;

public class InstanceOfTest {
    @Test
    public void canMatchASimpleType() {
        assertThat(simple(), is(instanceOf(Type.class)));
        assertThat(simple(), is(instanceOf(SimpleType.class)));
    }

    @Test
    public void canMatchComplexType() {
        assertThat(complex(10), is(instanceOf(Type.class)));
        assertThat(complex(20), is(instanceOf(ComplexType.class)));

        assertThat(complex(30), is(not(instanceOf(SimpleType.class))));
    }
}