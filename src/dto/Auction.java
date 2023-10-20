package dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Auction {
    String name;
    int minValue;
    int maxValue;
    String seller;
    boolean isActive;
    Map<String,Integer> buyerBidMap;

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Map<String, Integer> getBuyerBidMap() {
        return buyerBidMap;
    }

    public void setBuyerBidMap(Map<String, Integer> buyerBidMap) {
        this.buyerBidMap = buyerBidMap;
    }


    public Auction(String name, int minValue, int maxValue, String seller, boolean isActive) {
        this.name = name;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.seller = seller;
        this.isActive = isActive;
        buyerBidMap=new HashMap<>();
    }


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auction auction = (Auction) o;
        return name.equals(auction.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }





}
