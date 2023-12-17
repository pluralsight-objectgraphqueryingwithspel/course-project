package com.pluralsight.michaelhoffman.spring.spel.syntax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class demonstrating the various examples of syntax, including
 * formats and operators.
 */
@SpringBootTest
public class SyntaxExamplesTest {

    private ExpressionParser parser;

    @Autowired
    private ExampleWithValues exampleWithValues;

    @BeforeEach
    public void setup() {
        parser = new SpelExpressionParser();
    }

    /**
     * This scenario demonstrates using literal text set in a value annotation
     * on a bean. The annotation uses the format #{...} to define the expression.
     */
    @Test
    public void testScenario_literalTextValue() {
        assertEquals("Hello World", exampleWithValues.getLiteralTextExample());
    }

    /**
     * This scenario is more complex as it uses a value calculated from an
     * externalized configuration. Note that the same format is used as the literal
     * text example #{...}, but in this case, I've referred to a property using the
     * property placeholder text ${...}.
     */
    @Test
    public void testScenario_propertyIsTotalOf2() {
        assertEquals(2, exampleWithValues.getNewTotal());
    }

}
