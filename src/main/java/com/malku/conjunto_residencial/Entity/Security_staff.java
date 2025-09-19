package com.malku.conjunto_residencial.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Security_staff {
    @Id

    private Long id;
    private String first_name;
    private String last_name;
    private String documentId;
    private String email;
    private String phone;
    private String shift;
    private String assignedRequests;

}

/*
* id (Long)

firstName (String)

lastName (String)

documentId (String)

email (String)

phone (String)

shift (String) – Ej: “Día”, “Noche”

assignedRequests (List<Request>)
* */