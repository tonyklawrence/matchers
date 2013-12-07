import org.junit.Ignore;
import org.junit.Test;
import types.SimpleType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class EqualityTest {
    @Test
    @Ignore
    public void simpleTypesAreEqual() {
        assertThat(new SimpleType(), is(equalTo(new SimpleType())));
    }
}
