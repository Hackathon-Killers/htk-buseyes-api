package com.hackathonkiller.buseyesapi.dto;

import java.util.List;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@ToString
@NoArgsConstructor(staticName = "Instance")
public class SearchResult {

    String startStationName;
    String endStationName;
    List<BusInfo> busInfos;
}
