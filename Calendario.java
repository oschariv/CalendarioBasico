
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
    
    /**
     * metodo para avanzar un dia a la fecha,
     * debe cambiar de mes y anno cuando corresponda
     * 
     * Los meses son de 30 dias!
     */
    
    public void avanzarFecha()
    {
        dia = dia + 1;
        if (dia == 31){
            mes = mes + 1;
            dia = 1;
            if (mes == 13){
                anno = anno + 1;
                mes = 1;
                if (anno == 100){
                    anno = 1;
                }
            }
        }
    }
    
    /**
     * Crear metodo para mostra la fecha como texto
     */
    public String mostrarFecha() {
        
        String textoDevolver;

        String diaTexto;
        if (dia < 10){
            diaTexto = "0" + dia;
        }
        else{
            diaTexto = dia + "";
        }
        
        String mesTexto;
        if (mes < 10){
            mesTexto = "0" + mes;
        }
        else{
            mesTexto = mes + "";
        }
        
        String annoTexto;
        if (anno < 10){
            annoTexto = "0" + anno;
        }
        else{
            annoTexto = anno + "";
        }
        
        textoDevolver = "" + diaTexto + "-" + mesTexto + "-" + annoTexto;
        return textoDevolver;
    }
}
