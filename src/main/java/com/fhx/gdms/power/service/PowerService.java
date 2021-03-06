package com.fhx.gdms.power.service;

import com.fhx.gdms.department.model.DepartmentModel;
import com.fhx.gdms.power.model.PowerModel;
import com.fhx.gdms.user.model.UserModel;

import java.util.List;

public interface PowerService {
    /**
     *  保存（base）
     * @param model
     * @return
     */
    PowerModel save(PowerModel model);

    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    PowerModel findById(Integer id);

    /**
     * 删除
     * @param id
     */
    PowerModel deleteById(Integer id);

    /**
     * 创建
     * @param model
     * @return
     */
    PowerModel savePower(UserModel model);

    /**
     * 系别id 查询
     * @param departmentId
     * @return
     */
    List<PowerModel> findByDepartmentId(Integer departmentId);

    /**
     * 更新（base）
     * @param model
     * @return
     */
    PowerModel update(PowerModel model);

    /**
     * userId 查询
     * @param userId
     * @return
     */
    PowerModel findByUserId(Integer userId);
}
