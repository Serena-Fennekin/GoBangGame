package com.gobanggame.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@Schema(description = "Admin表实体类")  // swagger该注解用于描述类的用途
@NoArgsConstructor
@AllArgsConstructor
@Builder // 用于生成一个构建器模式的构造器,可以使用 Admin.builder().id(10001L).username("username123").build() 的方式创建对象。
public class Admin {

    @Schema(description = "管理员id", example = "10001") //在 API 文档中，id 字段会显示描述和示例值。
    private Long id;

    @Schema(description = "用户名", example = "username123")
    private String username;

    @Schema(description = "昵称", example = "nickname123")
    private String nickname;

    @Schema(description = "密码", example = "password123")
    private String password;

    @Schema(description = "头像url", example = "http://example.com/avatar.jpg")
    private String avatar;

    @Schema(description = "账号权限", example = "admin")
    private String type;

    @Schema(description = "当前员工账号状态", example = "true")
    private Boolean status;

    @Schema(description = "账号创建时间", example = "2023-12-17T14:33:00")
    private LocalDateTime createTime;
}
