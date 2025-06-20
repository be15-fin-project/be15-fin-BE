package com.dao.momentum.approve.query.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApproveFileDTO {

    private String url;
    private String type;

}
