
/**
aplicación destinada a personas que están a dieta y que necesitan contar las calorías y los macronutrientes de 
los alimentos que ingieren
 * @author (pavilion,  pavilion) 
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
    // At para guardar el valor de las calorias.
    public float calorias;
    /**
     * Constructor for objects of class Alimento
     */
    public Alimento(String nombreAl, float proteinas, float carbohidratos, float grasas )
    {
        this.nombreAl =  nombreAl;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        calorias = ( ((proteinas + carbohidratos) *4) + grasas * 9);
    }
     
    /**
     * Mt para mostrar información nutricional de los alimentos.
     */
    public void muestraDatos(){
        //System.out.println("Nombre:                         " +nombreAl);
        System.out.println("");
        System.out.println("Proteinas por cada 100 gr:      " +proteinas    );
        System.out.println("Carbohidratos por cada 100 gr:  " +carbohidratos);
        System.out.println("Grasas por cada 100 gr:         " +grasas);
        System.out.println("Total de calorias:              " +sumaCalorias());
        //System.out.println("Macronutriente/s mayoritario/s: " +nutrienteMayor());
    }
    
    /**
     * Serie de mt. para asignar valor a los atributos.
     */
    public void setProteinas(float proteinasP){
        proteinas = proteinasP;
    }
     public void setCarbohidratos(float carbohidratosC){
        carbohidratos = carbohidratosC;
    }
     public void setGrasas(float grasasG){
        grasas = grasasG;
    }
    
    
    /**
     * serie de mt. para retornar el valor de los atributos
     */
    public float getProteinas(){
        return proteinas;
    }
    public float getCarbohidratos(){
        return carbohidratos;
    }
    public float getGrasas(){
        return grasas;
    }
    public float getCalorias(){
        return calorias;
    }
    
     
        /**
     * mt para sumar las calorias totales de cada alimento.
     */
    public float sumaCalorias(){
        float calorias = ( ((proteinas + carbohidratos) *4) + grasas * 9);
        return calorias;
    }
    
    /**
     * Mt para señalar cual es el macronutriente mayoritario.
     */
    public String nutrienteMayor(){
        String nutriente = "grasas";
        if( (proteinas > carbohidratos) && (proteinas > grasas)){
            nutriente = "proteinas";
        }
        if( (carbohidratos > proteinas) && (carbohidratos > grasas)){
            nutriente = "carbohidratos";
        }
        if( (carbohidratos == proteinas) && (carbohidratos > grasas)){
            nutriente = "carbohidratos y proteinas.";
        }
        if( (proteinas > carbohidratos) && (proteinas == grasas)){
            nutriente = "proteinas y grasas. ";
        }
        if( (grasas == carbohidratos) && (proteinas < grasas)){
            nutriente = "grasas y carbohidratos.";
        }
        if(((grasas == carbohidratos)) && (grasas == proteinas)){
            nutriente = "grasas, carbohidratos y poteinas.";
        }
        return nutriente;
    }
    
    
    
   }

   





