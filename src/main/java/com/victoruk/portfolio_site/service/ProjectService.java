package com.victoruk.portfolio_site.service;

import com.victoruk.portfolio_site.dto.ProjectDTO;
import com.victoruk.portfolio_site.entity.Project;
import com.victoruk.portfolio_site.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<ProjectDTO> getAllProjects() {
        List<Project> projects = projectRepository.findAll();
        return projects.stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
    }

    public ProjectDTO createProject(ProjectDTO projectDTO) {
        Project project = convertToEntity(projectDTO);
        projectRepository.save(project);
        return convertToDTO(project);
    }

    private ProjectDTO convertToDTO(Project project) {
        // Mapping logic here
    }

    private Project convertToEntity(ProjectDTO projectDTO) {
        // Mapping logic here
    }
}
