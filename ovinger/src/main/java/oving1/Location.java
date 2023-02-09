package oving1;

public class Location {
    private int x;
    private int y;

    public void up() {
        this.y--;
    }
    public void down() {
        this.y++;
    }
    public void left() {
        this.x--;
    }
    public void right() {
        this.x++;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
}
