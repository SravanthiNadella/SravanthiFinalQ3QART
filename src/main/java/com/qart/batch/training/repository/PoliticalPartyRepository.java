package com.qart.batch.training.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.qart.batch.training.PoliticalParty;
@Repository
public interface PoliticalPartyRepository extends JpaRepository<PoliticalParty, Long> {
}
