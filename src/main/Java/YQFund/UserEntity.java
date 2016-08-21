package YQFund;


//`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
//        `uid` varchar(128) NOT NULL COMMENT '用户邮箱',
//        `isNew` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否是基金新用户',
//        `fundCode` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '基金代号',
//        `fundName` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '基金名称',
//        `buyTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '购买时间',
//        `isRedeemed` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否赎回',
//        `mobileView` varchar(128) NOT NULL DEFAULT '' COMMENT '手机号',
//        `moneyNum` BIGINT(20) NOT NULL  DEFAULT '0' COMMENT '持有金额,单位分',
//        `moneyEarling`BIGINT(20) NOT NULL  DEFAULT '0' COMMENT '累计收益,保留2位小数？？',
//        `rank` int(10) NOT NULL  DEFAULT '-1' COMMENT '排名',
//        `isPay` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否赔付',
//        `prize` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否发奖',
//        `payTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '赔付时间',
//        `insertTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '插入时间',
//        PRIMARY KEY (`id`),
//        UNIQUE KEY `IDX_YQ_USER_UID` (`uid`)

/**
 * "用户实体"
 * Created by hzlaojiaqi on 2016/8/19.
 */
public class UserEntity {
    /**
     *
     */
    private static final long serialVersionUID = -2855803977706451727L;

    private long id;

    private String uid;

    private boolean isNew;

    private String fundCode;

    private String fundName;

    private long buyTime;

    private boolean isRedeemed;

    private String mobileView;

    private long moneyNum;

    private long moneyEarling;

    private  int rank;

    private  boolean isPay;

    private  boolean prize; //'是否发奖'

    private long payTime;

    private long insertTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public long getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(long buyTime) {
        this.buyTime = buyTime;
    }

    public boolean isRedeemed() {
        return isRedeemed;
    }

    public void setRedeemed(boolean redeemed) {
        isRedeemed = redeemed;
    }

    public String getMobileView() {
        return mobileView;
    }

    public void setMobileView(String mobileView) {
        this.mobileView = mobileView;
    }

    public long getMoneyNum() {
        return moneyNum;
    }

    public void setMoneyNum(long moneyNum) {
        this.moneyNum = moneyNum;
    }

    public long getMoneyEarling() {
        return moneyEarling;
    }

    public void setMoneyEarling(long moneyEarling) {
        this.moneyEarling = moneyEarling;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isPay() {
        return isPay;
    }

    public void setPay(boolean pay) {
        isPay = pay;
    }

    public boolean isPrize() {
        return prize;
    }

    public void setPrize(boolean prize) {
        this.prize = prize;
    }

    public long getPayTime() {
        return payTime;
    }

    public void setPayTime(long payTime) {
        this.payTime = payTime;
    }

    public long getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(long insertTime) {
        this.insertTime = insertTime;
    }
}
