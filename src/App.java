
import Models.Persona;
import Controllers.PersonaController;
import Views.ViewsConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
                new Persona("Juan", 25),
                new Persona("Maria", 30),
                new Persona("Carlos", 22),
                new Persona("Ana", 28),
                new Persona("Luis", 35),
                new Persona("Sofia", 27),
                new Persona("Miguel", 40),
                new Persona("Laura", 32),
                new Persona("Pedro", 29),
                new Persona("Elena", 26),
        };

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

        PersonaController pC = new PersonaController();
        ViewsConsole vC = new ViewsConsole();
        vC.printMessage("Arreglo personas");
        vC.printPersonaArray(personas);
        vC.printMessage("\nArreglo Ordenado ordenado");
        pC.ordenarPorEdad(personas);
        vC.printPersonaArray(personas);
        pC.buscarPorEdad(personas, 40);
        
        vC.printMessage("Buscar persona con edad 40");
        Persona personaBuscada = pC.buscarPorEdad(personas, 40);
        if (personaBuscada == null) {
            vC.printMessage("No se encontró la persona con la edad 40.");
        } else {
            vC.printMessage("Se encontro la persona con edad 40");
            vC.printMessage(personaBuscada.toString());
        }

        vC.printMessage("Buscar persona con edad 90");
        Persona personaBuscadaDos = pC.buscarPorEdad(personas, 99);
        if (personaBuscadaDos == null) {
            vC.printMessage("No se encontró la persona con la edad especificada.");
        } else {
            vC.printMessage("Persona encontrada: " + personaBuscadaDos.toString());
        }
   // 8. Imprimir resultado de busqueda y la persona si se encuentro
    }
}



