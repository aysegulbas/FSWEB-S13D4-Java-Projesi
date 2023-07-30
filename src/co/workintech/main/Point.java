package co.workintech.main;

public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {//parametre x yazdık, variable aynı isim olduğu için kafa karışmasın diye this yazdık
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(Math.pow(x-0,2)+Math.pow(y-0,2));
    }
    public double distance(int a,int b){
        return Math.sqrt(Math.pow(x-a,2)+Math.pow(y-b,2));
    }
    public double distance(Point p){//direkt objenin kendisini verdik
        if(p!=null){
        return Math.sqrt((Math.pow(x-p.x,2))+Math.sqrt(Math.pow(y-p.y,2)));
        }
        return distance();//point null gelirse de 0,0'a göre mesafe hesaplansın dedik

    }

}
