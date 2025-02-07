package dev.niltonf.agendamento.api_notificacao.infrastructure.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
        super(message);
    }
}
