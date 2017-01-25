/*
El siguiente programa gestiona el funcionamiento de una calculadora con las opera
ciones básicas. El objetivo de este código es compilar la mayor cantidad de conceptos
de programación orientada  a objetos.

Lista de conceptos utilizados hasta el momento:

- Instanciación de un objeto
- Uso de la palabra this
- Creacion de un constructor
- Argumentos y parámetros
- Métodos getters y setters
- Uso de final
- Uso de variables static
- Uso de metodos static
- Sobrecarga de constructores
-Sobrecarga de metodos

Ultima modificacion  25-1-2017
cycarrenol@unal.edu.co
*/
package calculadora;

/**
 *
 * @author gaapl
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Operaciones objOperaciones = new Operaciones(40,10,0);/* Se instancia el 
        objeto de la clase operaciones, el cual tiene 2 argumentos de tipo entero.
        */
        
         System.out.println("Los valores iniciales del numero 1 y 2 son: "
                + objOperaciones.getnumero1()+" y "+objOperaciones.getnumero2());
        
      
        objOperaciones.setnumero1(4500);// Asigna un nuevo valor a  numero1
        objOperaciones.setnumero2(700);
        
         System.out.println("Los nuevos valores del numero 1 y 2 son: "
                + objOperaciones.getnumero1()+" y "+objOperaciones.getnumero2());
        
         
         objOperaciones.SumarDosNumeros();
        
        System.out.println("La suma de los dos numeros es: "
                 +objOperaciones.EnviarSumarDosNumeros());
         
         
       objOperaciones.calcularAreaDeCirculo(4);
       
           System.out.println("El area del circulo es: "
                 +objOperaciones.enviarcalcularAreaDeCirculo());
         
        
        objOperaciones.determinarValorAbsoluto(-4);
        System.out.println("El valor absoluto encontrado es:"
                +Operaciones.valorAbsoluto);// Uso de la variable static
        
        Internet.MiTexto();// Llamando al método static, por medio de  la propia clase
        
        
        Operaciones objOperaciones2 = new Operaciones(4000);  
        // Se instancia un nuevo objeto de la clase Operaciones, 
        //asignando un valor inicial al constructor que tenga solo un parametro
        
        System.out.println("El numero1 en el constructor 2 es: "
        +objOperaciones2.getnumero1());
        // funcionamiento del llamado a la variable inicializada en el constructor 
        //sobrecargado.
        
        
        Internet ObjetoWeb = new Internet(0,0,0);
        
        ObjetoWeb.raizCuadrada(10, 20);
        
        System.out.println("La  raiz cuadrada de la suma de 2 numeros es: "
                +ObjetoWeb.RetornarRaizCuadrada());
        
        
        
        ObjetoWeb.raizCuadrada(2);
        
        System.out.println("La raiz cuadra de un solo numero es: "
                +ObjetoWeb.RetornarRaizCuadrada());

        
        
        
        
        
    }   
    
}
