package com.nh.zk.tool;

public class Inst{
    private String questionType;
    private String questionDescribe;
    private String questionAnswer;
    private String questionOptionsDesc;

    public Inst(String questionType, String questionDescribe, String questionAnswer, String questionOptionsDesc) {
        this.questionType = questionType;
        this.questionDescribe = questionDescribe;
        this.questionAnswer = questionAnswer;
        this.questionOptionsDesc = questionOptionsDesc;
    }

    public Inst() {
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionDescribe() {
        return questionDescribe;
    }

    public void setQuestionDescribe(String questionDescribe) {
        this.questionDescribe = questionDescribe;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionOptionsDesc() {
        return questionOptionsDesc;
    }

    public void setQuestionOptionsDesc(String questionOptionsDesc) {
        this.questionOptionsDesc = questionOptionsDesc;
    }

    @Override
    public String toString() {
        return "Inst{" +
                "questionType='" + questionType + '\'' +
                ", questionDescribe='" + questionDescribe + '\'' +
                ", questionAnswer='" + questionAnswer + '\'' +
                ", questionOptionsDesc='" + questionOptionsDesc + '\'' +
                '}';
    }
}