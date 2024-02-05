package zyt.pashwamroo.enquetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyt.pashwamroo.enquetes.dao.EnqueteInternetDao;
import zyt.pashwamroo.enquetes.service.EnqueteInternetService;

@RestController
@RequestMapping("/api")
public class EnqueteInternetRestController {

    private final EnqueteInternetService enqueteInternetService;
    private final EnqueteInternetDao enqueteInternetDao;

    public EnqueteInternetRestController(EnqueteInternetService enqueteInternetService,
                                         EnqueteInternetDao enqueteInternetDao) {
         this.enqueteInternetService = enqueteInternetService;
         this.enqueteInternetDao = enqueteInternetDao;
    }
}
