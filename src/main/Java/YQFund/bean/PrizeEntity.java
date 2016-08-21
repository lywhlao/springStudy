package YQFund.bean;
//
//# 奖品表
//        DROP TABLE IF EXISTS `tb_yq_prize`;
//        CREATE TABLE `tb_yq_prize` (
//        `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
//        `status` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '0未发放，1已发放',
//        `prizeType` TINYINT(1) NOT NULL  COMMENT '0电影券，1手机',
//        `validSinceTS` bigint(20) NOT NULL DEFAULT '0' COMMENT '生效时间',
//        `insertTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '插入时间',
//        PRIMARY KEY (`id`)
//        ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='奖品表';/*总数据2条*/
/**
 * Created by Administrator on 2016-8-21.
 */
public class PrizeEntity {
    private int id;
    private boolean status;
    private boolean prizeType;
    private long validSinceTS;
    private long insertTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isPrizeType() {
        return prizeType;
    }

    public void setPrizeType(boolean prizeType) {
        this.prizeType = prizeType;
    }

    public long getValidSinceTS() {
        return validSinceTS;
    }

    public void setValidSinceTS(long validSinceTS) {
        this.validSinceTS = validSinceTS;
    }

    public long getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(long insertTime) {
        this.insertTime = insertTime;
    }
}
