package utp.com;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        RenProyec r = new RenProyec(3, 60000000.0, 7.2);



        System.out.println(r.calcularInteresSimple());
        System.out.println(r.calcularInteresCompuesto());
        System.out.println(r.analisisInversion());
    }
}
