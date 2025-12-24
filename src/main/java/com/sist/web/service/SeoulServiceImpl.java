package com.sist.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.SeoulMapper;
import com.sist.web.vo.SeoulVO;

import lombok.RequiredArgsConstructor;

/*
 *   DAO => Service는 dao 여러개 동시에 제어 
 *              | 
 *             BI
 *              
 */


@Service
@RequiredArgsConstructor
public class SeoulServiceImpl implements SeoulService{
	private final SeoulMapper mapper;
	
	@Override
	public List<SeoulVO> seoulListData(Map map) {
		return mapper.seoulListData(map);
	}

	@Override
	public int seoulTotalPage(Map map) {
		return mapper.seoulTotalPage(map);
	}

}
