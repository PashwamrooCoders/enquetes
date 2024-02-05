package zyt.pashwamroo.enquetes.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zyt.pashwamroo.enquetes.dao.QuestionDao;
import zyt.pashwamroo.enquetes.service.QuestionService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class QuestionRestController {
    private final QuestionService questionService;
    private final QuestionDao questionDao;

    public QuestionRestController(QuestionService questionService, QuestionDao questionDao) {
        this.questionService = questionService;
        this.questionDao = questionDao;
    }
}
