package com.example.web_pra;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String name;

    @Embedded
    private Address address;

    //string으로 가져와야지 Enum에서 변경했을때 괜찮다?
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
