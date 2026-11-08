package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoServiceTest {

    private final NotificacaoService service = new NotificacaoService();

    @Test
    void deveEnviarEmailQuandoFormatoForValido() {
        assertTrue(service.enviarEmail("aluno@fatec.sp.gov.br", "Olá!"));
    }

    @Test
    void deveRejeitarEmailComFormatoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> service.enviarEmail("email-invalido", "Olá!"));
    }

    @Test
    void deveRejeitarEmailNulo() {
        assertThrows(IllegalArgumentException.class, () -> service.enviarEmail(null, "Olá!"));
    }
}