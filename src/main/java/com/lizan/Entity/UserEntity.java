package com.lizan.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@Entity
@Repository
@Table(name = "tuser")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column(name="login_name")
    private String loginName;
    @Column(name="real_name")
    private String realName;
    @Column
    private String password;
    @Column
    private String trl;
    @Column
    private String email;
    @Column
    private Integer type;
    @Column(name="last_login_time")
    private Date lastLoginTime;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
    private Set<EquipmentEntity> equipmentEntities;
}
