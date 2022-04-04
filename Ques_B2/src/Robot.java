import java.awt.*;

public class Robot {
    private String direction;
    private Point location;

    public Robot(String direction, Point location){
        this.direction = direction;
        this.location = location;
    }

    public void turnLeft(){
        if(direction.equals("E")) direction = "N";
        else if(direction.equals("N")) direction = "W";
        else if(direction.equals("W")) direction = "S";
        else if(direction.equals("S")) direction = "E";

    }
    public void turnRight(){
        if(direction.equals("E")) direction = "S";
        else if(direction.equals("S")) direction = "W";
        else if(direction.equals("W")) direction = "N";
        else if(direction.equals("N")) direction = "E";

    }
    public void move(){
        if(direction.equals("E")) location.x = location.x + 1;
        else if(direction.equals("W")) location.x = location.x - 1;
        else if(direction.equals("N")) location.y = location.y + 1;
        else if(direction.equals("S")) location.y = location.y - 1;
    }
    public Point getLocation(){
        return location;
    }
    public String getDirection(){
        return direction;
    }
}
