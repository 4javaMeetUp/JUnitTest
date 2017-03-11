package ua.javameeting.shape;

import java.math.BigDecimal;

public class Rectangle implements Shape {

    private BigDecimal length;
    private BigDecimal width;

    public Rectangle(BigDecimal length, BigDecimal width) {
        this.length = length;
        this.width = width;
    }

    public BigDecimal getPerimeter() throws ShapeParamException {

        validData();

        return length.add(length).add(width).add(width);
    }

    public BigDecimal getSquare() throws ShapeParamException {

        validData();

        return length.multiply(width);
    }

    private void validData() throws ShapeParamException {

        if(length == null || length.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ShapeParamException("Error: parameter \"length\" is not valid!");
        }

        if(width == null || width.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ShapeParamException("Error: parameter \"width\" is not valid!");
        }
    }
}
