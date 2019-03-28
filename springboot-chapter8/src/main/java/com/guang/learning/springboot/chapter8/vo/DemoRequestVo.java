package com.guang.learning.springboot.chapter8.vo;

import com.guang.learning.springboot.chapter8.annotation.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 请求参数VO
 */
@Data
@NoArgsConstructor  //自动生成无参数构造函数
@AllArgsConstructor //自动生成全参数构造函数
public class DemoRequestVo {

    @NotBlank(message = "code不能为空")
    String code;

    @NotBlank(message = "name不能为空")
    @Length(max = 10, message = "name长度不能超过10")
    String name;

    @Constant(message = "version只能是1.0", value = "1.0")
    String version;

    @Pattern(regexp = "^hello$", message = "参数不合法")
    String pattern;

}
