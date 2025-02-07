package dev.niltonf.agendamento.api_notificacao.business.services;

import dev.niltonf.agendamento.api_notificacao.controller.dto.AgendamentoRequestDto;
import dev.niltonf.agendamento.api_notificacao.controller.dto.AgendamentoResponseDto;
import dev.niltonf.agendamento.api_notificacao.infrastructure.entities.Agendamento;
import dev.niltonf.agendamento.api_notificacao.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service

public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoService(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    public AgendamentoResponseDto gravaAgendamento(AgendamentoRequestDto requestDto){

        Agendamento agendamentoRequest = new Agendamento(requestDto);

        Agendamento agendamento = agendamentoRepository.save(agendamentoRequest);

        return new AgendamentoResponseDto(agendamento.getId(),
                                            agendamento.getEmail(),
                                            agendamento.getContacto(),
                                            agendamento.getMensagem(),
                                            agendamento.getStatusNotificacao()
        );



    }


}
