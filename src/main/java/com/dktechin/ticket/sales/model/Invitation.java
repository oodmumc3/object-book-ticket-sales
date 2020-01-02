package com.dktechin.ticket.sales.model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Invitation {
    private final LocalDateTime when;
}
