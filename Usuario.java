
/**
 * A partir del código final de la actividad 0289, crea una nueva clase llamada Usuario y codifica el código necesario para poder 
 * crear objetos de la clase Usuario. Estos objetos de tipo Usuario representan a personas que usan nuestra aplicación.

 *Al crear un objeto Usuario se proporciona únicamente el nombre completo de dicho usuario.

 *Los usuarios deben ser capaces de comer una cantidad variable de un alimento medida en gramos. Por ejemplo, si creamos un 
 *usuario llamado “Juan Alonso García”, este debe ser capaz de comer 350,5 gramos de pollo o 200,75 gramos de pollo o 150,2 gramos
 *de acelgas o 75,3 gramos de acelgas, etc. El método para ello se denomina comer y debe recibir dos parámetros: el alimento a 
 *comer y la cantidad en gramos del mismo que se va a comer el usuario (en ese orden).

 *Finalmente, debemos ser capaces de mostrar el estado actual de un usuario por pantalla a través de un método llamado 
 *mostrarDatos. Esto incluye el nombre del usuario, los gramos totales de proteínas, carbohidratos y grasas ingeridos y la 
 *cantidad total de calorías ingeridas hasta el momento.
 *Un ejemplo de visualización por pantalla de estos datos, recién creado el usuario, es:
 *Nombre:                                    Juan Alonso García
 *Gramos totales de proteinas ingeridos:     0.0
 *Gramos totales de carbohidratos ingeridos: 0.0
 *Gramos totales de grasas ingeridos:        0.0
 *Calorias totales ingeridas:                0.0version (a version number or a date)
 */
public class Usuario
{
    //At para guardar el nombre del usuario.
    private String nombreUs;
    // At para guardar el valor de las proteinas que el usuario lleva ingeridas.
    private float proteinas;
    // At para guardar el valor de los carbohidratos que el usuario lleva ingeridas..
    private float carbohidratos;
    // At para guardar el valor de las grasas que el usuario lleva ingeridas..
    private float grasas;
    // At para guardar el valor de las calorias que el usuario lleva ingeridas..
    private float calorias;
    // At para guardar el valor máximo  de las calorias.
    private float maxCalorias;
     // At para guardar el valor del alimento con más calorías.
    private Alimento conMasCalorias; 
     
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
        maxCalorias = 0;
        conMasCalorias = null;
    }

    /**
     * mt para proporcionar alimentos al usuario.
     */
    public void comer(Alimento comida, float gramosAl){
        float factor = gramosAl / 100;
        proteinas = proteinas + comida.getProteinas()*factor;
        carbohidratos = carbohidratos + comida.getCarbohidratos() * factor;
        grasas = grasas + comida.getGrasas()*factor;
        calorias = calorias + comida.sumaCalorias()* factor   ;
        
        if(comida.getCalorias() >= maxCalorias){
            conMasCalorias = comida;
            maxCalorias = comida.getCalorias();
        }
    }
    
    /**
     *Mt. para mostrar por pantalla el alimento con mayor nº de calorias. 
     */
    public void mostrarAlimentoConMasCalorias(){
        if(conMasCalorias != null){
            System.out.println("Alimento más calórico ingerido por este usuario hasta el momento: " +conMasCalorias.getNombreAl()+
                                    " con un total de " +conMasCalorias.getCalorias()/100+ " calorias. ");
        }
        else{
            System.out.println("No se han ingerido alimentos.");
        }
    }
    
    /**
     * Mt para recuperar el nombre del usuario.
     */
    public String getNombreUs(){
        return nombreUs;
    }
    
    public float getCalorias(){
        return calorias;
    }
    
    /**
     * Mt para mostrar por pantalla los datos del alimento ingerido por el usuario;  
     */
    public void mostrarDatos(){
        float gramosAl = proteinas + carbohidratos + grasas;
        if(calorias != 0){
            System.out.println("");
            System.out.println("");
            System.out.println("Nombre:                         " +nombreUs);
            System.out.println("");
            System.out.println("Gramos totales de proteinas ingeridos:     " +proteinas+     " (" +(proteinas/gramosAl)*100+   " %)");
            System.out.println("Gramos totales de carbohidratos ingeridos: " +carbohidratos+ " (" +(carbohidratos/gramosAl)*100+ " %)");
            System.out.println("Gramos totales de grasas ingeridos:        " +grasas+        " (" +(grasas/gramosAl)*100+ " %)");
            System.out.println("Total de calorias:              " +calorias);
        }
        else{
            System.out.println("");
            System.out.println("");
            System.out.println("Nombre:                         " +nombreUs);
            System.out.println("");
            System.out.println("Gramos totales de proteinas ingeridos:       0.0"     );
            System.out.println("Gramos totales de carbohidratos ingeridos:   0.0"    );
            System.out.println("Gramos totales de grasas ingeridos:          0.0"    );
            System.out.println("Total de calorias:                           0.0"  );
        }
    }

    /**
     * mt para comparar la ingesta de alimentos entre dos usuarios.
     */
    public void comparaIgesta(Usuario segundoUsuario){
       
        if(calorias < segundoUsuario.getCalorias()  ){
            System.out.println( segundoUsuario+ "  Ha consumido mas calorias que " +segundoUsuario.getNombreUs()+ " (" +
                                               getCalorias()+ " Frente a: " +segundoUsuario.getCalorias()+ " )");

        }
          if(calorias > segundoUsuario.getCalorias()  ){
            System.out.println( nombreUs+ " Ha consumido mas calorias que " +segundoUsuario.getNombreUs()+ " (" +
                                               getCalorias()+ " Frente a: " +segundoUsuario.getCalorias()+ " )");

        }
        else{
            System.out.println( nombreUs+ " Ha consumido las mismas calorias que " +segundoUsuario.getNombreUs());
        }
    
    }
    
    
    

}

