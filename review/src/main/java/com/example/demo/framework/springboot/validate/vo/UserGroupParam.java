package com.example.demo.framework.springboot.validate.vo;

import com.example.demo.framework.springboot.validate.vo.group.EditValidationGroup;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author fanyangyang
 */
@Data
@Builder
public class UserGroupParam implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "{user.msg.userId.notEmpty}", groups = {EditValidationGroup.class}) // 这里
    private String userId;
}
