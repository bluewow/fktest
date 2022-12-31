package com.example.fkentity.fixtureMonkey;

import com.navercorp.fixturemonkey.LabMonkey;
import com.navercorp.fixturemonkey.javax.validation.plugin.JavaxValidationPlugin;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static com.example.fkentity.fixtureMonkey.ValidationPolicy.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TestRegular {

    LabMonkey labMonkey = LabMonkey.labMonkeyBuilder()
        .plugin(new JavaxValidationPlugin())
        .build();

    @RepeatedTest(100)
    @Test
    void test() {
        TestDto sample = labMonkey.giveMeOne(TestDto.class);

        assertThat(sample.name).isNotNull();
    }

    @RepeatedTest(100)
    @Test
    void testSize() {
        TestDto sample = labMonkey.giveMeOne(TestDto.class);

        assertThat(sample.name).hasSizeLessThanOrEqualTo(MAX);
        assertThat(sample.integer).isLessThanOrEqualTo(MAX).isGreaterThanOrEqualTo(MIN);
        assertThat(sample.lists).hasSizeLessThanOrEqualTo(LIST_MAX);
    }

    @RepeatedTest(100)
    @Test
    void testRegular() {
        TestRegularDto sample = labMonkey.giveMeBuilder(TestRegularDto.class)
            .set("pattern", "test")
            .sample();

        assertThat(sample.name).isNotNull();
        assertThat(sample.pattern).isEqualTo("test");
    }
}
