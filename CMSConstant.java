package com.xsk.cms.utils;
/**
 * 
 * @ClassName: CMSConstant 
 * @Description: 系统常量
 * @author: xsk
 * @date: 2019年7月18日 上午11:20:00
 */
public class CMSConstant {
	//ctrl+shift+x 变大写     ctrl+shift+y变小写
	//定义栏目的list的key
	public static final String REDIS_KEY_CHANNEL ="xsk_cms_channel_list";		
	//定义栏目的hash的key
	public static final String REDIS_KEY_CHANNEL_HASH ="xsk_cms_channel_hash";
	//定义栏目的hash中字段的key的前缀
	public static final String REDIS_KEY_CHANNEL_HASH_KEY ="xsk_cms_channel_hash_key_";
	
	public static final String RULE_ADMIN="1";//角色:管理员
	public static final String RULE_GENERAL="0";// 角色:普通用户
	public static final Integer USER_STATUS_UNLOCKED=0;// 用户可用状态 
	public static final Integer USER_STATUS_LOCKED=1;// 用户不可用
	
	public static final Integer ARTICLE_STATUS_NEW=0;// 文章刚发布
	public static final Integer ARTICLE_STATUS_CHECKED=1;// 文章已审核
	public static final Integer ARTICLE_STATUS_UNCHECKED=-1;// 文章未审核通过
	
	
	
	public static final String LOGIN_ADMIN="LOGIN_ADMIN";// 管理员登录的sessionkey
	public static final String LOGIN_GENERAL="LOGIN_GENERAL";//普通用户登录的sessionkey
	public static final String URL_ADMIN="/admin";//管理员的url
	public static final String URL_GENERAL="/my";//普通用户的的url
	

}
