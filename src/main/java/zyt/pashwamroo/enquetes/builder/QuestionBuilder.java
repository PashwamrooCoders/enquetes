package zyt.pashwamroo.enquetes.builder;

import zyt.pashwamroo.enquetes.dto.QuestionDto;
import zyt.pashwamroo.enquetes.entity.Question;

public class QuestionBuilder {

    private Long id;
    private String libelle;

    public QuestionBuilder fromQuestionBuilder(QuestionDto questionDto) {
        id = questionDto.getId();
        libelle = questionDto.getLibelle();
        return this;
    }

    public Long getId() {
        return id;
    }

    public QuestionBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public String getLibelle() {
        return libelle;
    }

    public QuestionBuilder withLibelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public Question build() {
        Question question = new Question();
        id = question.getId();
        libelle = question.getLibelle();
        return question;
    }
}
