/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package calculadora;

 
/**
 *
 * @author gaapl
 */
public class Internet {
    
     private double nume1;
    private double nume2;
    private double nume3;
    

    // Metodos getters and setters
    
    public double getNume1() {
        return nume1;
    }

    public void setNume1(double nume1) {
        this.nume1 = nume1;
    }

    public double getNume2() {
        return nume2;
    }

    public void setNume2(double nume2) {
        this.nume2 = nume2;
    }

    public double getNume3() {
        return nume3;
    }

    public void setNume3(double nume3) {
        this.nume3 = nume3;
    }
    
   
    
    public Internet(double num1, double num2, double num3){
        
        this.nume1 = num1;
        this.nume2 = num2;
        this.nume3 = num3;
        
    }
    
    
   
    
    
    public void raizCuadrada(double val1, double val2 ){
        
        this.nume1 = val1;
        this.nume2 = val2;
        
        nume3 = Math.sqrt(val1+val2);
        
        
    }
    
     
    public void raizCuadrada(double val1){
        
        this.nume1 = val1;
         
        nume3 = Math.sqrt(val1);
        
        
    }
    public double RetornarRaizCuadrada(){
        
        return nume3;
    }
    

    
    
     public static void MiTexto(){// Metodo de la case. De tipo static
        
            System.out.println
        ("Este es el  reporte de las noticias. Todo está bien, repito, todo esta bien");
        
    }
    
}
