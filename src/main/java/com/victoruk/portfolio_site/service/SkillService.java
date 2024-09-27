package com.victoruk.portfolio_site.service;

import com.victoruk.portfolio_site.dto.SkillDTO;
import com.victoruk.portfolio_site.entity.Skill;
import com.victoruk.portfolio_site.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public List<SkillDTO> getAllSkills() {
        List<Skill> skills = skillRepository.findAll();
        return skills.stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
    }

    public SkillDTO createSkill(SkillDTO skillDTO) {
        Skill skill = convertToEntity(skillDTO);
        skillRepository.save(skill);
        return convertToDTO(skill);
    }

    private SkillDTO convertToDTO(Skill skill) {
        // Mapping logic here
    }

    private Skill convertToEntity(SkillDTO skillDTO) {
        // Mapping logic here
    }
}
