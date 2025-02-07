package dev.niltonf.agendamento.api_notificacao.infrastructure.repositories.dto;

import java.time.LocalDateTime;

public record AgendamentoRequestDto(String email,
                                    String contacto,
                                    String mensagem


) {
}
