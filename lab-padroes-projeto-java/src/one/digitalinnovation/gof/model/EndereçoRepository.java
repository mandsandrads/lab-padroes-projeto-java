package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EndereçoRepository extends CrudRepository<Cliente, Long> {
}
