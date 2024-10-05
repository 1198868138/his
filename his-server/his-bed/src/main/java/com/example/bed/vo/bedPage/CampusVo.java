package com.example.bed.vo.bedPage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: hospital_xw
 * @Author: HBTTAY
 * @Date: 2024/5/6 16:37
 * @Version: 1.0-SNAPSHOT
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CampusVo {
    Long campusId;
    String campusName;
    List<OfficeVo> offices = new ArrayList<>();
}
