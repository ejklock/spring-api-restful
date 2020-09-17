package com.restful.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Request {
    
    private String id;
    private String subject;
    private String description;
    private Date creationDate;
    private Request state;
    private User user;
    private List<RequestStage> stages = new ArrayList<RequestStage>();
}
