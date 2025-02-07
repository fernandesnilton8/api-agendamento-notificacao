package dev.niltonf.agendamento.api_notificacao.controller.dto;

import dev.niltonf.agendamento.api_notificacao.infrastructure.enums.StatusNotificacaoEnum;

public record AgendamentoResponseDto(Long id,
                                     String email,
                                     String contacto,
                                     String mensagem,
                                     StatusNotificacaoEnum estado) {
}
