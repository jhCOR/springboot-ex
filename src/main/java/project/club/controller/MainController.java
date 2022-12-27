package project.club.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import project.club.security.dto.ClubAuthMemberDTO;
import org.springframework.ui.Model;
import lombok.Getter;

@Getter
@Controller
@RequestMapping("/test/")
public class MainController {
    private static final Logger LOGGER = LogManager.getLogger(MainController.class);
    
    @GetMapping("/all")
    public void exAll(){
        LOGGER.info("exAll..........");
    }

//    @GetMapping("/member")
//    public void exMember(){
//        log.info("exMember..........");
//    }

    @GetMapping("/admin")
    public void exAdmin(){
        LOGGER.info("exAdmin..........");
    }

    @GetMapping("/member")
    public void exMember(@AuthenticationPrincipal ClubAuthMemberDTO clubAuthMember, Model model ){

        LOGGER.info("exMember..........");

        LOGGER.info("-------------------------------");
        model.addAttribute("result", clubAuthMember);
    }
}
