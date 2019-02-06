package metube.repository;

import metube.domain.enitities.Tube;

import java.util.Optional;

public interface TubeRepository extends GenericRepository<Tube, String> {

    Optional<Tube> findByName(String name);
}
