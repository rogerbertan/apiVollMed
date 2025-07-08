package med.voll.api.domain.consulta;

import med.voll.api.domain.ValidacaoException;

public enum MotivoCancelamento {
    PACIENTE_DESISTIU("paciente desistiu"),
    MEDICO_CANCELOU("medico cancelou"),
    OUTROS("outros");

    private String portugues;

    MotivoCancelamento(String portugues) {
        this.portugues = portugues;
    }

    public static MotivoCancelamento fromPortugues(String text) {
        for (MotivoCancelamento motivo : MotivoCancelamento.values()) {
            if (motivo.portugues.equalsIgnoreCase(text)) {
                return motivo;
            }
        }
        throw new ValidacaoException("Motivo de cancelamento não é válido!");
    }
}
