
import service.BuyerService;
import service.InMemory;
import service.SellerService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        InMemory inMemory=new InMemory();
        BuyerService buyerService=new BuyerService();
        SellerService sellerService=new SellerService();

        while (true){
            String inp=scanner.nextLine();
            inp=inp.trim();
            String[] inpArr=inp.split(" ");
            try {
                switch (inpArr[0]) {
                    //    ADD_BUYER,ADD_SELLER,CREATE_AUCTION,CREATE_BID,WITHDRAW_BID,UPDATE_BID,CLOSE_AUCTION
                    case "ADD_BUYER": {
                        buyerService.ADD_BUYER(inpArr[1]);
                    }
                    break;
                    case "ADD_SELLER": {
                        sellerService.ADD_SELLER(inpArr[1]);
                    }
                    break;
                    case "CREATE_AUCTION": {
                        sellerService.CREATE_AUCTION(inpArr[1], Integer.parseInt(inpArr[2]), Integer.parseInt(inpArr[3]), inpArr[4]);
                    }
                    break;
                    case "CREATE_BID": {
                        buyerService.CREATE_BID(inpArr[1], inpArr[2], Integer.parseInt(inpArr[3]));
                    }
                    break;
                    case "WITHDRAW_BID": {
                        buyerService.WITHDRAW_BID(inpArr[1], inpArr[2]);
                    }
                    break;
                    case "UPDATE_BID": {
                        buyerService.UPDATE_BID(inpArr[1], inpArr[2], Integer.parseInt(inpArr[3]));
                    }
                    break;
                    case "CLOSE_AUCTION": {
                        sellerService.CLOSE_AUCTION(inpArr[1]);
                    }
                    break;
                    default:
                        System.out.println("Invalid Command");
                }
            }
            catch (RuntimeException runtimeException){
                System.out.println(runtimeException);
            }
        }
    }
}
