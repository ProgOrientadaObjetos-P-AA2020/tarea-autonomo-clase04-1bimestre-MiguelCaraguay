package metodotostring;

public class Ejecutor {
    public static void main(String[] args) {
        // creamos un Objeto
        Objeto ob = new Objeto("Miguel","Caraguay");
        
        System.out.println(ob.toString());
        // presenta "Miguel Caraguay"
        
        System.out.println(ob);
        // presenta "Miguel Caraguay"
    }
}
