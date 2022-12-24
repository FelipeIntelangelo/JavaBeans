package test;

import domain.*;

public class TestJavaBean {
    public static void main(String[] args) {
        PersonaBean persona1 = new PersonaBean();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");
        
        
        System.out.println("persona1 = " + persona1);
        
        System.out.println("Persona nombre: " + persona1.getNombre() + 
                "\nPersona Apellido: "+ persona1.getApellido());
    }
}
