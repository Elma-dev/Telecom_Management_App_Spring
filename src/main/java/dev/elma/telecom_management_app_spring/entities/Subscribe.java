package dev.elma.telecom_management_app_spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Subscribe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(TemporalType.DATE)
    private Date subscribeDate;
    @Enumerated(EnumType.STRING)
    private SubscribeType subscribeType;
    private double pay;
    private double amount;
    @ManyToOne
    private Client client;

}
