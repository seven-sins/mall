package com.macro.mall.dto;

import com.macro.mall.model.UmsPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by macro on 2018/9/30.
 */
public class UmsPermissionNode extends UmsPermission {
	private static final long serialVersionUID = 1L;
	@Getter
    @Setter
    private List<UmsPermissionNode> children;
}
