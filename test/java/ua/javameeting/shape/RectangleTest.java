package ua.javameeting.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RectangleTest {

    private final List<Map<String, BigDecimal>> listParameters = new ArrayList<Map<String, BigDecimal>>();

    @Before
    public void setUp() {

        Map<String, BigDecimal> parameters1 = new HashMap<String, BigDecimal>();
        parameters1.put("width", new BigDecimal("3"));
        parameters1.put("length", new BigDecimal("4.2"));
        parameters1.put("perimeter", new BigDecimal("14.4"));
        parameters1.put("square", new BigDecimal("12.6"));
        listParameters.add(parameters1);

        Map<String, BigDecimal> parameters2 = new HashMap<String, BigDecimal>();
        parameters2.put("width", new BigDecimal("5"));
        parameters2.put("length", new BigDecimal("3"));
        parameters2.put("perimeter", new BigDecimal("16"));
        parameters2.put("square", new BigDecimal("15"));
        listParameters.add(parameters2);
    }

    @After
    public void tearDown() {
        listParameters.clear();
    }

    @Test
    public void perimeterTest() throws ShapeParamException {

        for(Map<String, BigDecimal> param : listParameters) {

            BigDecimal expected = param.get("perimeter");
            Shape shape = new Rectangle(param.get("length"), param.get("width"));
            BigDecimal actual = shape.getPerimeter();

            Assert.assertEquals(expected, actual);
        }
    }
}
