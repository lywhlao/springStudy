package bean.found;

/**
 * Created by hzlaojiaqi on 2016/8/19.
 */

//fundsCode	string	基金代码
//        fundsName	string	基金简称
//        amount	long	持有金额
//        profit	long	总收益

public class UserFundsProfigDetail {

    private  String fundsCode;
    private  String fundsName;
    private  long amount;
    private  long profit;

    public String getFundsCode() {
        return fundsCode;
    }

    public void setFundsCode(String fundsCode) {
        this.fundsCode = fundsCode;
    }

    public String getFundsName() {
        return fundsName;
    }

    public void setFundsName(String fundsName) {
        this.fundsName = fundsName;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getProfit() {
        return profit;
    }

    public void setProfit(long profit) {
        this.profit = profit;
    }
}
