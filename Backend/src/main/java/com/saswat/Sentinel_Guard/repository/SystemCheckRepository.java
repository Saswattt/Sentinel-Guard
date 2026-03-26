package com.saswat.Sentinel_Guard.repository;

import com.saswat.Sentinel_Guard.entity.SystemCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemCheckRepository extends JpaRepository<SystemCheck, Long> {
}