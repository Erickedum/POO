package ForEach;
public class ejec {

    public static void main(String[] args) {
        //Aqui utilizamos un arreglo donde especificamos los datos de cada elemento.
        Persona[] personas = new Persona[4];
        personas[0] = new Persona(1, "Erick", 27, 1.74);
        personas[1] = new Persona(2, "Claudia", 24, 1.65);
        personas[2] = new Persona(3, "Astrid", 1, 0.70);
        personas[3] = new Persona(4, "Jose0", 28, 1.75);

        //El bucle ForEach se compone de: for (TipoDeVariable variable : arreglo){}
        for (Persona todos:personas) {
            System.out.println(todos);
        }
    }
}
