package br.com.gc.tarefa;

public class ConversorAscii {
            
    public String textoParaAscii(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        StringBuilder ascii = new StringBuilder();
        for (char letra : texto.toCharArray()) {
            ascii.append((int) letra).append(" ");
        }
        return ascii.toString().trim();
    }

    public String asciiParaTexto(String textoAscii) {
        if (textoAscii == null || textoAscii.isEmpty()) return "";
        StringBuilder texto = new StringBuilder();
        String[] numeros = textoAscii.split(" ");
        for (String numero : numeros) {
            texto.append((char) Integer.parseInt(numero));
        }
        return texto.toString();
    }
}