package YQFund.dao;

import bean.BankCardEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author hzhuangtaotao
 * @Date 2015年6月18日
 */
public interface BankCardDao{


    @Insert("insert into tb_yq_bankcard values(" +
            "#{uid}, #{cardId}, #{cardType}," + " #{cardTypeValue}, " +
            "#{bankName}, #{cardNoTail}, #{mobileView}, #{insertTime})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public int insertBankCard(BankCardEntity bankCardEntity);

    @Select("select * from tb_yq_bankcard where uid=#{uid}")
    public BankCardEntity getBankCardByUid(String uid);

    @Select("select count(*) from tb_yq_bankcard")
    public int getBankCardCount();

    @Delete("delete from tb_yq_bankcard where uid=#{uid}")
    public int deleteBankCardByUid(String uid);

    @Delete("delete from tb_yq_bankcard where 1=1")
    public int deleteAllBankCard();
    
}
