package com.sample;

public class Response{
    public String question;
    public String response;

    public String getQuestion() {
        return question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Response() {
    }

    public Response(String question, String response) {
        this.question = question;
        this.response = response;
    }
}