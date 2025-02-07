package dev.niltonf.agendamento.api_notificacao.infrastructure.repositories;

import dev.niltonf.agendamento.api_notificacao.infrastructure.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
