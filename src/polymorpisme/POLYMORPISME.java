
package polymorpisme;

public class POLYMORPISME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HEWAN hw = new HEWAN();
        
        Ayam ay =new Ayam();
        Bebek bb=new Bebek();
        Kucing kc =new Kucing( );
        Kuda kd =new Kuda ();
        
        hw.tampilSuara();
        ay.tampilSuara();
        bb.tampilSuara();
        kc.tampilSuara();
        kd.tampilSuara();
        
      
    }
    
}
