package com.qart.batch.training.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.qart.batch.training.PoliticalLeader;
@Repository
public interface PoliticalLeaderRepository extends JpaRepository<PoliticalLeader, Long> {
	List<PoliticalLeader> findByPoliticalPartyId(Long politicalPartyId);
}
