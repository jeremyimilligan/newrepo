package shapes;

public class square {
    public int side;

    public square(int side){
        this.side = side;

    }

    public int findArea(){
        return this.side * this.side;

    }
    public int findPerimeter(){
        return this.side * 4;
    }
}
