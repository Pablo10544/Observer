package test.java;

import main.Aeroporto;
import main.Aviao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AeroportoTest {

    private Aviao aviao;
    private Aeroporto aeroporto;

    @BeforeEach
    void setUp() {
        // Inicializa um objeto fresh para cada teste
        aviao = new Aviao("AirBus A320");
        aeroporto = new Aeroporto("Aeroporto de Guarulhos",aviao);
    }


    @Test
    void deveSernotificado() {
    aviao.setVoando(true);
    assertEquals("AirBus A320 mudou para o estado voando",aeroporto.getStatusAvioes());
    }

}