package com.imooc.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */


@Data   // 使用 lombok 简化Getter/Setter/toString/hashCode代码
@Entity
public class Girl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Cup大小不能为空")
    private String cupSize;

    @NotNull(message = "年龄不能为空")
    @Min(value = 18, message = "未成年少女禁止入内")
    private Integer age;

    @NotNull(message = "钱不能为空")
    private Double money;

}
