package com.hw1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
    private Integer wid;
    private String wname;
    private String wsex;
    private String wtel;
    private Integer deptId;
    private String wimg;
}
