package util;

import dto.Auction;
import dto.Seller;

import java.util.List;

public class SellerUtil {
    public static Seller getSellerByName(String sellerName, List<Seller> sellerList){
        for (int i=0;i<sellerList.size();i++){
            if (sellerList.get(i).getName().equals(sellerName)) {
                Seller seller = sellerList.get(i);
                return seller;
            }
        }
        throw new RuntimeException("Invalid Seller");
    }

}
