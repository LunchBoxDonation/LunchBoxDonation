package com.lunchbox.lunchboxdonation.repository.lunchbox;

import com.lunchbox.lunchboxdonation.domain.lunchbox.LunchBoxDTO;
import com.lunchbox.lunchboxdonation.entity.Lunchbox.LunchBoxOption;
import com.lunchbox.lunchboxdonation.entity.Lunchbox.LunchBoxSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LunchBoxQueryDSL {
    
    //목록
    public Page<LunchBoxDTO> lunchBoxList(Pageable pageable, LunchBoxSearch lunchBoxSearch);

}