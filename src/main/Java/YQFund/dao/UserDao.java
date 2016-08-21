package YQFund.dao;

import bean.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by hzlaojiaqi on 2016/8/18.
 */
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

public interface UserDao {

    //1.插入用户（再加入一些别的属性，比如设备号，ip地址，uuid？）
    @Insert("insert into tb_yq_user(uid) values (#{uid})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public int insertUser(String uid);

    //2.获取用户
    @Select("select * from tb_yq_user where uid=#{uid}")
    public UserEntity getUserById(String uid);

    //3.删除用户
    @Delete("delete * from tb_yq_user where uid=#{uid}")
    public int deleteUserById(String uid);

    //4.获取总的用户数
    @Select("select count(*) from tb_yq_user")
    public int getTotalUserCount();

    //5.分批获取用户
    @Select("select * from tb_yq_user limit #{start},#{offset}")
    public List<UserEntity> getBatchOfUser(int start, int offset);

    //6.更新基金数据
    @Update("update tb_yq_user set " +
            "isNew=#{isNew},fundCode=#{foundCode},fundName=#{fundName}," +
            " buyTime=#{buyTime}, isRedeemed=#{isRedeemed},mobileView=#{mobileView}," +
            " moneyNum=#{moneyNum},moneyEarling=#{moneyEarling},rank=#{rank}," +
            " isPay=#{isPay},prize=#{prize},payTime=#{payTime},insertTime=#{insertTime}" +
            "where uid=#{uid}")
    public int updateUserFundStatus(UserEntity userEntity);

    //7.更新排名
    @Update("update tb_yq_user set rank=#{rank} where uid=#{uid}")
    public int updateUserRank(String uid,int rank);



    //8.获取个人基金收益情况（如果有同时买了A,B基金怎么处理？）
        //TODO

    //9.获取电影票中奖用户（条件需要再理一理）


    //10.获取手机中奖用户(条件需要再理一理)



}
