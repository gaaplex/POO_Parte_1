 //clase que gestiona las operaciones aritméticas de la calculadora
//ultima modificacion  23 de enero del 2017

package calculadora;

/**
 *
 * @author gaapl
 */

public class Operaciones {
    
    private double numero1;
    private double numero2;
    private double total;
    public final double pi = 3.1415;// Uso de la palabra reserv final
    public static double valorAbsoluto;// Uso de un campo de clase de tipo static
    
    
    public Operaciones(double numero1, double numero2, double Total){/* Constructor de la clase
     Operaciones, el cual tiene 2 parámetros de tipo entero.   
        */
        this.numero1= numero1;// Uso de this
        this.numero2= numero2;
        this.total = Total;
        
    }
    
    public Operaciones(double numOne){// Sobrecarga de constructor.Este constructor solo
        //Recibe un argumento de tipo double.
        
        this.numero1 = numOne;
        
    }
    
    
    
// ***** Metodos getters and setters *****
    
  public void setnumero1(double number1){// Metodo seter para modificar numero1
      
      this.numero1 = number1;
      
  }
    
    public void setnumero2(double number2){
      
      this.numero2 = number2;
      
  }
    
    public double getnumero1(){// metodo getter para enviar el numero1
        
        return numero1;
        
    }
    public double getnumero2(){
        
        
        return numero2;
        
    }
    
 // ***** Metodos getters and setters *****

    
    public void  SumarDosNumeros(){/* Metodo  para sumar 2 numeros y asignarlo a
   a una  tercera variable total      
    */
        
        
        total = numero1 + numero2;
        
    }
    
    public double EnviarSumarDosNumeros(){//retorna el total de la suma
        
        return total;
    }
      
    
    
    public void calcularAreaDeCirculo(double num1){
        
        this.numero1 = num1;
        total = 300;
        total = pi*Math.pow(numero1, 2);
        
    }
    
    public double enviarcalcularAreaDeCirculo(){
        
        return total;
        
    }
    
    
     
    public void establecerValorAbsoluto(int val){
    
    this.numero1 = val;
        
    
}
    
       
    public void determinarValorAbsoluto(int val){
    
    valorAbsoluto = Math.abs(numero1);
    
     
}
    
    
    
    
    

  
}
