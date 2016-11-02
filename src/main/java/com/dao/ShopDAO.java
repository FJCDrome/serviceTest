package com.dao;

import com.model.ShopDO;
import com.search.ShopSearch;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by drome on 16/11/1.
 */
public interface ShopDAO extends BaseDAO<ShopDAO>{
    /**
     * 获取网店列表
     *
     * @param spotCode
     * @return ShopDO
     */
    ShopDO selectOneBySpotCode(String spotCode);

    /**
     * 获取网店列表
     *
     * @param shopName
     * @return ShopDO
     */
    ShopDO selectOneByShopName(String shopName);

    /**
     * openCode 和 小店名称
     *
     * @param shop [shopName openCode]
     * @return
     */
    ShopDO selectOneByShopNameAndOpenCode(ShopSearch<ShopDO> shop);

    /**
     * 获取网店列表
     *
     * @param pid
     * @return ShopDO
     */
    ShopDO selectOneByPid(long pid);

    /**
     * 获取网店列表
     *
     * @param uid
     * @return ShopDO
     */
    ShopDO selectOneByUid(long uid);

    /**
     * 获取网店列表
     *
     * @return ShopDO
     */
    ShopDO selectOne(ShopSearch<ShopDO> query);

    /**
     * 获取网店列表
     *
     * @return List<ShopDO>
     */
    List<ShopDO> selectListByCoords(ShopSearch<String[]> shop);

    int selectListByCoordsCount(ShopSearch<String[]> shop);

    /**
     * 获取网店列表
     *
     * @return List<ShopDO>
     */
    List<ShopDO> selectList(ShopSearch<String[]> shop);

    int selectListCount(ShopSearch<String[]> shop);

    /**
     * 获取网店列表：网店IDs
     *
     * @param query
     * @return List<ShopDO>
     */
    List<ShopDO> selectSearchList(Query<Map<String, Object>> query);

    int selectSearchListCount(Query<Map<String, Object>> query);

    /**
     * 获取网店列表：网店IDs
     *
     * @param query
     * @return List<ShopDO>
     */
    List<ShopDO> selectListByIds(Query<String[]> query);

    int selectListByIdsCount(Query<String[]> query);

    List<ShopDO> selectListByPids(Query<String[]> query);

    int selectListByPidsCount(Query<String[]> query);

    List<ShopDO> selectListByUids(Query<String[]> query);

    int selectListByUidsCount(Query<String[]> query);

    List<ShopDO> selectListByTypes(Query<String[]> query);

    int selectListByTypesCount(Query<String[]> query);

    int updateStatus(ShopDO Shop);

    /**
     * 获取供货商自己的网点列表
     *
     * @return List<ShopDO>
     */
    List<ShopDO> selectProviderShopList(ShopSearch<String[]> shop);

    int selectProviderShopListCount(ShopSearch<String[]> shop);

    int updateByUid(ShopDO shop);

    /**
     * 小店等級的統計計算
     * 最近三個月 满1000的开始计算等级值
     */
    List<ShopDO> selectShopLevel(Long uid);

    List<ShopDO> selectDaliyShopList();
    List<ShopDO> selectListExcludeSomeId(ShopSearch<String[]> shop);
    int selectListExcludeSomeIdCount(ShopSearch<String[]> shop);


    /**
     *
     * 查询头像为空的店铺
     *
     * @author <a href="mailto:yihui#500mi.com">yihui</a>
     * @version 1.0
     * @since 2016年2月27日
     * @param start
     * @param pageSize
     * @param orderBy
     * @return
     */
    @Deprecated
    List<ShopDO> selectForNullAvatar(@Param("start")Integer start, @Param("pageSize")Integer pageSize, @Param("orderBy") String orderBy);

    /**
     *
     * 头像为空的店铺总数
     *
     * @author <a href="mailto:yihui#500mi.com">yihui</a>
     * @version 1.0
     * @since 2016年2月27日
     * @return
     */
    @Deprecated
    Long selectForNullAvatarCount();

    /**
     *
     * 标记头像为空的记录
     *
     * @author <a href="mailto:yihui#500mi.com">yihui</a>
     * @version 1.0
     * @since 2016年2月29日
     * @return
     */
    @Deprecated
    int flagForNullAvatar();

    /**
     *
     * 去掉头像为空的标记
     *
     * @author <a href="mailto:yihui#500mi.com">yihui</a>
     * @version 1.0
     * @since 2016年2月29日
     * @return
     */
    @Deprecated
    int unflagForNullAvatar();

    /**
     * 根据openCode,查出有效shop
     * @param openCode
     * @return
     */
    List<ShopDO> selectListByOpenCode(@Param("openCode")String openCode);


    List<ShopDO> select500miPlusOrHuiyuanList();
    List<ShopDO> select500miDeliveryList();
}
