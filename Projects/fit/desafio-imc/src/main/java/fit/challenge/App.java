package fit.challenge;
import fit.challenge.ImcCalculator;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String resultado = ImcCalculator.calculate(88, 1.77);
        System.out.println(resultado);
    }
}
