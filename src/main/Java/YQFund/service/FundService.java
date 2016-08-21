package YQFund.service;

import YQFund.found.FundsTradeResult;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016-8-21.
 */
@Service
public class FundService {


    //1.获取funds数据
    public FundsTradeResult getFundTrade(String uid){

        FundsTradeResult fundsTradeResult=new FundsTradeResult();
       //发送网络请求，获取数据 TODO
        return  fundsTradeResult;
    }

    //2.是否是新用户
    public boolean isNewFundUser(String uid){
        //发送网络情况，判断是否是基金新用户 TODO
        return false;
    }

}
