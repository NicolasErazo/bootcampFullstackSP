/*
* Nicolas Erazo Arce
* Mini Reto
*/

import java.util.ArrayList;

public class Challenge1 {

    /*
     * a. Crear un método que genere y retorne una cadena de texto (String) de forma
     * aleatoria con una longitud igual a 10 caracteres, y que serán únicamente
     * números (0-9), por ejemplo “3845346790”. El método tendrá como entrada
     * un valor tipo texto. La cadena de texto que se retorna tendrá las siguientes
     * dos condiciones:
     * i. Si el valor de entrada es igual a “Tipo A” la cadena de texto deberá
     * iniciar en “54”
     * ii. Si el valor de entrada es igual a “Tipo B” la cadena de texto deberá
     * iniciar en “08”
     */

    public static String cadenaAleatoria(String Tipo) {

        String banco = "1234567890";
        String cadena = "";
        int longitud = 8;

        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = (int) (Math.random() * 10);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }

        switch (Tipo) {
            case "Tipo A":
                cadena = "54" + cadena.substring(0, 8);
                break;
            case "Tipo B":
                cadena = "08" + cadena.substring(0, 8);
                break;
        }

        return cadena;
    }

    /*
     * b. Crear un método que tenga como entrada un valor tipo String y una lista de
     * cadena List<String>. El método devuelve un valor de tipo booleano. El
     * método verifica si el valor tipo String está contenido en la lista, si el
     * valor se
     * encuentra dentro de la lista deberá devolver un valor false, de lo contrario
     * retorna un valor true.
     */

    public static boolean IndexLista(String Frase, ArrayList<String> Lista) {

        boolean Result = Lista.contains(Frase);

        if (Result) {
            Result = false;
        } else {
            Result = true;
        }

        return Result;
    }

    public static void main(String[] args) {

        // Tipo A: Inicia en 54 y Tipo B: Inicia en 08
        System.out.println(cadenaAleatoria("Tipo B"));

        // Falso si esta en la lista, verdadero si no esta!
        ArrayList<String> Ejemplo = new ArrayList<>();

        Ejemplo.add("A");
        Ejemplo.add("B");
        Ejemplo.add("C");

        System.out.println(IndexLista("D", Ejemplo));

    }
}