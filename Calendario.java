
/**
 * Crear una calendario que no permite fijar una fecha en numero enteros,
 * poder avanzar esa fecha en un dia,
 * y obtener la fecha como String (Cadena de Caracteres).
 * 
 * @oschariv (Oscar Charro Rivera) 
 * @0.0.1 (11/04/2016)
 */
public class Calendario
{
    // Declara dia
    private int dia;
    // Declara mes
    private int mes;
    // Declara anno
    private int anno;
    /**
     * Constructor del calendario, se inicializan las varibles a 1.
     */
    public Calendario()
    {
        //inicializamos dia a 1
        dia = 1;
        //inicializamos mes a 1
        mes = 1;
        //inicializadmos anno a 1
        anno = 1;
    }

    /**
     * Metodo para establecer una fecha sin comprobar nada,
     * todos los parametros deben de ser de dos digitos como maximo.
     */
    public void establecerFecha(int x, int y, int z)
    {
        // igualamos los valores introducidos
        dia = x;
        
        mes = y;
        
        anno = z;
    }
    
    
}
