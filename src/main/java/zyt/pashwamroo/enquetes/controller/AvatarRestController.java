package zyt.pashwamroo.enquetes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyt.pashwamroo.enquetes.dao.AvatarDao;
import zyt.pashwamroo.enquetes.service.AvatarService;

@RestController
@RequestMapping("/api")
public class AvatarRestController {
    private final AvatarService avatarService;
    private final AvatarDao avatarDao;

    public AvatarRestController(AvatarService avatarService, AvatarDao avatarDao) {
        this.avatarService = avatarService;
        this.avatarDao = avatarDao;
    }
}
