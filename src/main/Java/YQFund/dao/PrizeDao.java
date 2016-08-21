package YQFund.dao;

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

import bean.PrizeEntity;
import bean.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2016-8-21.
 */
public interface PrizeDao {

    //1.插入中奖用户
    @Insert("insert into tb_yq_winner(uid,winnerType,mobileView,insertTime)" +
            " values(#{winnerType},#{mobileView},#{insertTime})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public int insertPrize(PrizeEntity prizeEntity);

    //2.获取总共中奖数
    @Select("select * from tb_yq_winner")
    public int getWinnerNum();

    //3.获取得手机的用户
    @Select("select * from tb_yq_winner where winnerType = 1")
    public List<PrizeEntity> getWinnerByPhone();

    //4.更新用户中奖
    @Update("update tb_yq_winner set winnerType=#{winnerType}," +
            "mobileView=#{mobileView} insertTime=#{insertTime}" +
            "where uid=#{uid}")
    public int updateWinner(PrizeEntity prizeEntity);

    //5.删除中奖用户
    @Delete("delete from tb_yq_winner where uid=#{uid}")
    public int deleteWinner(String uid);


}
