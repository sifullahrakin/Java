import java.util.*;
public class Cuboid {
    public static void main(String args[]) {
     int width;
     int height;
     int depth;
     
     Cuboid(int width, int height, int depth){
         this.width = width;
         this.height = height;
         this.depth = depth;
     }
     
     Cuboid(int width, int height){
         this.width = width;
         this.height = height;
         this.depth = depth;
     }
     
     Cuboid(int dimension){
         width = dimension;
         height = dimension;
         depth = dimension;
     }
     
     Cuboid(){
         this.width = 10;
         this.height = 10;
         this.depth = 10;
     } 
     
     int volume(){
         return width*height*depth;
     }
     
     public static void main(String args[]){
         int volume;
         
         Cuboid stdCuboid = new Cuboid(10, 20, 15);
         volume = stdCuboid.volume();
         System.out.println("Volume of a simple Cuboid is: "+volume);
         
         Cuboid cuboidwithDefaults = new Cuboid(10, 20);
         volume = cuboidWithDefaults.volume();
         System.out.println("Volume of a cuboid with default depth is: "+volume);
         
         Cuboid cube = new Cuboid(10);
         volume = cube.Volume();
         System.out.println("Volume of cube is: "+volume);
         
         Cuboid defaultCuboid = new Cuboid();
         volume = defaultCuboid.volume();
         System.out.println("Volume of default Cuboid is: "+volume);
     }
     
    }
}