
package Modelos;

public class main {

    public static void main(String[] args) {
        BD database = new BD();

        Pilot a = new Pilot("Jorge", 0);

        if (database.insertarPilot(a)) {
            System.out.println("Piloto ok");

        } else {
            System.out.println("Piloto nok");
        }
        database.listarPiloto();
        database.cerrar();

        database.buscarPiloto("asas");
        database.cerrar();


        database.borrarPiloto("Jorge");
        database.listarPiloto();
        database.cerrar();

        System.out.println("Prueba commit");
    }

}
