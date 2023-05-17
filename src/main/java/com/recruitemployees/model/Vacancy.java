package com.recruitemployees.model;

import com.recruitemployees.model.enums.VacancyStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Vacancy {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String vacancy;
    @OneToOne(fetch = FetchType.LAZY)
    private Users user;
    private VacancyStatus status;

    public Vacancy(String vacancy, Users user) {
        this.vacancy = vacancy;
        this.user = user;
        this.status = VacancyStatus.WAITING;
    }
}
