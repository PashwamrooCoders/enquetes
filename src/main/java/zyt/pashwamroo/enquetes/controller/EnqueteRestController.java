package zyt.pashwamroo.enquetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyt.pashwamroo.enquetes.dao.EnqueteDao;
import zyt.pashwamroo.enquetes.service.EnqueteService;

@RestController
@RequestMapping("/api")
public class EnqueteRestController {
    private final EnqueteService enqueteService;
    private final EnqueteDao enqueteDao;

    public EnqueteRestController(EnqueteService enqueteService, EnqueteDao enqueteDao) {
        this.enqueteService = enqueteService;
        this.enqueteDao = enqueteDao;
    }
}
