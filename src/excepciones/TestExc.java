package excepciones;

public class TestExc {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try{ //dentro del bloque try se pone el codigo que posiblement arrojara la excepcion
            int div = num1 / num2;
            System.out.println("division" + div);

        } catch (Exception e){ //dentro del bloque catch se atrapa la excepcion e imprimimos un mensaje
            System.out.println("Error en division: " + e);
        } finally { //el uso de finally es mayormente utilizado en conexiones con bases de datos

        }
    }
}
    //Assuming we are receiving an array with duplicated numbers, we need to implement a function that returns the same array with no duplicated values
      //  Input ==> [5, 8, 9, 9, 30, 30, 30, 80, 100, 100, 101, 120, 120, 120]
        //Output ==> [5, 8, 9, 30, 80, 100, 101, 120]
