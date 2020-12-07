package com.hackathonkiller.buseyesapi.dto;

import com.hackathonkiller.buseyesapi.vo.SearchParam;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@Accessors(fluent = true)
@NoArgsConstructor(staticName = "Instance")
public class SearchResultOfAPI {

    SearchParam searchParam;
    String startStationName;
    String endStationName;
    List<BusInfo> busInfos;

    String stSrch;
    String arsId;
    String startX;
    String startY;
    String endX;
    String endY;
    String busRouteId;
    String startOrd;
    String endOrd;
    String tmX;
    String tmY;
    String radius;

    @Value("busApi.searchKey")
    String searchKey;

}
