package utp.com;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        RenProyec r = new RenProyec(3, 50000000.0, 6.2);



        System.out.println(r.calcularInteresSimple());
        System.out.println(r.calcularInteresCompuesto());
        System.out.println(r.analisisInversion());
    }
}
