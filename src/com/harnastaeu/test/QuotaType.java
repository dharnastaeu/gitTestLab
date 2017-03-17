package com.harnastaeu.test;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by dzmitry.harnastaeu on 3/13/17.
 */
public enum QuotaType {
    DAILY_SHARES("sharesToday-"),
    DAILY_UNVERIFIED_SHARES("unverifiedSharesToday-"),
    BURST_SHARES("burstShares-");

    private String keyName;

    public static final Set<QuotaType> DAILY_QUOTAS = Sets.newHashSet(DAILY_SHARES, DAILY_UNVERIFIED_SHARES);

    QuotaType(String keyName){
        this.keyName = keyName;
    }

    public String getKeyName(){
        return keyName;
    }
}