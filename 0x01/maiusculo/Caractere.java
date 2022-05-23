public class Caractere {

    public static boolean EhMaiusculo(char c) {
        boolean validar;
        String entrada = Character.toString(c);
        String maiusculo = entrada.toUpperCase();   
        if (entrada.equals(maiusculo)) {
            validar = true;
        } else {
            validar = false;
        }
        return validar;
    }
    
}
