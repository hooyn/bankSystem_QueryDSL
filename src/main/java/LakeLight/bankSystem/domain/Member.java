package LakeLight.bankSystem.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;
    private String social_security_number;
    private String tel_number;

    @OneToMany(mappedBy = "member")
    private List<Account> accounts = new ArrayList<>();
}