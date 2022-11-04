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

    public static String randomString(String type) {

        String bank = "1234567890";
        String string = "";
        int length = 8;

        for (int x = 0; x < length; x++) {
            int randomIndex = (int) (Math.random() * 10);
            char randomCharacter = bank.charAt(randomIndex);
            string += randomCharacter;
        }

        switch (type) {
            case "Tipo A":
                string = "54" + string.substring(0, 8);
                break;
            case "Tipo B":
                string = "08" + string.substring(0, 8);
                break;
        }

        return string;
    }

    /*
     * b. Crear un método que tenga como entrada un valor tipo String y una lista de
     * cadena List<String>. El método devuelve un valor de tipo booleano. El
     * método verifica si el valor tipo String está contenido en la lista, si el
     * valor se
     * encuentra dentro de la lista deberá devolver un valor false, de lo contrario
     * retorna un valor true.
     */

    public static boolean indexLista(String phrase, ArrayList<String> list) {

        boolean result = list.contains(phrase);

        if (result) {
            result = false;
        } else {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {

        // Tipo A: Inicia en 54 y Tipo B: Inicia en 08
        System.out.println(randomString("Tipo A"));

        // Falso si esta en la lista, verdadero si no esta!
        ArrayList<String> example = new ArrayList<>();

        example.add("A");
        example.add("B");
        example.add("C");

        System.out.println(indexLista("A", example));

    }
}