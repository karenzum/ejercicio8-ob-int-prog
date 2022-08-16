public class Main {
    public static void main(String[] args) {
        //se creo el objeto persona
        Persona persona = new Persona();

        //se dieron parametros por medio de sets
        persona.setEdad(31);
        persona.setNombre("Karen");
        persona.setNumTelefono(12345);

        //se muestra por consola
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getNumTelefono());
    }
}
//Se creo la clase persona
class Persona{
    //se crearon la variables edad, nombre, telefono
    private int edad;
    private String nombre;
    private int numTelefono;
    // se crearon sets y gets
    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return this.edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }

    public void setNumTelefono (int numTelefono){
        this.numTelefono = numTelefono;
    }

    public int getNumTelefono(){
        return this.numTelefono;
    }
}