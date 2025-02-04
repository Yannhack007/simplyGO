package group.sig.projet.Repositories;

import group.sig.projet.Models.CentreVote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CentreRepository extends CrudRepository<CentreVote, UUID> {
}
