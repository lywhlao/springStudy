package YQFund.bean;

//# 中奖信息表
//        DROP TABLE IF EXISTS `tb_yq_winner`;
//        CREATE TABLE `tb_yq_winner` (
//        `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
//        `uid` varchar(128) NOT NULL COMMENT '用户邮箱',
//        `winnerType` TINYINT(1) NOT NULL  COMMENT '中奖类别：0-电影券，1-电影券+手机',
//        `mobileView` varchar(128) NOT NULL DEFAULT '' COMMENT '绑定的手机号码邮箱',
//        `insertTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '插入时间',
//        PRIMARY KEY (`id`),
//        UNIQUE KEY `IDX_YQ_WINNER_UID` (`uid`)
//        ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='中奖信息表';/*总数据1万条*/
/**
 * Created by Administrator on 2016-8-21.
 */
public class WinnerEntity {
    private int id;
    private String uid;
    private boolean winnerType;
    private String mobileView;
    private long insertTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean isWinnerType() {
        return winnerType;
    }

    public void setWinnerType(boolean winnerType) {
        this.winnerType = winnerType;
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
}
