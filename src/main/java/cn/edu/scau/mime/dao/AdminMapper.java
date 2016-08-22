package cn.edu.scau.mime.dao;

import cn.edu.scau.mime.entity.Admin;

/**
 * @author jet
 * @description TODO
 * @date 2016年8月18日
 * @version v1.0
 */
public interface AdminMapper {
  Admin findByAdminID(int adminId);
  Admin findByName(String name);
}
