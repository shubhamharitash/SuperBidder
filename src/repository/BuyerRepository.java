package repository;

import dto.Auction;
import dto.Buyer;
import dto.Seller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuyerRepository {
 static    List<Buyer> buyerList;
   static Map<String, Auction> buyerAuctionMap;

    public BuyerRepository() {
        buyerList = new ArrayList<>();
        buyerAuctionMap = new HashMap<>();
    }

    public static List<Buyer> getBuyerList() {
        return buyerList;
    }

    public static Map<String, Auction> getBuyerAuctionMap() {
        return buyerAuctionMap;
    }


}
