package zyt.pashwamroo.enquetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyt.pashwamroo.enquetes.dao.EnqueteTelephoniqueDao;
import zyt.pashwamroo.enquetes.service.EnqueteTelephoniqueService;

@RestController
@RequestMapping("/api")
public class EnqueteTelephoniqueRestController {

    private final EnqueteTelephoniqueService enqueteTelephoniqueService;
    private final EnqueteTelephoniqueDao enqueteTelephoniqueDao;

    public EnqueteTelephoniqueRestController(
            EnqueteTelephoniqueService enqueteTelephoniqueService,
            EnqueteTelephoniqueDao enqueteTelephoniqueDao
    ) {
        this.enqueteTelephoniqueService = enqueteTelephoniqueService;
        this.enqueteTelephoniqueDao = enqueteTelephoniqueDao;
    }
}
