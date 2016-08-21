package YQFund.dao;

import bean.PrizeEntity;
import bean.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

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
public interface PrizeDao {

    //1.插入中手机信息
    @Insert("insert into tb_yq_prize(status,prizeType,validSinceTS,insertTime)" +
            " values (#{status},#{prizeType},#{validSinceTS},#{insertTime})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public int insertPrize(PrizeEntity prizeEntity);

    //2.获取中手机信息条数
    @Select("select * from tb_yq_prize where prizeType=#{prizeType}")
    public int getPrizeNumByType(String prizeType);

    //3.更新中奖状态
    @Update("update tb_yq_prize (status,validSinceTS) where id=#{id}")
    public int updatePrizeEffectStatus(PrizeEntity prizeEntity);

    //4.获取未中奖实体
    @Select("select * from tb_yq_prize where status=0")
    public List<PrizeEntity> getUnEffectPrize();

    //5.获取中奖实体
    @Select("select * from tb_yq_prize where status=1")
    public List<PrizeEntity> getEffectPrize();

    //6.获取未中奖个数
    @Select("select count(*) from tb_yq_prize where status=0")
    public int getUnEffectPrizeNum();

    //7获取中奖个数
    @Select("select count(*) from tb_yq_prize where status=1")
    public int getEffectPrizeNum();
}
