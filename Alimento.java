
/**
aplicación destinada a personas que están a dieta y que necesitan contar las calorías y los macronutrientes de 
los alimentos que ingieren
 * @author (VACACIONES,   VACACIONES.) 
 * @version (07   /01   /2016)
 */
public class Alimento
{
    // At para guardar el nombre del alimento.
    private String nombreAl;
    // At para guardar el valor de las proteinas.
    public float proteinas;
    // At para guardar el valor de los carbohidratos.
    public float carbohidratos;
    // At para guardar el valor de las grasas.
    public float grasas;

    /**
     * Constructor for objects of class Alimento
     */
    public Alimento(String nombreAl, float proteinas, float carbohidratos, float grasas)
    {
        this.nombreAl =  nombreAl;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
    }
     
    /**
     * Mt para mostrar información nutricional de los alimentos.
     */
    public void muestraDatos(){
        System.out.println("Nombre:                         " +nombreAl);
        System.out.println("");
        System.out.println("Proteinas por cada 100 gr:      " +proteinas    );
        System.out.println("Carbohidratos por cada 100 gr:  " +carbohidratos);
        System.out.println("Grasas por cada 100 gr:         " +grasas);
        System.out.println("Total de calorias:              "  );
        System.out.println("Macronutriente/s mayoritario/s: "  );
    }

    
   }

   





