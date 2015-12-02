/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

/**
 *
 * @author usuario
 */
public class Person1 {
    
    private final Integer id;
    private final String name;
    private final String genero;
    private final String fechaNacimiento;
    private final Float peso;
    private final String mail;

    public Person1(Integer id, String name, String genero, String fechaNacimiento, Float peso, String mail) {
        this.id = id;
        this.name = name;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.mail = mail;
    }

    Person1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Float getPeso() {
        return peso;
    }

    public String getMail() {
        return mail;
    }
    
    
    
}
