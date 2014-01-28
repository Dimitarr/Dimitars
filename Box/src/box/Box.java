
package box;


class Box2 {
    double wid;
    double hei;
    double dep;


Box2 (double w, double h, double d) {
wid =w ;
hei = h;
dep = d;
}
double volume () {
    return wid * hei * dep;
}
}
class Box  {
        public static void main(String[] args) {
        Box2 mybox1 = new Box2 (1, 5, 9);
        Box2 mybox2 = new Box2 (1, 15, 30);        
    
    
double vol;

vol= mybox1.volume ();
System.out.println ("Об`єм mybox1" +vol );

vol = mybox2.volume ();
System.out.println ("Об`єм mybox2" +vol );
    }
}
