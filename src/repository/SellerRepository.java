package repository;

import dto.Auction;
import dto.Buyer;
import dto.Seller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerRepository {
   static List<Seller> sellerList;
   static Map<String, Auction> sellerAuctionMap;

    public SellerRepository() {
        sellerList = new ArrayList<>();;
        sellerAuctionMap =new HashMap<>();
    }

    public static List<Seller> getSellerList() {
        return sellerList;
    }
    public static Map<String, Auction> getSellerAuctionMap() {
        return sellerAuctionMap;
    }

}
