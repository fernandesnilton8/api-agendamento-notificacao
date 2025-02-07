package dev.niltonf.agendamento.api_notificacao.infrastructure.entities;

import dev.niltonf.agendamento.api_notificacao.infrastructure.enums.StatusNotificacaoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "agendamento")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String contacto;
    private String mensagem;
    private StatusNotificacaoEnum statusNotificacao;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataHoraModificacao;


    @PrePersist
    private void iniciliza(){
        dataHoraAgendamento = LocalDateTime.now();
        statusNotificacao = StatusNotificacaoEnum.AGENDADO;

    }



}
