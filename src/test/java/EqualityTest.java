import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static types.SimpleType.simple;

public class EqualityTest {
    @Test
    public void simpleTypesAreEqual() {
        assertThat(simple(), is(equalTo(simple())));
    }
}
