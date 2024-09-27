package com.victoruk.portfolio_site.controller;

import com.victoruk.portfolio_site.dto.SkillDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<SkillDTO> getAllSkills() {
        return skillService.getAllSkills();
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public SkillDTO createSkill(@RequestBody SkillDTO skillDTO) {
        return skillService.createSkill(skillDTO);
    }
}
