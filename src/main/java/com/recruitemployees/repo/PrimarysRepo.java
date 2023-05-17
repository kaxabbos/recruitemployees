package com.recruitemployees.repo;

import com.recruitemployees.model.Primarys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimarysRepo extends JpaRepository<Primarys, Long> {
}
