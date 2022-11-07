package com.blockchain.assessment.sources.questionaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionaireRepository extends JpaRepository<Questionaire, Long>{
	
	
}
