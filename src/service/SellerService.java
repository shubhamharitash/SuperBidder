package service;

import dto.Auction;
import dto.Buyer;
import dto.Seller;
import repository.AuctionRepository;
import repository.SellerRepository;

import java.util.*;

import static util.AuctionUtil.getAuctionByName;
import static util.AuctionUtil.getAuctionWinner;
import static util.SellerUtil.getSellerByName;

public class SellerService {
    /*
    ADD_SELLER
    CREATE_AUCTION
    CLOSE_AUCTION
     */

    List<Seller> sellerList=SellerRepository.getSellerList();
    List<Auction> auctionList=AuctionRepository.getAuctionList();
    Map<String, Auction> sellerAuctionMap= SellerRepository.getSellerAuctionMap();

    public void ADD_SELLER(String sellerName){
        Seller seller=new Seller(sellerName,new ArrayList<>());
        sellerList.add(seller);
    }
    public void CREATE_AUCTION(String auctionName,int minBid,int maxBid,String sellerName){
        Seller seller=getSellerByName( sellerName,sellerList);
        if (!sellerList.contains(seller)){
           throw new RuntimeException("invalid Seller");
        }

        Auction auction=new Auction(auctionName,minBid,maxBid,sellerName,true);
        seller.getAuctionList().add(auction);
        auctionList.add(auction);
        sellerAuctionMap.put(sellerName,auction);
            }
    public void CLOSE_AUCTION(String auctionName){
        Auction auction=getAuctionByName(auctionName,auctionList);
        if(!auctionList.contains(auction))
            throw new RuntimeException("invalid auction");

                    String winner=getAuctionWinner(auction);
                    auctionList.remove(auction);

        }


}
