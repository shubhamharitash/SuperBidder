package util;

import dto.Auction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuctionUtil {
    public static Auction getAuctionByName(String auctionName, List<Auction> auctionList) {
        for (int i=0;i<auctionList.size();i++){
            if (auctionList.get(i).getName().equals(auctionName))
                return auctionList.get(i);
        }
        throw  new RuntimeException("AuctionNotFound");
    }
    public static String getAuctionWinner(Auction auction){
        //max-unique
        //bid frequency map
        Map<String,Integer> buyerBidderMap=auction.getBuyerBidMap();
        Map<Integer,Integer> bidFrequencyMap=new HashMap<>();
        //building frquncy map
        for (Map.Entry<String,Integer> entry : buyerBidderMap.entrySet()){
            if (bidFrequencyMap.containsKey(entry.getValue())){
                bidFrequencyMap.put(entry.getValue(),bidFrequencyMap.get(entry.getValue())+1);
            }else {
                bidFrequencyMap.put(entry.getValue(),1);
            }
        }
        //
        int maxBid=Integer.MIN_VALUE;
        String auctionWinner="NONE";
        int f=0;
        for (Map.Entry<Integer,Integer> entry : bidFrequencyMap.entrySet()){
            if (entry.getValue()==1){
                if(entry.getKey()>maxBid) {
                    maxBid = entry.getKey();
                    f=1;
                }
            }
        }
        //
        if (f==0)
            throw new RuntimeException("NO Winner");
        else {
            for (Map.Entry<String,Integer> entry : buyerBidderMap.entrySet()){
                if (entry.getValue()==maxBid){
                    System.out.println(entry.getKey()+" IS WINNER");
                    auctionWinner= entry.getKey();
                    break;
                }
            }
        }
        //
        return auctionWinner;
    }
}
