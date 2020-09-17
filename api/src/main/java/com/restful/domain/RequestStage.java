package com.restful.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor

@Getter @Setter

public class RequestStage {

    private String id;
    private String description;
    private Date realizationDate;
    private RequestStage state;
    private Request request;
    private User user;
}
