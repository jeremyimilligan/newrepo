package sept16;

public class gingerBreadMold {
    //knows..properties, attributes, fields
    public int arms;
    public int legs;
    public int head;
    public int gumdropButtons;

    //Methods are actions, verbs, things the object does
    public void speak(){
        System.out.println("eat me bitch");
    }

    @Override
    public String toString() {
        return "gingerBreadMold{" +
                "arms=" + arms +
                ", legs=" + legs +
                ", head=" + head +
                '}';
    }
}
