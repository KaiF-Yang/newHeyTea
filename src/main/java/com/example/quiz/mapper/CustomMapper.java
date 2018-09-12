package com.example.quiz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.quiz.Custom;


@Mapper
public interface CustomMapper {
	/**
	 * 添加会员
	 */
	@Insert("insert into custom(idcard,name,time) values(#{idcard},#{name},now())")
	void addcustom(Custom custom);
	
	/**
	 * 查询会员
	 */
	@Select("select * from custom order by integral desc")
	List<Custom> list();
	
	/**
	 * 根据Id查询会员
	 */
	@Select("select * from custom where idcard=#{idcard}")
	 Custom cus(String idcard);
	
	/**
	 * 更新积分
	 */
	@Update("update custom set integral=#{integral} where idcard=#{idcard}")
	void updataintegral(String idcard,int integral);
	
	
}

