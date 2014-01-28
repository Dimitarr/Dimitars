
package box;


class Box {
    double wi;
    double he;
    double de;
}

Box (double w, double h, double d) {
wi =w ;
he = h;
de = d;
}

double volume () {
    return wi * he * de;
}

class boxnew () {
    public static void main(String[] args) {
        Box mybox1 = new Box (1, 5, 9);
        Box mybox2 = new Box (1, 15, 30);        
    
    
double vol;

vol= mybox1.volume ();
System.out.println ("Об`єм mybox1" +vol );

vol = mybox2.volume ():
System.out.println ("Об`єм mybox2" +vol );
    }
}
