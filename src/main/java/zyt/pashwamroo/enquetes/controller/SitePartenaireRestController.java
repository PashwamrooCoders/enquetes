package zyt.pashwamroo.enquetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyt.pashwamroo.enquetes.dao.SitePartenaireDao;
import zyt.pashwamroo.enquetes.service.SitePartenaireService;

@RestController
@RequestMapping("/api")
public class SitePartenaireRestController {
    private final SitePartenaireService sitePartenaireService;
    private final SitePartenaireDao sitePartenaireDao;

    public SitePartenaireRestController(SitePartenaireService sitePartenaireService, SitePartenaireDao sitePartenaireDao) {
        this.sitePartenaireService = sitePartenaireService;
        this.sitePartenaireDao = sitePartenaireDao;
    }
}
