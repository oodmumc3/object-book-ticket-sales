package com.dktechin.ticket.sales.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 관람객 도메인 클래스
 * 소지품을 보호하기 위해 가빙올 소지한다.
 */
@RequiredArgsConstructor
@Getter
public class Audience {
    private final Bag bag;
}
