package zyt.pashwamroo.enquetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyt.pashwamroo.enquetes.dao.ThemeDao;
import zyt.pashwamroo.enquetes.service.ThemeService;

@RestController
@RequestMapping("/api")
public class ThemeRestController {
    private final ThemeService themeService;
    private final ThemeDao themeDao;

    public ThemeRestController(ThemeService themeService, ThemeDao themeDao) {
        this.themeService = themeService;
        this.themeDao = themeDao;
    }
}
