package br.com.projetovendas.domain.repository;

import br.com.projetovendas.domain.entity.OrderedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedRepository extends JpaRepository<OrderedEntity, Integer> {
}
