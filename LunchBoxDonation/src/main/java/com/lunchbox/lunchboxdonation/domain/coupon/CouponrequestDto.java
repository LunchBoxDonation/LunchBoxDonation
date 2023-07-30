package com.lunchbox.lunchboxdonation.domain.coupon;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CouponrequestDto {
    private String coupon;
    private Integer price;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}