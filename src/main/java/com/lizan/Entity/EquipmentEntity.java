package com.lizan.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Repository
@Table(name = "tequipment")
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String code;
    @Column(name="add_time")
    private Date addTime;
    @Column
    private float price;
    @Column
    private String place;
    @Column(name = "user_id")
    private Integer userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private UserEntity user;
}
