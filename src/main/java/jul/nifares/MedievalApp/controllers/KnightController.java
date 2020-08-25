package jul.nifares.MedievalApp.controllers;

import jul.nifares.MedievalApp.domain.Knight;
import jul.nifares.MedievalApp.domain.repository.KnightRepository;
import jul.nifares.MedievalApp.services.KnightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KnightController {

    @Autowired
    KnightService knightService;

        @RequestMapping("/knights")
        public String showKnights(Model model){
           List<Knight> allKnights = knightService.getAllKnights();
           model.addAttribute("knights", allKnights);
        return "knights";
        }
    }

