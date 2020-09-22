package com.restful.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.restful.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity(name="user")
@Data
@AllArgsConstructor
@Getter @Setter


public class User implements Serializable {

    /**
	 *
	 */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;

    @Column(length = 75,nullable = false)
    private String name;

    @Column(length = 75,nullable = false, unique = true)
    private String email;

    @Column(length = 100,nullable = false)
    private String password;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Request> requests = new ArrayList<Request>();

    @OneToMany(mappedBy = "user")
    private List<RequestStage> stages = new ArrayList<RequestStage>();

  
    
}
