public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        persona.setEdad(38);
        persona.setNombre("Ariel");
        persona.setTelefono(1102230103);
        
        System.out.println("Edad:" + " " + persona.getEdad());
        System.out.println("Nombre:" + " " + persona.getNombre());
        System.out.println("Telefono:" + " " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
}
