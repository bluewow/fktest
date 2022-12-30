package com.example.fkentity.testcontainer;

import com.navercorp.fixturemonkey.LabMonkey;
import com.navercorp.fixturemonkey.api.introspector.BeanArbitraryIntrospector;
import com.navercorp.fixturemonkey.api.introspector.ConstructorPropertiesArbitraryIntrospector;
import com.navercorp.fixturemonkey.api.introspector.FieldReflectionArbitraryIntrospector;
import com.navercorp.fixturemonkey.javax.validation.plugin.JavaxValidationPlugin;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestRegular {

    @RepeatedTest(100)
    @Test
    void test() {
        LabMonkey labMonkey = LabMonkey.labMonkeyBuilder()
//                .objectIntrospector(ConstructorPropertiesArbitraryIntrospector.INSTANCE)
                .plugin(new JavaxValidationPlugin())
                .build();


        labMonkey.giveMeBuilder(TestDto.class)
                .set("pattern", "test");



    }
}
