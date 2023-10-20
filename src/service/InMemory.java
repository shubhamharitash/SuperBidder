package service;

import repository.AuctionRepository;
import repository.BuyerRepository;
import repository.SellerRepository;

public class InMemory {
  public static   SellerRepository sellerRepository;
  public static BuyerRepository buyerRepository;
  public   static AuctionRepository auctionRepository;
    public InMemory() {
         sellerRepository=new SellerRepository();
         buyerRepository=new BuyerRepository();
          auctionRepository=new AuctionRepository();
    }
}
