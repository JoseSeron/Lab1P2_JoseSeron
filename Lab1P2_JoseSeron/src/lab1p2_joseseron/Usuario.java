
package lab1p2_joseseron;

import java.util.Date;

/**
 *
 * @author Jose Seron
 */
public class Usuario {
    
    String nombre, apellido, correo, contraseña;
    Date fechaNacimiento;

    public Usuario(String nombre, String apellido, String correo, String contraseña, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
  //      return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", fechaNacimiento=" + fechaNacimiento + '}';
        return "Usuario: "+nombre+" "+apellido+"; Correo: "+correo+"; Contraseña: "+contraseña+"; Fecha de Nacimiento: "+fechaNacimiento;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
}
