package ifrn.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.eventos.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
