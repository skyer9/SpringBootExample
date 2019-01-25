package kr.co.episode.jpa.controller;

import kr.co.episode.jpa.entity.Member;
import kr.co.episode.jpa.entity.Team;
import kr.co.episode.jpa.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private RepositoryService repositoryService;

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("title", "create your team!");
        model.addAttribute("team", new Team());
        return "form";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Team team, Model model) {
        Team entity = repositoryService.addTeam(team);
        model.addAttribute("result", entity);
        return "result";
    }

    @GetMapping("/addUser/{seq}")
    public String addUser(@PathVariable int seq, Model model) {
        Team team = repositoryService.findTeamBySeq(seq);
        model.addAttribute("title", "add user");
        model.addAttribute("team", team);
        model.addAttribute("member", new Member());
        return "addUser";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute Member member, @RequestParam int seq, Model model) {
        Member entity = repositoryService.addMember(member, seq);
        model.addAttribute("result", entity);
        return "user";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Team> teamList = repositoryService.findTeamAll();
        model.addAttribute("teamList", teamList);
        return "list";
    }
}
