package learningtest;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

public class BiMapTest {

    private BiMap<String, Integer> biMap;

    private String k1 = "abc";

    private int v1 = 123;

    private String k2 = "def";

    private int v2 = 456;


    @Test
    public void hello() {
        System.out.println("Hello");
    }

    @Before
    public void init() {
        this.biMap = HashBiMap.create();
    }

    @Test
    public void createBiMap() {
        BiMap<String, Integer> createWithNoParameter = HashBiMap.create();
        assertThat(createWithNoParameter)
                .isNotNull()
                .hasSize(0);

        BiMap<String, Integer> createWithIntParameter = HashBiMap.create(10);
        assertThat(createWithIntParameter)
                .isNotNull()
                .hasSize(0);

        BiMap<String, Integer> createWithMapParameter = HashBiMap.create(Map.of(this.k1, this.v1, this.k2, this.v2));
        assertThat(createWithMapParameter)
                .isNotNull()
                .hasSize(2);
    }

    @Test
    public void testBasicMapProperty() {
        this.biMap.put(this.k1, this.v1);
        this.biMap.put(this.k1, this.v2);

        assertThat(this.biMap)
                .containsExactly(entry(this.k1, this.v2));
    }

    @Test
    public void useInverseFunction() {
        this.biMap.put(this.k1, this.v1);
        this.biMap.put(this.k2, this.v2);

        assertThat(this.biMap.inverse())
                .isNotNull()
                .containsExactly(entry(this.v1, this.k1), entry(this.v2, this.k2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertDuplicateValues() {
        this.biMap.put(this.k1, this.v1);
        this.biMap.put(this.k2, this.v1);
    }

    @Test
    public void insertDuplicateValuesUsingForcePut() {
        this.biMap.put(this.k1, this.v1);
        this.biMap.forcePut(this.k2, this.v1);

        assertThat(this.biMap)
                .containsExactly(entry(this.k2, this.v1));
    }

}
