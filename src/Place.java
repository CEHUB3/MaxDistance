public class Place {

    private String name;
    private int x;
    private int y;

    public Place(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;

    }

    public int distanceTo(Place a){
        return Math.sqrt((a.x-this.x))*
    }

}
