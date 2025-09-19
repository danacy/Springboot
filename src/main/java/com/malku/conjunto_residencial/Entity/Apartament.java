package com.malku.conjunto_residencial.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Apartament {
    @Id

    private Long id;
    private String number;
    private int floor;
    private String tower;
    private double area;
    private String status;


}
/*

tower (String)

area (double) – m²

owner (Owner) – Relación con propietario.

tenant (Tenant) – Relación opcional con inquilino.

parkingLot (ParkingLot) – Relación opcional.

status (String) – Ej: “ocupado”, “vacío”.

2️⃣ Owner (Propietario)

id (Long)

firstName (String)

lastName (String)

documentId (String)

email (String)

phone (String)

apartments (List<Apartment>) – Puede tener varios apartamentos.

3️⃣ Tenant (Inquilino)

id (Long)

firstName (String)

lastName (String)

documentId (String)

email (String)

phone (String)

apartment (Apartment) – Relación con el apartamento que arrienda.

leaseStart (LocalDate)

leaseEnd (LocalDate)

4️⃣ Visitor (Visitante)

id (Long)

firstName (String)

lastName (String)

documentId (String)

phone (String)

apartmentVisited (Apartment)

entryTime (LocalDateTime)

exitTime (LocalDateTime)

5️⃣ ParkingLot (Parqueadero)

id (Long)

number (String)

apartment (Apartment) – Relación opcional.

owner (Owner) – Quien lo posee.

tenant (Tenant) – Quien lo usa actualmente (si aplica).

status (String) – “Disponible”, “Asignado”.

6️⃣ Mail / Correspondence (Correo / Paquetería)

id (Long)

recipient (Owner/Tenant)

type (String) – “Paquete”, “Carta”, “Notificación”.

description (String)

arrivalDate (LocalDateTime)

status (String) – “Entregado”, “Pendiente”.

7️⃣ CommonArea (Área común)

id (Long)

name (String) – Ej: “Gimnasio”, “Piscina”, “Salón comunal”.

location (String)

capacity (int)

status (String) – “Disponible”, “En mantenimiento”.

8️⃣ Request (Solicitud / Petición)

id (Long)

requester (Owner/Tenant)

type (String) – “Mantenimiento”, “Reclamo”, “Reserva área común”.

description (String)

submissionDate (LocalDateTime)

status (String) – “Pendiente”, “En proceso”, “Resuelto”.

assignedStaff (SecurityStaff / MaintenanceStaff)

9️⃣ SecurityStaff (Personal de seguridad)

id (Long)

firstName (String)

lastName (String)

documentId (String)

email (String)

phone (String)

shift (String) – Ej: “Día”, “Noche”

assignedRequests (List<Request>)
* */