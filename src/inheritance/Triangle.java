package inheritance;

public class Triangle extends Shape {
    int c;

    public Triangle(int a, int b, int c){
        super(a, b);
        this.c = c;
    }

    @Override
    public int getPerimeter(){
        return getA() + getB() + c;
    }
}
