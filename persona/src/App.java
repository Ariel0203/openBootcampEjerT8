public class App {
    public static void main(String[] args) throws Exception {
        Persona hombre = new Persona();
        hombre.setEdad(38);
        hombre.setNombre("Ariel");
        hombre.setTelefono(1102230103);
        
        System.out.println(hombre.getEdad());
        System.out.println(hombre.getNombre());
        System.out.println(hombre.getTelefono());

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

    }public int getTelefono(){
        return this.telefono;
    }
}
