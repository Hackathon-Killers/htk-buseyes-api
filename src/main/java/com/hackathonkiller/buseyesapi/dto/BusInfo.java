package com.hackathonkiller.buseyesapi.dto;

import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(fluent = true)
public class BusInfo {

    String busNum;
    String complex;
    String time;
}
