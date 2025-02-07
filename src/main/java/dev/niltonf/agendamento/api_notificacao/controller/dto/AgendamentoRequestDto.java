package dev.niltonf.agendamento.api_notificacao.controller.dto;

public record AgendamentoRequestDto(String email,
                                    String contacto,
                                    String mensagem
) {
}
