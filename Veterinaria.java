
import java.util.Scanner;
public class Veterinaria {
      public static void main(String  args[]){
         Scanner entra=new Scanner(System.in);
         System.out.println("Que opcion desea ver?\nPediatria\nAnalisisClinicos\nGinecologia\nInfraestructurasSanitarias\nServiciosGenerales");
         
         String seleleccion=entra.nextLine();
         double Pediatria=2000000*.20;
         double  AnalisisClinicos=2000000*.15;
         double Ginecologia=2000000*.40;
         double InfraestructurasSanitarias=2000000*.10;
         double ServiciosGenerales=2000000*.15;
          switch(seleleccion){
              case "Pediatria":
                  System.out.println("El dinero designado a esta area es de:"+Pediatria);
                  break;
              case"AnalisisClinicos":
                  System.out.println("El dinero designado a esta area es de:"+AnalisisClinicos);
                  break;
              case"Ginecologia":
                  System.out.println("El dinero designado a esta area es de:"+Ginecologia);
                  break;
              case"InfraestructurasSanitarias":
                  System.out.println("El dinero designado a esta area es de:"+InfraestructurasSanitarias);
                  break;
              case"ServiciosGenerales":
                   System.out.println("El dinero designado a esta area es de:"+ServiciosGenerales);
                  break;
              default: System.out.println("Esta opcion no es valida");
                  
                  
          }
         
    }
}

}
