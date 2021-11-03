import java.util.Scanner;

public class Programausuario {
    public static void main(String[] args) {
                        /* Activación del scaner para la lectura por teclado y ejecución */
        Scanner sc= new Scanner(System.in);
        boolean error= false;
        Usuario usuario1;
        usuario1= new Usuario();
        System.out.print("Por favor, escriba sus Nombres ");
        String nombres= sc.nextLine();
        System.out.print("Por favor, escriba sus Apellidos ");
        String apellidos= sc.nextLine();
                        /* Evita el error de colocar una edad en tipo de dato no válido */
        do {
            try {
                System.out.print("Por favor, escriba su edad (en número entero) ");
                int edad = sc.nextInt();
                usuario1.edad= edad;
                sc.nextLine();
                error = true;
            } catch (Exception exc) {
                System.out.println("Por favor un número entero");
                error = false;
                sc.nextLine();
            }
        } while (!error);
        System.out.print("Por favor, escriba su Hobbie ");
        String hobbie= sc.nextLine();
        System.out.print("Por favor, escriba su editor de código favorito ");
        String editorPreference= sc.nextLine();
        System.out.print("Por favor, escriba su Sistema Operativo favorito ");
        String systemOperativoUse = sc.nextLine();
                        /* Usuario usando un método constructor */
        Usuario usuario2;
        usuario2= new Usuario("Carlos","Ramirez Suarez",32,"Cine","Netbeams","Windows");
        System.out.println("\nSe imprime un ejemplo, aplicado con un constructor distinto probando la clase Usuario");
        System.out.println(usuario2);
                        /* Usuario usando otro método constructor */
        System.out.println("\nSe imprime lo solicitado en la actividad, aplicado con un constructor diferente probando la clase Usuario");
        usuario1.nombres= nombres;
        usuario1.apellidos= apellidos;
        usuario1.hobbie= hobbie;
        usuario1.editorPreference= editorPreference;
        usuario1.systemOperativoUse= systemOperativoUse;
        System.out.println(usuario1);
    }
}