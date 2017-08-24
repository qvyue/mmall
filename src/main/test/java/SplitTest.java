import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class SplitTest {
    @Test
    public void test_string_split() {
        String[] split = "a,b,,".split(","); // java内置的会忽略空内容
        assertThat(split, equalTo(Lists.newArrayList("a", "b").toArray()));
    }
    @Test
    public void test_guava_Splitter() {
        List<String> splitToList = Splitter.on(",").splitToList("a,b,,");//guava不会忽略

        assertThat(splitToList, equalTo(Lists.newArrayList("a", "b", "", "")));
    }
    @Test
    public void test_guava_Splitter_omitEmptyStrings() {
        // 或者可以自由选择的忽略　，像java一样，忽略空字符串
        List<String> splitToList = Splitter.on(",").omitEmptyStrings().trimResults().splitToList("a,b,,");

        assertThat(splitToList, equalTo(Lists.newArrayList("a", "b")));
    }
}
