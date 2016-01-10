
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
        carbohidratos = carbohidratos + comida.getCarbohidratos() * factor;
        grasas = grasas + comida.getGrasas()*factor;
        calorias = calorias + comida.sumaCalorias()* factor   ;
    }

    /**
     * Mt para mostrar por pantalla los datos; !!!!!!! SIN TERMINAR LA MUESTRA POR PANTALLA DE LOS PORCENTAJES.  !!!!!!!!!!!!!!!!!!!!!
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

    //     /**
    //      * Mt para mostrar por pantalla los datos
    //      */
    //     public void mostrarDatos(){
    //         System.out.println("");
    //         System.out.println("");
    //         System.out.println("Nombre:                         " +nombreUs);
    //         System.out.println("");
    //         System.out.println("Gramos totales de proteinas ingeridos:       " +proteinas   );
    //         System.out.println("Gramos totales de carbohidratos ingeridos:   " +carbohidratos   );
    //         System.out.println("Gramos totales de grasas ingeridos:          " +grasas  );
    //         System.out.println("Total de calorias:              " +calorias);
    //         //System.out.println("Macronutriente/s mayoritario/s: " +nutrienteMayor());
    // 
    //     }

}


