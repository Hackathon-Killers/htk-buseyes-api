package com.hackathonkiller.buseyesapi.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonAutoDetect
@Accessors(fluent = true)
@Getter
@Setter
@ToString
public class SearchParam {

    private String destKeyword;
    private String nowX;
    private String nowY;
}
