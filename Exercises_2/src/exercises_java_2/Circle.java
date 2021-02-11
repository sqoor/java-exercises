package exercises_java_2;

public class Circle {
    private float x, y, radius;
    
    public Circle() {
        this.x = 0;
        this.x = 0;
        this.radius = 1;
    }
    
    public Circle(float x, float y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getRadius() {
        return this.radius;
    }
    
    public double circumference() {
        return 2 * Math.PI * this.radius;
    }
    
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    public double diameter() {
        return 2 * this.radius; 
    }
    
    
    @Override
    public String toString() {
        return "";
    }
}
