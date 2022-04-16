package br.com.projetovendas.domain.repository;

import br.com.projetovendas.domain.entity.OrderedItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedItemRepository extends JpaRepository<OrderedItemEntity, Integer> {

}
