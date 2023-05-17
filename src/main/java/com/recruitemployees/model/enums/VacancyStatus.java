package com.recruitemployees.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VacancyStatus {
    WAITING("В ожидании"),
    UNDER_CONSIDERATION("На рассмотрении"),
    REJECTED("Отклонено"),
    ;
    private final String name;
}

