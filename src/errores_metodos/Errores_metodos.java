
package errores_metodos;
import static java.lang.Math.abs;
import java.util.Scanner;

public class Errores_metodos {

    
    public static void main(String[] args) {
        //main o menu principal
       Scanner Tecla = new Scanner(System.in);
       int valor1,valor2;
       System.out.println("Coloque el valor real:");
       valor1=Tecla.nextInt();
       System.out.println("Coloque el valor aproximado:");
       valor2=Tecla.nextInt();
       Error Er = new Error(valor1, valor2);
       System.out.println("************************************************************************");
       System.out.println("El valor de error donde es "+valor1+" como valor real y "+valor2+" como valor aproximado");
       System.out.println("El error absoluto es: "+Er.ErrorAso());
       System.out.println("El error relativo es: "+Er.ErrorRel());
       System.out.println("El error Relativo Porcentual es: "+Er.ErrorPorce()+"%");
    }
    
 //Constructor 
}
class Error{
    private int ValorReal, ValorAproximado;
    double E,E_abs,ER,ER_Abs,ERP,ERP_Abs;
    
    public Error (int valor1, int valor2){
    ValorReal = valor1;
    ValorAproximado = valor2;
}
    public double ErrorAso(){
        E=(ValorReal - ValorAproximado);
        E_abs = abs(E);
        return ER_Abs;
    }
    public double ErrorRel(){
        ER=E/ValorReal;
        ER_Abs=abs(ER);
        return ER_Abs;
    }
    public double ErrorPorce(){
        ERP=ER*100;
        ERP_Abs = abs(ERP);
        return ERP_Abs;
    }
    
}
