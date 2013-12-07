import org.junit.Test;
import types.ComplexType;
import types.ContainerType;
import types.SimpleType;
import types.Type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static types.ComplexType.complex;
import static types.ContainerType.container;
import static types.SimpleType.simple;

public class ContainsTest {
    @Test
    public void isCorrectType() {
        assertThat(container(), is(instanceOf(Type.class)));
        assertThat(container(), is(instanceOf(ContainerType.class)));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void canContainTypes() {
        assertThat(container(simple()), contains(instanceOf(SimpleType.class)));
        assertThat(container(simple(), complex(50)), contains(instanceOf(SimpleType.class), instanceOf(ComplexType.class)));
    }

    @Test
    public void conContainIntances() {
        assertThat(container(simple()), contains(simple()));
        assertThat(container(complex(10), complex(20)), contains(complex(10), complex(20)));
        assertThat(container(simple(), container(complex(10))), contains(simple(), container(complex(10))));
    }
}