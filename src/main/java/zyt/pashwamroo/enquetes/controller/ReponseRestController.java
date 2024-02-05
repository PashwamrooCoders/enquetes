package zyt.pashwamroo.enquetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyt.pashwamroo.enquetes.dao.ReponseDao;
import zyt.pashwamroo.enquetes.service.ReponseService;

@RestController
@RequestMapping("/api")
public class ReponseRestController {
    private final ReponseService reponseService;
    private final ReponseDao reponseDao;

    public ReponseRestController(ReponseService reponseService, ReponseDao reponseDao) {
        this.reponseService = reponseService;
        this.reponseDao = reponseDao;
    }
}
