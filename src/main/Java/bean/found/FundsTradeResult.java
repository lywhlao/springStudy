package bean.found;

import java.util.List;

/**
 * Created by hzlaojiaqi on 2016/8/19.
 */
public class FundsTradeResult {

    private List<UserFundsProfigDetail> userFundsProfigDetailList;

    private List<UserFundsTradeDetail> userFundsTradeDetailList;

    public List<UserFundsProfigDetail> getUserFundsProfigDetailList() {
        return userFundsProfigDetailList;
    }

    public void setUserFundsProfigDetailList(List<UserFundsProfigDetail> userFundsProfigDetailList) {
        this.userFundsProfigDetailList = userFundsProfigDetailList;
    }

    public List<UserFundsTradeDetail> getUserFundsTradeDetailList() {
        return userFundsTradeDetailList;
    }

    public void setUserFundsTradeDetailList(List<UserFundsTradeDetail> userFundsTradeDetailList) {
        this.userFundsTradeDetailList = userFundsTradeDetailList;
    }
}
