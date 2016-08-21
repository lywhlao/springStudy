package YQFund.bean;


/**
 *
 * @author hzhuangtaotao
 * @Date 2015年7月10日
 */
public class BankCardEntity {

   /**
     * 
     */
    private static final long serialVersionUID = 5075843691884559018L;

    private long id;
    
    private String uid;
    
    private long cardId;
    
    private String cardType;
    
    private String cardTypeValue;
    
    private String bankName;
    
    private String cardNoTail;
    
    private String mobileView;
    
    private long insertTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardTypeValue() {
        return cardTypeValue;
    }

    public void setCardTypeValue(String cardTypeValue) {
        this.cardTypeValue = cardTypeValue;
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

    public String getMobileView() {
        return mobileView;
    }

    public void setMobileView(String mobileView) {
        this.mobileView = mobileView;
    }

    public long getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(long insertTime) {
        this.insertTime = insertTime;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
