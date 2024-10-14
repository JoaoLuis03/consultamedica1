package br.com.joaoluis.medicalconsult.consulta.repository;

import br.com.joaoluis.medicalconsult.consulta.domain.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
