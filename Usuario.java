
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    //At para guardar el nombre del usuario.
    private String nombreUs;
    // At para guardar el valor de las proteinas.
    private float proteinas;
    // At para guardar el valor de los carbohidratos.
    private float carbohidratos;
    // At para guardar el valor de las grasas.
    private float grasas;
    // At para guardar el valor de las calorias.
    private float calorias;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombreUs)
    {
        this.nombreUs = nombreUs;
       proteinas = 0;
       carbohidratos = 0;
       grasas = 0;
       calorias = 0;
    }
    
    /**
     * mt para proporcionar alimentos al usuario.
     */
    public void comer(Alimento comida, float gramosAl){
       float factor = gramosAl / 100;
       proteinas = proteinas + comida.getProteinas()*factor;
       carbohidratos = carbohidratos + comida.getCarbohidratos()*factor;
       grasas = grasas + comida.getGrasas()*factor;
       calorias = calorias + comida.sumaCalorias()* factor   ;
    }

   
}








