package service;

import dto.Auction;
import dto.Buyer;
import dto.Seller;
import repository.AuctionRepository;
import repository.BuyerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static util.AuctionUtil.getAuctionByName;

public class BuyerService {
    /*
    ADD_BUYER
    CREATE_BID
    WITHDRAW_BID
    UPDATE_BID
     */

    List<Buyer> buyerList= BuyerRepository.getBuyerList();
    List<Auction> auctionList= AuctionRepository.getAuctionList();
    Map<String, Auction> buyerAuctionMap= BuyerRepository.getBuyerAuctionMap();

    public void ADD_BUYER(String buyerName){
        Buyer buyer=new Buyer(buyerName,new ArrayList<>());
        buyerList.add(buyer);
    }
   public void CREATE_BID(String buyerName,String auctionName,int bidAmount){
       Auction auction=getAuctionByName(auctionName,auctionList);
        if(!auction.isActive())
            throw  new RuntimeException("NO Auction Found");
        if (bidAmount<auction.getMinValue()&& bidAmount>auction.getMaxValue())
            throw new RuntimeException("Bid AMount Not in Range");
        auction.getBuyerBidMap().put(buyerName,bidAmount);
        buyerAuctionMap.put(buyerName,auction);

    }
    public void WITHDRAW_BID(String buyerName,String auctionName){
        Auction auction=getAuctionByName(auctionName,auctionList);
        if(!auction.isActive())
            throw  new RuntimeException(" Auction IS Closed");
        auction.getBuyerBidMap().remove(buyerName);
    }
    public void UPDATE_BID(String buyerName,String auctionName,int bidAmount){
        Auction auction=getAuctionByName(auctionName,auctionList);
        if(!auction.isActive())
            throw  new RuntimeException(" Auction IS Closed");
        auction.getBuyerBidMap().put(buyerName,bidAmount);
        buyerAuctionMap.put(buyerName,auction);
    }

}
