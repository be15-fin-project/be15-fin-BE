package com.dao.momentum.announcement.query.mapper;

import com.dao.momentum.announcement.query.dto.request.AnnouncementSearchCondition;
import com.dao.momentum.announcement.query.dto.response.AnnouncementDetailDto;
import com.dao.momentum.announcement.query.dto.response.AnnouncementDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnnouncementQueryMapper {

    AnnouncementDetailDto findAnnouncement(Long announcementId);

    List<AnnouncementDto> findAnnouncementsByCondition(AnnouncementSearchCondition searchCondition);

    long countAnnouncementsByCondition(AnnouncementSearchCondition searchCondition);

}