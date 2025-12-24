package com.sist.web.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.*;

@Mapper
@Repository
public interface BusanMapper {
	public List<BusanVO> busanListData(Map map);
	public int busanTotalPage(Map map);
}
