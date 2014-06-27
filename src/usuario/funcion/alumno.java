/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario.funcion;

/**
 *
 * @author WINDOWS 7
 */
public class alumno 
{
    private String nombre,apellido,ciudad;
    private int cedula,edad;
    
    public String obtenerNombre()
    {
        return nombre;
    }
    public void actualizarNombre(String Nombre)
    {
        nombre = Nombre  ;
    }
    
    public String ObtenerApellido()
           {
           return apellido;
           } 
    public void actualizarApellido(String Apellido)
    {
        apellido=Apellido;
    }
    
    public String ObtenerCiudad()
           {
           return ciudad;
           } 
    public void actualizarCiudad(String Ciudad)
    {
        ciudad=Ciudad;
    }
    
    public int ObtenerCedula()
           {
           return cedula;
           } 
    public void actualizarCedula(int Cedula)
    {
        cedula=Cedula;
    }
    
    public int ObtenerEdad()
           {
           return edad;
           } 
    public void actualizarEdad(int Edad)
    {
        edad=Edad;
    }
    
}
