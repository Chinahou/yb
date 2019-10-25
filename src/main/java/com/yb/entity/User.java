package com.yb.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @author kh
 * @date 2019/10/25
 */
@Data
@TableName("yb_code_czydm")
public class User {

    private String czydm;
    private String czymm;
    private String czymc;
    private String ybzh;
    private String ybmm;
    private String czyqx;
    private String zxbz;
    private String glybz;
}
