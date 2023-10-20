package repository;

import dto.Auction;

import java.util.ArrayList;
import java.util.List;

public class AuctionRepository {
    public static List<Auction> getAuctionList() {
        return auctionList;
    }

    public AuctionRepository() {
        auctionList =new ArrayList<>();
    }

    static List<Auction> auctionList;
}
