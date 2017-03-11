package ua.javameeting.shape;

import java.math.BigDecimal;

public interface Shape {

    public BigDecimal getPerimeter() throws ShapeParamException;

    public BigDecimal getSquare() throws ShapeParamException;
}
