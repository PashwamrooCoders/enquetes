package zyt.pashwamroo.enquetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyt.pashwamroo.enquetes.dao.ChoixPossibleDao;
import zyt.pashwamroo.enquetes.service.ChoixPossibleService;

@RestController
@RequestMapping("/api")
public class ChoixPossibleRestController {

    private final ChoixPossibleService choixPossible;
    private final ChoixPossibleDao choixPossibleDao;

    public ChoixPossibleRestController(ChoixPossibleService choixPossible,
                                       ChoixPossibleDao choixPossibleDao)
    {
        this.choixPossible = choixPossible;
        this.choixPossibleDao = choixPossibleDao;
    }
}
