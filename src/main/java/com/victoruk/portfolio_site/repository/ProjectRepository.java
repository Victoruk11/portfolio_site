package com.victoruk.portfolio_site.repository;

import com.victoruk.portfolio_site.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
