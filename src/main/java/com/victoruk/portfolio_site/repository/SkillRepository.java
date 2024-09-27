package com.victoruk.portfolio_site.repository;

import com.victoruk.portfolio_site.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
