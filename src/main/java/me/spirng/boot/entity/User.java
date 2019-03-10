package me.spirng.boot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user")
public @Data
//@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })

class User implements Serializable {
    @Id
    private int id;
    private String name;
    private String mobliePhone;
}
