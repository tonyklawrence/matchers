import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class InstanceOfTest {
    @Test
    public void canMatchASimpleType() {
        assertThat(new SimpleType(), is(instanceOf(Type.class)));
        assertThat(new SimpleType(), is(instanceOf(SimpleType.class)));
    }

    @Test
    public void canMatchComplexType() {
        assertThat(new ComplexType(10), is(instanceOf(Type.class)));
        assertThat(new ComplexType(20), is(instanceOf(ComplexType.class)));

        assertThat(new ComplexType(30), is(not(instanceOf(SimpleType.class))));
    }
}

interface Type {}
class SimpleType implements Type {}
class ComplexType implements Type {
    public ComplexType(int value) {}
}