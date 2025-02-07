package dev.niltonf.agendamento.api_notificacao.controller;

import dev.niltonf.agendamento.api_notificacao.business.services.AgendamentoService;
import dev.niltonf.agendamento.api_notificacao.controller.dto.AgendamentoRequestDto;
import dev.niltonf.agendamento.api_notificacao.controller.dto.AgendamentoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    public AgendamentoController(AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }

    @PostMapping
    public ResponseEntity<AgendamentoResponseDto> gravaAgendamento(@RequestBody AgendamentoRequestDto requestDto){

        return ResponseEntity.ok(agendamentoService.gravaAgendamento(requestDto));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<AgendamentoResponseDto> getAgendaemento(@PathVariable("id") Long id){

        return ResponseEntity.ok(agendamentoService.getAgendamento(id));
    }
}
