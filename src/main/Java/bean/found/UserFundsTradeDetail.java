package bean.found;

/**
 * Created by hzlaojiaqi on 2016/8/19.
 */


//参数	类型	说明
//        tradeId	long	交易Id
//        fundsCode	string	基金代码
//        fundsName	string	基金简称
//        tradeAmount	long	交易金额
//        tradeTime	long	交易时间
//        finishTime	long	成功时间
//        tradeType	int	交易类型 见FundsTradeType
//        tradeStatus	int	交易状态 见FundsTradeStatus
//        cardId	long	银行卡Id
//        bankName	String	银行名称
//        cardNoTail	String	银行卡号后四位
//        mobile	String	手机号码
public class UserFundsTradeDetail {
    private long tradeId;
    private String fundsCode;
    private String fundsName;
    private long tradeAmount;
    private long tradeTime;
    private long finishTime;
    private  int tradeType;
    private  int tradeStatus;
    private  long cardId;
    private  String bankName;
    private  String cardNoTail;
    private  String mobile;

    public long getTradeId() {
        return tradeId;
    }

    public void setTradeId(long tradeId) {
        this.tradeId = tradeId;
    }

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

    public long getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(long tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public long getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(long tradeTime) {
        this.tradeTime = tradeTime;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public int getTradeType() {
        return tradeType;
    }

    public void setTradeType(int tradeType) {
        this.tradeType = tradeType;
    }

    public int getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(int tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNoTail() {
        return cardNoTail;
    }

    public void setCardNoTail(String cardNoTail) {
        this.cardNoTail = cardNoTail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
