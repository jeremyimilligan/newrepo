package shapes;

public class triangle {
    //Triangle needs two sides and base
    //Triangle needs height to calculate area
    public int height;
    public int base;
    public int side1;
    public int side2;


    public triangle(int base, int side1, int side2, int height){
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public int perimeter(){
        return this.base + this.side1 + this.side2;
    }
    public double area(){
        return this.height * this.base * .5;
    }
}
