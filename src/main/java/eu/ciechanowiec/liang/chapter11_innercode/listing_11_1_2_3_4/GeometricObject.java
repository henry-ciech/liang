package eu.ciechanowiec.liang.chapter11_innercode.listing_11_1_2_3_4;

import java.util.Date;

public class GeometricObject {

    private String color;
    private boolean filled;
    private final Date dateCreated;

    protected GeometricObject() {
        color = "white";
        dateCreated = new Date();
    }

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return String.format("""
                created: %s
                color: %s
                filled: %b
                """, dateCreated, color, filled);
    }
}
