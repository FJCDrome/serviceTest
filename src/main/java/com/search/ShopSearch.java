package com.search;


import com.dao.Query;

import java.util.Date;

public class ShopSearch<T> extends Query<T>
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private Long pid;

    private Long uid;
    private String[] uids;

    private Long mid;

    private String spotCode;

    private String lcCode;

    private String shopName;

    private String address;

    private String contact;

    private String contactPhone;

    private String shopItem;

    private Long level;

    private Byte vip;
    
    private Byte zoneCode;

    private Long attribute;

    private Long assurance;

    private String creator;

    private String ownerName;

    private Byte status;
    
    private Byte type;
    
    private Integer rank;
    
    private String openCode;
    
    private Long distance;
    
    private Byte isDefault;

    private Date startEdate;
    
    //额外参数，用于多个type搜索
    private String types;
    private String openCodes;
    private String[] openCodeArray;

    private Long customVip;
    //新增字段
    private Integer tpl;//2014-11-13
    //取有attribute 有会员和 500mi+的标
    private Long app;

    public Long getApp() {
        return app;
    }

    public void setApp(Long app) {
        this.app = app;
    }

    public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}


    //表连接查询
    private String lng;
    private String lat;
    // distance对应的度数
    private String dLng;
    private String dLat;


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
	
	public String getDLng() {
		return dLng;
	}

	public void setDLng(String dLng) {
		this.dLng = dLng;
	}

	public String getDLat() {
		return dLat;
	}

	public void setDLat(String dLat) {
		this.dLat = dLat;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

	public String getOpenCode() {
		return openCode;
	}

	public void setOpenCode(String openCode) {
		this.openCode = openCode;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public Long getDistance() {
		return distance;
	}

	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public Integer getTpl() {
		return tpl;
	}

	public void setTpl(Integer tpl) {
		this.tpl = tpl;
	}

	public String getdLng() {
		return dLng;
	}

	public void setdLng(String dLng) {
		this.dLng = dLng;
	}

	public String getdLat() {
		return dLat;
	}

	public void setdLat(String dLat) {
		this.dLat = dLat;
	}

	public String getOpenCodes() {
		return openCodes;
	}

	public void setOpenCodes(String openCodes) {
		this.openCodes = openCodes;
	}
	
    public Byte getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

	public Long getCustomVip() {
		return customVip;
	}

	public void setCustomVip(Long customVip) {
		this.customVip = customVip;
	}

	public String[] getOpenCodeArray() {
		return openCodeArray;
	}

	public void setOpenCodeArray(String[] openCodeArray) {
		this.openCodeArray = openCodeArray;
	}

    public Date getStartEdate() {
        return startEdate;
    }

    public void setStartEdate(Date startEdate) {
        this.startEdate = startEdate;
    }

    public String[] getUids() {
        return uids;
    }

    public void setUids(String[] uids) {
        this.uids = uids;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }
}
