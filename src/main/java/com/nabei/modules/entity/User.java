package com.nabei.modules.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/24 18:44
 * @Description:
 */
@TableName("user")
public class User implements Serializable{
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    private String name;

    private Integer age;


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
