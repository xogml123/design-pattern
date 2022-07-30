package strategy.dao.userinfo.web;

import strategy.dao.userinfo.domain.dao.UserInfoDao;
import strategy.dao.userinfo.domain.dao.mysql.MysqlDao;
import strategy.dao.userinfo.domain.entity.UserInfo;

public class UserInfoController {

    private UserInfoDao userInfoDao;

    public UserInfoController(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }


    public void requestInsert(UserInfo userInfo1) {
        userInfoDao.insert(userInfo1);
    }
    public void requestDelete(String userId) {
        userInfoDao.delete(userId);
    }

    public void requestUpdate(UserInfo userInfo1) {
        userInfoDao.update(userInfo1);
    }
}
