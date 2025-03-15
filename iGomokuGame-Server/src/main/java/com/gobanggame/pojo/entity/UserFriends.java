package com.gobanggame.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

import java.time.LocalDateTime;


@Data
@Schema(description = "user_friends表实体类")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserFriends {
    @Schema(description = "主键，自增")
    private Long id;

    @Schema(description = "用户id", example = "1")
    private Long userId;

    @Schema(description = "好友id", example = "3")
    private Long friendId;

    @Builder.Default //@Builder.Default 注解用于在构建器模式中为字段设置默认值（这里默认值为 0）
    @Schema(description = "逻辑删除字段", example = "1")
    private Integer deleted = 0;

    @Schema(description = "创建时间", example = "2023-03-15 12:00:00")
    private LocalDateTime createTime;

    @Schema(description = "删除时间", example = "2023-03-15 12:00:00")
    private LocalDateTime deletedTime;


}
