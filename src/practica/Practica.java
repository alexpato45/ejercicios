/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package practica;
import javax.swing.*;
import usuario.funcion.alumno;

/**
 *
 * @author WINDOWS 7
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        alumno objalum = new alumno();
        alumno objalum2 = new alumno();
        objalum.actualizarNombre("Javier");
        objalum.actualizarApellido("Cedeño");
        objalum.actualizarCiudad("Manta");
        objalum.actualizarEdad(21);
        objalum.actualizarCedula(1311229312);
        
//        objalum2.actualizarNombre("javier"); //segundo objeto 
//        objalum2.actualizarApellido("cedeño");
//        objalum2.actualizarCiudad("manta");
//        objalum2.actualizarEdad(21);
//        objalum2.actualizarCedula(1311229312);
//        System.out.printf("yo. %s ", objalum2.obtenerNombre());
        
        System.out.printf("Sus datos son:\n Nombre: %s \n Apellido:"
                + " %s \n Cédula: %d \n Edad: %d \n Ciudad:  %s"  // el %s es pra datos de tipo cadena y el %d para decimales \\
                ,objalum.obtenerNombre(),objalum.ObtenerApellido()
                ,objalum.ObtenerCedula(), objalum.ObtenerEdad()
                ,objalum.ObtenerCiudad() );
//        tablaMultiplicar(4);
    }

    public static void tablaMultiplicar(int valor) 
    {
        int i;
        for (i = 1; i <= 12; i++) {
            System.out.printf("%d * %d = %d \n", valor, i, valor * i);
        }

    }

}
