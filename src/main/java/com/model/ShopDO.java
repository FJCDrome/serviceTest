package com.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.Map;

public class ShopDO implements java.io.Serializable {

    private static final long serialVersionUID = 4165991751472520866L;

    private Long id;

    private Long pid;

    private Long uid;

    @JSONField(name = "spot_code")
    private String spotCode;
    @JSONField(name = "lc_code")
    private String lcCode;
    @JSONField(name = "shop_name")
    private String shopName;

    private String description;

    private String contact;
    @JSONField(name = "contact_phone")
    private String contactPhone;

    private String address;

    private String lng;

    private String lat;
    @JSONField(name = "time_open")
    private Date timeOpen;
    @JSONField(name = "time_close")
    private Date timeClose;
    @JSONField(name = "shop_item")
    private String shopItem;
    @JSONField(name = "shop_volume")
    private String shopVolume;
    @JSONField(name = "shop_env")
    private String shopEnv;

    private String logo;

    private String pic;

    private String remark;

    private String tag;

    private Long level;

    private Long specialPrice;

    private Byte vip;
    @JSONField(name = "zone_code")
    private Byte zoneCode;

    private Long attribute;

    private Long assurance;

    private Long active;
    @JSONField(name = "open_code")
    private String openCode;

    @JSONField(name = "retail_props")
    private String retailProps;

    private String props;
    @JSONField(name = "promotion_logs")
    private String promotionLogs;
    @JSONField(name = "owner_name")
    private String ownerName;

    private String creator;
    @JSONField(name = "follow_num")
    private Long followNum;

    private Byte status;

    private Byte type;

    private Integer rank;

    private Date cdate;

    private Date edate;
    //新增字段 
    private Integer tpl;//2014-11-13

    private String machine; //2015-06-03
    @JSONField(name = "fee_setting")
    private String feeSetting;


    private Double distance;
    @JSONField(name = "distance_value")
    private String distanceValue;

    private Long mid;

    public String getDistanceValue() {
        return distanceValue;
    }

    public void setDistanceValue(String distanceValue) {
        this.distanceValue = distanceValue;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }


    public Long getActive() {
        return active;
    }

    public void setActive(Long active) {
        this.active = active;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getSpotCode() {
        return spotCode;
    }

    public void setSpotCode(String spotCode) {
        this.spotCode = spotCode;
    }

    public String getLcCode() {
        return lcCode;
    }

    public void setLcCode(String lcCode) {
        this.lcCode = lcCode;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getShopItem() {
        return shopItem;
    }

    public void setShopItem(String shopItem) {
        this.shopItem = shopItem;
    }

    public String getShopVolume() {
        return shopVolume;
    }

    public void setShopVolume(String shopVolume) {
        this.shopVolume = shopVolume;
    }

    public String getShopEnv() {
        return shopEnv;
    }

    public void setShopEnv(String shopEnv) {
        this.shopEnv = shopEnv;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(Long specialPrice) {
        this.specialPrice = specialPrice;
    }

    public Byte getVip() {
        return vip;
    }

    public void setVip(Byte vip) {
        this.vip = vip;
    }

    public Byte getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(Byte zoneCode) {
        this.zoneCode = zoneCode;
    }

    public Long getAttribute() {
        return attribute;
    }

    public void setAttribute(Long attribute) {
        this.attribute = attribute;
    }

    public Long getAssurance() {
        return assurance;
    }

    public void setAssurance(Long assurance) {
        this.assurance = assurance;
    }

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getFollowNum() {
        return followNum;
    }

    public void setFollowNum(Long followNum) {
        this.followNum = followNum;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }


    public Date getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(Date timeOpen) {
        this.timeOpen = timeOpen;
    }

    public Date getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(Date timeClose) {
        this.timeClose = timeClose;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPromotionLogs() {
        return promotionLogs;
    }

    public void setPromotionLogs(String promotionLogs) {
        this.promotionLogs = promotionLogs;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getOpenCode() {
        return openCode;
    }

    public void setOpenCode(String openCode) {
        this.openCode = openCode;
    }

    public Integer getTpl() {
        return tpl;
    }

    public void setTpl(Integer tpl) {
        this.tpl = tpl;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getFeeSetting() {
        return feeSetting;
    }

    public void setFeeSetting(String feeSetting) {
        this.feeSetting = feeSetting;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }



    public void setRetailProps(String retailProps) {
        this.retailProps = retailProps;
    }
}