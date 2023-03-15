package com.example.hakatonProgect.repository;

import com.example.hakatonProgect.entity.Maderator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaderatorRepository extends JpaRepository<Maderator, Long> {
}
