package org.example.productcatalogservice.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class BaseModel {
    private UUID id;
    private Date createdAt;
    private Date updatedAt;
}
