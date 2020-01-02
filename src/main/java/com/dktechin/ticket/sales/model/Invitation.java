package com.dktechin.ticket.sales.model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Invitation {
    // 공연을 관람할 수 있는 초대일자 (초대장)
    private final LocalDateTime when;
}
