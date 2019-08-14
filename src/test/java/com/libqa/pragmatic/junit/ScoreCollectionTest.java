package com.libqa.pragmatic.junit;

import org.junit.Test;

import static org.assertj.core.api.Fail.fail;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class ScoreCollectionTest {
    @Test
    public void test() {
        //fail("Not yet implemented!");
    }

    @Test
    public void answersArithmeticMeanOfTwoNumbers() {
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        int actualResult = collection.arithmeticMean();

        assertThat(actualResult, equalTo(7));
    }
}