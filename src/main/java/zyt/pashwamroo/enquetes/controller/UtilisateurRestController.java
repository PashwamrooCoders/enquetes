package zyt.pashwamroo.enquetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyt.pashwamroo.enquetes.dao.UtilisateurDao;
import zyt.pashwamroo.enquetes.service.UtilisateurService;

@RestController
@RequestMapping("/api")
public class UtilisateurRestController {

    private final UtilisateurService utilisateurService;
    private final UtilisateurDao utilisateurDao;

    public UtilisateurRestController(UtilisateurService utilisateurService, UtilisateurDao utilisateurDao) {
        this.utilisateurService = utilisateurService;
        this.utilisateurDao = utilisateurDao;
    }
}
