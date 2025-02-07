package dev.niltonf.agendamento.api_notificacao.infrastructure.entities;

import dev.niltonf.agendamento.api_notificacao.controller.dto.AgendamentoRequestDto;
import dev.niltonf.agendamento.api_notificacao.infrastructure.enums.StatusNotificacaoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "agendamento")
@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String contacto;
    private String mensagem;
    //@Enumerated(EnumType.STRING) // Salva como texto no banco
    private StatusNotificacaoEnum statusNotificacao;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataHoraModificacao;

    public Agendamento() {

        this.dataHoraAgendamento = LocalDateTime.now();
        this.statusNotificacao = StatusNotificacaoEnum.AGENDADO;
    }

    public Agendamento(AgendamentoRequestDto requestDto) {
        this.dataHoraAgendamento = LocalDateTime.now();
        this.statusNotificacao = StatusNotificacaoEnum.AGENDADO;
        this.email = requestDto.email();
        this.contacto = requestDto.contacto();
        this.mensagem = requestDto.mensagem();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public StatusNotificacaoEnum getStatusNotificacao() {
        return statusNotificacao;
    }

    public void setStatusNotificacao(StatusNotificacaoEnum statusNotificacao) {
        this.statusNotificacao = statusNotificacao;
    }

    public LocalDateTime getDataHoraAgendamento() {
        return dataHoraAgendamento;
    }

    public void setDataHoraAgendamento(LocalDateTime dataHoraAgendamento) {
        this.dataHoraAgendamento = dataHoraAgendamento;
    }

    public LocalDateTime getDataHoraModificacao() {
        return dataHoraModificacao;
    }

    public void setDataHoraModificacao(LocalDateTime dataHoraModificacao) {
        this.dataHoraModificacao = dataHoraModificacao;
    }
}
