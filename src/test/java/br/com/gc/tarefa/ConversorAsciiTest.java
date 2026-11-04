package br.com.gc.tarefa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorAsciiTest {

    @Test
    public void testeTextoParaAscii() {
        ConversorAscii conversor = new ConversorAscii();
        String esperado = "71 69 77 73 78 73";
        String resultado = conversor.textoParaAscii("GEMINI");
        assertEquals(esperado, resultado);
    }

    @Test
    public void testeAsciiParaTexto() {
        ConversorAscii conversor = new ConversorAscii();
        String esperado = "GEMINI";
        String resultado = conversor.asciiParaTexto("71 69 77 73 78 73");
        assertEquals(esperado, resultado);
    }
}