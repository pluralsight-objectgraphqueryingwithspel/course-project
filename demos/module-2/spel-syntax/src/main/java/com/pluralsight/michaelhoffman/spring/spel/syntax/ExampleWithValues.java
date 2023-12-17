package com.pluralsight.michaelhoffman.spring.spel.syntax;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * This is an example component that contains value annotations. The value annotations
 * demonstrate SpEL syntax and are used in the corresponding SyntaxExamplesTest
 */
@Component
public class ExampleWithValues {

    private String literalTextExample;

    private Integer newTotal;

    public ExampleWithValues(@Value("#{'Hello World'}") String literalTestExample,
                             @Value("#{${app.total} + ${app.total}}") Integer newTotal) {
        this.literalTextExample = literalTestExample;
        this.newTotal = newTotal;
    }

    public String getLiteralTextExample() {
        return literalTextExample;
    }

    public void setLiteralTextExample(String literalTextExample) {
        this.literalTextExample = literalTextExample;
    }

    public Integer getNewTotal() {
        return newTotal;
    }

    public void setNewTotal(Integer newTotal) {
        this.newTotal = newTotal;
    }
}
