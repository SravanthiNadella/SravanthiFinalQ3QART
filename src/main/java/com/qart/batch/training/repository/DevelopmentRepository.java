package com.qart.batch.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.qart.batch.training.entity.Development;
@Repository
public interface DevelopmentRepository extends JpaRepository<Development, Long> {
   List<Development> findByPoliticalLeaderId(Long politicalLeaderId);
}
