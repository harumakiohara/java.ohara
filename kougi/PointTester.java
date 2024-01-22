package kougi;

class Point {
    int x;
    int y;

   Point(int x, int y){this.x = x; this.y = y;}

   void setX(int x){this.x = x;}
   void setY(int y){this.y = y;}

   int getx(){return x;}
   int gety(){return y;}
}


class Point3D extends Point {
    int z;
    Point3D(int x,int y,int z){super(x,y); this.z = z;}
    void setZ(int z){this.x = z;}
    int getZ(){return z;}
}

public class PointTester {
      public static void main(String[] args) {
        Point a = new Point(10, 15);
        Point3D b = new Point3D(20, 30, 40);

        System.out.printf("a = (%d,%d)\n", a.getx(),a.gety());
        System.out.printf("b = (%d,%d,%d)\n", b.getx(),b.gety(),b.getZ());

      }
    
}